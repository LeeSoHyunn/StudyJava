package quiz;

public class Quiz_shop_240315 {

	public static void main(String[] args) {
		// Test
		Buyer b1 = new Buyer();
		b1.cash = 500000;
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Vaccine(69000, "V3"));
		
		b1.buyAll();
		System.out.println("============= 카트 정보 ================");
		b1.viewCart();
		System.out.println("============= 트렁크 정보 ==============");
		b1.viewTrunk();
		b1.addToCart(new Coffee(15000,"커피빈 원두"));
		b1.buyAll();
		
		b1.receipt();
		
		for (int i = 0; i <b1.t_index;i++) {
			Product p = b1.trunk[i];
			
			if (p instanceof Vaccine) {
				Vaccine v = (Vaccine)p;
				v.checkComputer();
			}else if(p instanceof Coffee) {
				Coffee c = (Coffee)p;
				c.drink();						
			}else {
				
			}
			
		}
	
	}

}


class Buyer {
	/*
	 *  Buyer의 인스턴스 변수(상태)
	 *   필요한 만큼 사용해보세요. 
	 *   멤버변수
	 */
	
	int cash; //금액
	
	//트렁크
	final int MAX_TRUNK_SIZE = 20;
	Product[] trunk = new Product[MAX_TRUNK_SIZE]; //트렁크
	int t_index = 0;
	
	//카트
	final int INIT_CART_SIZE = 3; //카트는 2의 배수로 들어남
	Product[] cart = new Product[INIT_CART_SIZE];
	int c_index = 0;
		
	
	/*
	 * 	Buyer의 기능(method)
	 *  1. 메서드명 : buy
	 *     기능 : 지정한 물건(Product)을 구입한다.
	 *       바이어의 돈(cash)에서 물건의 가격을 빼고, 
	 *       내 트렁크(trunk)에 담는다
	 *       만약 가진 돈이 부족하다면 구매할 수 없다. 
	 *     리턴타입 : 없음
	 *     매개변수 : Product p
	 * 
	 */
	
	//반환타입 없어서 void
	void buy(Product p) { //Product p 매개변수
		//구매 못하는 상황 1. 돈없을때 2.트렁크 공간이없을때
		if(cash < p.getPrice()) {
			System.out.println("가진 돈이 너무 적습니다.");
			return;  //void 타입에서는 실행하지않고 종료
		}else if(t_index == MAX_TRUNK_SIZE) {
			System.out.println("트렁크가 가득 찼습니다.");
			return;
		}
		cash -=p.getPrice();
		trunk[t_index++] = p;
	}

	/*
	 *  2. 메서드 명 : buyAll
	 *     기능 : 장바구니(cart)에 지정된 모든 물건을 구매(buy)한다.
	 *     리턴타입 : 없음
	 *     매개변수 : 없음, 
	 *     Product[] cart
	 *  
	 */
	
	void buyAll() { //매개변수없음
		//구매할수 없는 상황
		if(c_index - getNullCount() + t_index > MAX_TRUNK_SIZE) {
			System.out.println("구매하려는 물건이 너무 많습니다.");
			return;
		}
		//구매상황
		for(int i =0; i<c_index; i++) {
			if(cart[i] !=null ) {
				buy(cart[i]);
			}
		}
		
		clearCart(); //사면서 구매하면서 검증까지
	}
	
	int getNullCount() {
		//카트를 buyAㅣㅣ해서 사려고하는데 트렁크 공간이 부족, 카트는 2배수로 들어나는데 // 공간을 확인하기위해
		int count = 0;
		for(int i =0; i< c_index; i++) {
			if(cart[i] == null) count++;
		}
		return count;
	}


	private void clearCart() { //카트 비우기(cart를 다시 초기화)
		cart = new Product[INIT_CART_SIZE];
		c_index=0;
		
	}
	
