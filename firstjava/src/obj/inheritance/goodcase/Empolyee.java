package obj.inheritance.goodcase;

import obj.inheritance.Person;

public class Empolyee extends Person {
	public String companyId;
	public String department;
	
	public Empolyee() {}
	
	
	
	public Empolyee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}



	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "[이름: " + name + "\t나이 : "+ age + "\t사번: "+ companyId+"\t부서: "+department+"]";
	}

}
