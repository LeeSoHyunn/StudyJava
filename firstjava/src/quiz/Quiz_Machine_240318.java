package quiz;

		/*
		 * ### 만능 리모컨 
		익명클래스 + 인터페이스 => 
		  익명클래스와 인터페이스를 함께 사용하면 상황에 따라 가변 가능한 코드를 만들 수 있습니다. 
		Machine이라는 클래스를 상속해서 에어컨, 컴퓨터, TV등의 여러가지 기계 클래스들이 존재한다고 가정!
		이때 어느 기계에도 적용 가능한 만들 리모콘을 만들어 보세요!!! 
		
		  Machine 클래스 
		   - 변수 : name
		   - 메서드 : machineWork -> 리모콘을 이용하여 On/Off기능을 동작함!
		   
		  TV, 컴퓨터, 에어컨 -> Machine을 상속받아서 이름만 동작하고, 일부 메서드는 알아서 작성하세요!!!
		
		  Main메서드가 있는 클래스를 생성하여 테스트 해보세요 ~~~ 
		 * */	
	interface Remocon {
		public void on();
		public void off();
	}
	
	class Machine {
		protected String name;

		//기본 생성자 생략
		
		//getter , setter
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public static void machineWore(Remocon remocon, Machine machine) {//전원을 껏다키는걸로 작업됨
			remocon.on();
			remocon.off();
		}
		
		
	}
	
	class TV1 extends Machine{
		public TV1(String name) {
			this.name = name;
		}
		
		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return super.getName();
		}
		
		@Override
		public void setName(String name) {
			// TODO Auto-generated method stub
			super.setName(name);
		}
		
		public void show() {
			System.out.println("방송중입니다.");
		}
	}
	
public class Quiz_Machine_240318 {
	public static void main(String[] args) {
		Machine tv = new TV1("TV");
		Machine computer = new Machine();
		computer.setName("컴퓨터");
		
		//TV 구동
		Machine.machineWore(new Remocon() {
			
			@Override
			public void on() {
				System.out.println(tv.getName()+"를 켭니다");
				
			}
			
			@Override
			public void off() {
				System.out.println(tv.getName()+"를 끕니다.");
			}
		}, tv);
		
		
		//computer 구동
		Machine.machineWore(new Remocon() {
			
			@Override
			public void on() {
				System.out.println(computer.getName()+"를 켭니다");
				
			}
			
			@Override
			public void off() {
				System.out.println(computer.getName()+"를 끕니다.");
			}
		}, computer);
	}

}