	//구매 목록 보기...
	//트렁크, 카트에 뭐가 담겻는지 보기 위해
	private void viewList(Product[] pArr, int index) {//인덱스값을 넘겨주는 이유: t인덱스,c인덱스가 변경이 일어나니까		
		for(int i=0; i <index; i++) {
			Product p = pArr[i];
			System.out.printf(i+1+", 상품명[%s], 가격[%d]\n",p.getName(), p.getPrice());
		}
	}
	
	//트렁크 보기
	public void viewTrunk() {
		viewList(trunk, t_index);
		
	}
	
	//카트 보기
	public void viewCart() {
		viewList(trunk, c_index);
		
	}
	
	/*
	 * 	3. 메서드 명 : addToCart
	 *     기능 : 지정한 물건을 장바구니에 담는다
	 *          만약에 장바구니에 담을 공간이 부족하면
	 *          장바구니 배열의 크기를 2배로 늘린 다음에 담는다.
	 *     리턴타입 : 없음
	 *     매개변수 : Product p
	 */
	void addToCart(Product p) {
		//카트에 비어있는 공간이 있는 경우..
		for(int i = 0; i <c_index; i++) {
			if(cart[i] == null) {
				cart[i] = p; //넣음
				System.out.println("비어있는 곳"+i+"에 넣었습니다.");
				return; //비어있는 곳에 넣었으면 종료.
			}
		}
		//카트 공간이 없는 경우 : 2배 증가..
		if(c_index == cart.length) {
			Product[] newCart = new Product[cart.length*2];
			System.arraycopy(cart, 0, newCart, 0, cart.length); // 이전에 있는 카트에 값을 new 카트의값에 넣음
			cart = newCart;
		}
		
		//장바구니에 추가
		cart[c_index++] =p;
		
	}


	/*	4. 메서드 명 : cancel
	 *     기능 : 지정한 물건을 장바구니에서 뺀다. 
	 *         뺀 곳에는 다시 물건을 담을 수 있어야 한다.
	 *     리턴타입 : 없음
	 *     매개변수 : int cart_index
	 */

	void cancel(int cart_index) {
		cart[cart_index-1]= null;
	}
	
	/*  5. 매서드명 : receipt
	 * 	     기능 : 바이어가 구매한 물건의 목록과 사용금액 남은 금액(cash)을 출력한다. 
	 *     리턴타입, 매개변수 : 없음
	 */
	void receipt() {
		//구매한 목록
		viewTrunk();
		//사용 금액과 남은 금액
		System.out.println("사용 금액: "+ getTotalPrice(trunk, t_index));
		System.out.println("남은 금액: "+cash);
	}
	//사용금액
	int getTotalPrice(Product[] pArr,int index) {
		int price = 0;
		for(int i = 0; i <index; i++) {
			price += pArr[i].getPrice();
		}
		return price;
	}
}


/*	Product 클래스를 상속받아서 상품을 3개 이상 만들어 보세요!!!
 *  (단, Product 클래스를 변경하면 안됨!!!!)
 */
class Product{  // 부모 클래스 사용할 예정!!	
	String name;
	private int price; // private : 내 클래스 내부에서만 사용하려고 함.
	public Product(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
	class Coffee extends Product{

		//상속 받은 클래스는 생성자에게 반드시 부모 생성자를 호출.
		//(호출하지 않으면 기본타입으로 생략되어있음)
		
		//아무것도 적지 않은 생성자에는 super()가 생략되어있음...
		//Product라는 부모 클래스에는 기본 생성자가 없기 때문에..
		//super(int price) 타입을 가지는 생성자를 반드시 호출해야함
		
		public Coffee(int price, String name) {
			super(price);
			this.name = name;
		}
		
		void drink() {
			System.out.println("'"+name+"' 커피를 끓여 마셨습니다.");
		}
		
	}
	
	class SmartPhone extends Product{

		public SmartPhone(int price, String name) {
			super(price);
			this.name = name;
		}
	}
	
	class Vaccine extends Product{

		public Vaccine(int price, String name) {
			super(price);
			this.name = name;
		}
		
		void checkComputer() {
			System.out.println(name + "이 컴퓨터를 검사합니다.");
		}
		
	}
