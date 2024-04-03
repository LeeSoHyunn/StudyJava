
public class AccountExample {

	public static void main(String[] args) {
		// Account 클래스를 테스트하기 위한 메인 메서드
		
		Account acc1 = new Account("홍길동", "010-1111-2222", "abcd", 100000);
		
		System.out.println("잔액확인 : " + acc1.getBalance());
		//입금 : 만원
		acc1.saveMoney(10000);
		System.out.println("1만원 입금 후 잔액확인: " +acc1.getBalance());
		acc1.withdrawMoney(70000);
		System.out.println("7만원 출금 후 잔액확인: " +acc1.getBalance());
	}

}

class Account{
	/*
	 * 클래스명 : account
	 * 속성(명사적 특성) : 이름, 계좌번호,패스워드, 예금, 이자
	 * 기능(동사적 특성) : 입금, 출금, 예금확인
	 * 생성자: 이름, 계좌번호, 패스워드, 예금을 이용한 오버로딩
	 * */
	
	//필드, 속성, 매개변수
	public String name;
	public String account;
	public String pwd;
	public long balance; //예금
	public float interest; //이자
	
	//생성자
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Account(String name, String account, String pwd) {
		super();
		this.name = name;
		this.account = account;
		this.pwd = pwd;
	}


	public Account(String name, String account, String pwd, long balance) {
		super();
		this.name = name;
		this.account = account;
		this.pwd = pwd;
		this.balance = balance;
	}
	
	//메서드
	//예금하다
	public void saveMoney(long amount) {
		balance = balance + amount; // balance += amount
	}
	//출금하다
	public void withdrawMoney(long amount) {
		balance -=amount;
	}
	
	//잔액확인
	public long getBalance() {
		return balance;
	}
	
}
