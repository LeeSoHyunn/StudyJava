package _0327;

public class H05_ThreadEx4 {

	public static void main(String[] args) {
		// 통장 객체생성
		Account acc = new Account();
		
		//엄마 스레드 객체 생성
		Mother mother = new Mother(acc);
		//아들 스레드 객체 생성
		Son son = new Son(acc);
		
		mother.start();
		son.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
		
		//스레드 중지
		son.interrupt();
		mother.interrupt();

	}

}

//통장 클래스
class Account {
	int money;
	synchronized void withdraw() {
		while(money == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				break;   //예외가 발생하면 멈춰
			}
		}
		
		notifyAll();
		System.out.println(Thread.currentThread().getName()+money + "원 출금");  //돈 다뺌
		money = 0;
	}
	
	synchronized void deposit() {
		while(money > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				break;
			}
		}
		
		//랜덤 입금 1~5만원
		money = (int)((Math.random()*5)+1)*10000;
		notifyAll();    //입금함
		System.out.println();
		System.out.println(Thread.currentThread().getName()+money+"원 입금");
		
	}
}

//엄마 스레드
class Mother extends Thread {
	Account account;
	
	public Mother(Account account) {
		super("엄마");
		this.account = account;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				account.deposit();
				sleep((int)(Math.random()*2000));  //2초
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}

//아들 스레드
class Son extends Thread {
	Account account;
	
	Son(Account account){
		super("아들");
		this.account = account;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				account.withdraw();
				sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}