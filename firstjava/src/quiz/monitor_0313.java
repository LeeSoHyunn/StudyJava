package quiz;

public class monitor_0313 {

	public static void main(String[] args) {
	

	}

}

class monitor {
	
	static final int MAX =100;
	
	//멤버변수 -속성
	public int hae;
	public int in;
	public int li;
	boolean power;
	
	
	//생성자
	public monitor(long hae, long in, int li, boolean power) {
		super();
		this.hae = MAX;
		this.in = MAX;
		this.li = MAX;
		this.power = false;
	}
	
	//전원 메서드
	public void PowerButton(){
		power = !power;
		
	}
	
}
