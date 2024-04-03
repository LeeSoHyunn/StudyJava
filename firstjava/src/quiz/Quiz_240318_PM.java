package quiz;


interface Feed {
	String getFood();
	
}

class Carnivore{ //육식
	
}

class Herbivore{ //초식
	
}

class Deer extends Herbivore implements Feed{ //사슴
	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "건초";
	}
}

class Lion extends Carnivore implements Feed{ //사자
	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "고기";
	}
}

class Zookeaper{//사육사
	public void feed(Feed feed) {
		System.out.println(feed.getFood()+"를 줍니다.");  //인터페이스 활용
}
}


public class Quiz_240318_PM {

	public static void main(String[] args) {
		Zookeaper zk = new Zookeaper();
		Lion lion = new Lion();
		Deer deer = new Deer();
		zk.feed(deer);
		zk.feed(lion);

	}

}
