

/*
 * ## 내부 클래스(inner Class)
 : 클래스안에 또 클래스를 선언하는 경우

>> 존재 유무에 따라서 4가지 형태로 나눔
 - 멤버 이너 클래스 : 클래스 안에 멤버로 존재하는 형태 
 - 로컬 이너 클래스 : 메서드 또는 블록 안에 존재하며 이름이 있는 형태
 - 익명 클래스 : 메서드 또는 블록 안에 존재하지만 이름이 없는 형태
 - 정적 중첩 클래스 : 멤버 이너 클래스에 static이 붙은 형태
 
 >> 사용하는 경우 
  - 코드 캡슐화 : 프로그램에는 수많은 클래스들이 필요. 일정 범위 이상의 역할을 하지 않는 클래스는 
           굳이 클래스 형태로 작성할 필요가 없음. 작성하게 된다면 많은 클래스로 인해 코드 파악, 유지 및 보수가 어렵다.
  - 클래스간의 의존성이 높은 경우 : B라는 클래스가 A라는 클래스에 의해 항상 호출되어야 하지만, 따로 클래스화하기
      애매한 코드일 경우 내부 클래스를 사용하면 깔끔한 코드 작성이 가능하다... 
      
 * -------------------------------------------------------------------------
 *  JAVA GUI란?
 *  - 프로그램을 그래픽화(프레임화)시켜 작동시키는 것.
 *    AWT(만들기 쉽고, 무겁다), Swing(만들기 어렵고, 가볍다)패키지를 이용해서 프레임창 구현
 *  - Frame 또는 JFrame 클래스를 이용해 프레임 창을 구현. 프레임 창 구현 후에 각종 이벤트
 *  처리 및 버튼, 패널, 입력창, 메뉴바, 속성 같은 구성 요소들을 각 클래스들을 이용해서 구현.
 *  
 *  - Frame(A)클래스가 각종 구성요소(B) 클래스들을 전부 호출. 구성요소(B)클래스들은
 *    프레임 창별로 달라지기 때문에 개별 클래스화 한다면 여러 측면에서 낭비 -> 내부 클래스 사용.*/


// - 멤버 이너 클래스 : 클래스 안에 멤버로 존재하는 형태 
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class D04_java_gui {

	//프레임 멤버 intance 변수
	private Frame f;
	
	public D04_java_gui() {
		f = new Frame("Inner 클래스를 위한 AWT 확인!-내부클래스");
	}
	
	public void launchFrame() {
		f.addWindowListener(new MyWindowAdapter()); //(new MyWindowAdapter() 객체 만들어서 집어넣음
		f.setSize(640, 480);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		D04_java_gui dj = new D04_java_gui();
		dj.launchFrame();
	}
	
	
	//멤버 Inner 클래스..
	private class MyWindowAdapter extends WindowAdapter{
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("X를 클릭했어요...");
			System.exit(0);  //프로그램 종료..
		}
	}

}
