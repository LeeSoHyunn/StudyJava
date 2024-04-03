package mariaDB;

public class PersonsVO1 {
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private String city;
	
	
	public PersonsVO1() {
		// TODO Auto-generated constructor stub
	}

	//생성자
	public PersonsVO1(int id, String firstname, String lastname, int age, String city) {
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.age = age;
		this.city = city;
	}

	//getter, setter
	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "[id : "+id+",lastname : "+lastname+",firstname : "+firstname+","
				+ ", age : "+age+", city : "+city+"]";
	}
	
	

}
