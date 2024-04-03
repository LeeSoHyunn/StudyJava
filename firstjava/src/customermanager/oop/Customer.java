package customermanager.oop;

public class Customer {
	//멤버변수(속성)
	
	 //클래스 내에서는 볼수 있음 클래스밖에서는 못봄
	private String name;
	private String gender;
	private String email;
	private int birthYear;
	
	
	public Customer() { }//기본생성자


	public Customer(String name, String gender, String email, int birthYear) { //필드생성자
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}
	
	//Getter, Setter 데이터를 주고받음

	public String getName() {
		return name;
	}


	public String getGender() {
		return gender;
	}


	public String getEmail() {
		return email;
	}


	public int getBirthYear() {
		return birthYear;
	}


	public void setName(String name) { //반환값은 없음
		this.name = name;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}


	@Override
	public String toString() {//프린트
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ", birthYear=" + birthYear + "]";
	}
	
	//equals()를 OVerride하여 비교할 수 있게 만들어보세요!
	@Override
	public boolean equals(Object obj) {
		//동일객체확인
		if(this == obj) {
			return true;
		}
		//null값확인
		if(obj == null) return false;
		if(getClass() != obj.getClass())return false;
		Customer other = (Customer)obj;
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}else if(!name.equals(other.name))return false;
		if(!gender.equals(other.gender)) return false; //!같지않다면
		if(!email.equals(other.email)) return false;
		if(!(birthYear == other.birthYear)) return false;
		return true;
	}
	 
	
}
