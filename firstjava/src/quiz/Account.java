package quiz;

public class Account {

		public String name;
		public int count;
		public String pwd;
		int price; //예금
		int price2; //이자
		
		
		public Account(String name,String pwd,int price) {
			this.name = name;
			this.pwd = pwd;
			this.price = price;
		}
		
		public void showPrice() { //예금확인
			System.out.println(price);
		}

}
