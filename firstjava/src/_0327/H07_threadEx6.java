package _0327;

public class H07_threadEx6 {
/*
	[스레드 그룹]
		스레드 그룹은 관련되어 있는 스레드 별로 그룹핑해서 다루기 위해서 사용
		그룹 안에 또 다른 그룹을 생성하는 것도 가능함.
		보안상 이유로 자신과 하위 그룹을 변경이 가능함. 하지만 다른 그룹은 불가능함.
		
	[관련 메서드들]
		- activeCount()       : 현재 그룹 및 하위 그룹의 모든 스레드 수 리턴
		- activeGroupCount()  : 현재 그룹의 모든 하위 그룹 수를 리턴 
		- checkAccess()       : 스레드 그룹을 변경할 권한이 있는지 여부 리턴
		- destroy()			  : 현재 그룹의 모든 하위 그룹 삭제
		- isDestroyed()   	  : 현재 그룹이 삭제되었는지 여부확인
		- getMaxPriority()    : 현재 그룹의 스레드가 가질 수 있는 최대 우선순위값 리턴
		- setMaxPriority(int priority)  : 최대 우선순위값 설정
		- getName()      				: 현재 그룹의 이름 리턴
		- getParent()					: 현재 그룹의 부모 그룹리턴
		- parentOf(ThreadGroup g)       : 현재 그릅이 g의 부모 그룹인지 여부 리턴
		- isDaemon()					: 데몬 그룹인지 여부 리턴
		- setDaemon()
		- list()
		- interrupt()
		
*/
	public static void main(String[] args) {
		// 그룹 스레드 설정
		//1.그룹 객체 생성
		ThreadGroup group = new ThreadGroup("Group1");
		//2. 스레드 그룹에 스레드 추가
		Mythread t1 = new Mythread(group, "First");
		Mythread t2 = new Mythread(group, "Second");
		Mythread t3 = new Mythread(group, "Third");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		
		//모든 스레드 중지
		group.interrupt();
		
		System.out.println("그룹 스레드 숫자 : " +group.activeCount());
		System.out.println("하위 그룹 숫자 : " +group.activeGroupCount());
		group.destroy();  //하위그룹 삭제
		System.out.println(group.isDestroyed());
		System.out.println(group.getParent());
		group.list();
	}

}

class Mythread extends Thread {
	
	public Mythread(ThreadGroup group, String name) {
		super(group, name);
	}
	
	@Override
	public void run() {
		while (true) {
			System.out.println(getName());
			try {
				sleep(500);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted 발생");
				break;
			}
		}
		System.out.println(getName() + " 종료");
	}
}
