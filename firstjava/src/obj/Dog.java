package obj;

public class Dog implements Comparable<Dog>{//Comparable<Dog> 도그를 비교하겟다
	
	//객체 동등 비교를 위한 Dog 클래스..
	
	@Override
		public int compareTo(Dog o) {
			// 두 객체간에 비교 값을 지정
		return this.weight -o.weight; //몸무게를 기준으로 정렬
		}
	
	String dogId;
	String dogName;
	int weight;
	
	
	//생성자
	public Dog(String dogId, String dogName, int weight) {
		super(); //object();
		this.dogId = dogId;
		this.dogName = dogName;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Dog[dogId =" +dogId+", dogName="+dogName+"]" + this.hashCode();
	}

	//setter
	public void setDogId(String dogId) {
		this.dogId = dogId;
	}

	public String getDogId() {
		return dogId;
	}

	public String getDogName() {
		return dogName;
	}

	public int getWeight() {
		return weight;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	

	@Override
	public boolean equals(Object obj) {
		if(this ==obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		//객체 내 정보 확인..
		Dog other =(Dog)obj;
		if(dogId == null) {
			if(other.dogId != null) {
				return false;
			}else if(dogId.equals(other.dogId)) {
			return false;
			}
		}
		if(dogName == null) {
			if(other.dogName !=null) {
				return false;
			}else if(!dogName.equals(other.dogName)) {
				return false;
			}
		}
		if(weight!= other.weight) return false;
		return true;
	}
	public int hashCode() {
		final int prime=31;
		int result = 1;
		result = prime * result + ((dogId == null)? 0: dogId.hashCode()); //멤버 3개를 다 비교
		result = prime * result + ((dogName == null)? 0: dogName.hashCode());
		return result;
	}
	
	
	
}
