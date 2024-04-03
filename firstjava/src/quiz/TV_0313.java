package quiz;

public class TV_0313 {

	public static void main(String[] args) {
		// TV클래스 만들기
				//채널 클래스의 기본 생성시 채널과 볼륨은 채널7, 볼륨 20
				// 최대 볼륨은 100, 최소볼륨 0, 채널의 최대 채널300, 채널의 최소 1
				// 이전 채널이 동작시 저장되어 있던 이전 채널로 이동
				// 채널 이동은 채널 정보를 입력받아서 채널 이동
				// 채널 이동 및 볼륨 조절은 전원 On인 상태에서 동작

				// - 속성(멤버변수) : 채널 , 볼륨, 전원, 이전채널
				// - 기능: 전원 ON/OFF , 볼륨 업/다운, 채널업/다운, 이전 채널이동,채널이동,
				//        TV현재 정보 확인(전원, 채널, 볼륨,저장된 이전 채널)
		
		//TV테스트
		TV tv1 = new TV();

		tv1.getTvInfo();
		tv1.channelUP();
		tv1.powerOnOff();
		tv1.getTvInfo();
		tv1.channelUP();
		tv1.getTvInfo();
		tv1.moveChannel(20);
		tv1.moveChannel(999);
		tv1.channelDown();
		tv1.prevChannel();
		tv1.prevChannel();

		tv1.getTvInfo();

		
	}

}

class TV {
	
	// TV 클래스 멤버 변수
		int channel;
		int prevChannel;
		int volume;
		boolean isPowerOn;

		// TV 클래스의 상수(final)
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		final int MAX_CHANNEL = 300;
		final int MIN_CHANNEL = 1;

		// 기본 생성자... 
		public TV() {
			channel = 7;
			volume = 20;
		}

		// TV 기능... 
		// 전원 : isPowerOn 값이 true면, false, false면 true
		void powerOnOff() {
			isPowerOn = !isPowerOn;
		}

		// # 볼륨업/다운, 채널업/다운(1씩 채널값 증감), 이전 채널이동(이전 채널 정보를 기준으로 이동)
		//  , 채널이동(입력된 채널로 이동), TV현재 정보 확인(전원, 채널, 볼륨, 저장된 이전채널)
		// # 정보확인 제외 모두 전원이 있어야 구동... 
		void volumeUp() {
			if(!isPowerOn) {
				System.out.println("전원이 꺼져있습니다.");
				return;  // void에서 리턴을 만나면 메서드 종료...
			}else if(volume == MAX_VOLUME){  // 볼륨이 최대이면 채널업 동작X 
				System.out.println("현재 볼륨이 최대입니다.");
				return;
			}

			volume ++;
			System.out.println("현재 볼륨은 " + volume + "입니다.");
		}

		void volumeDown() {
			if(!isPowerOn) {
				System.out.println("전원이 꺼져있습니다.");
				return;  // void에서 리턴을 만나면 메서드 종료...
			}else if(volume == MIN_VOLUME){  // 볼륨이 최대이면 채널업 동작X 
				System.out.println("현재 볼륨이 0입니다.");
				return;
			}

			volume --;
			System.out.println("현재 볼륨은 " + volume + "입니다.");
		}

		void channelUP() {
			if(!isPowerOn) {
				System.out.println("전원이 꺼져있습니다.");
				return;
			}

			//이전 채널
			prevChannel = channel;

			if(channel == MAX_CHANNEL) {
				channel = MIN_CHANNEL;
			}else {
				channel ++;
			}

			System.out.println(channel + "CH");

		}

		void channelDown() {
			if(!isPowerOn) {
				System.out.println("전원이 꺼져있습니다.");
				return;
			}

			//이전 채널
			prevChannel = channel;

			if(channel == MIN_CHANNEL) {
				channel = MAX_CHANNEL;
			}else {
				channel --;
			}

			System.out.println(channel + "CH");

		}

		boolean moveChannel(int ch) {
			if(!isPowerOn) {
				System.out.println("전원이 꺼져있습니다.");
				return false;
			}

			if(ch >= MIN_CHANNEL && ch <= MAX_CHANNEL) {
				prevChannel = channel;
				channel = ch;
				System.out.println(ch +  "CH");
				return true;
			}else {
				System.out.println("존재하지 않는 채널을 입력했습니다.");
				return false;
			}

		}

		void prevChannel() {
			if(!isPowerOn) {
				System.out.println("전원이 꺼져있습니다.");
				return;
			}else if(prevChannel == 0) {
				System.out.println("이전 채널이 없음");
				return;
			}

			int temp = channel;
			channel = prevChannel;
			prevChannel = temp;

			getTvInfo();  //TV현재 상태 정보 확인.... 
		}

		void getTvInfo() {
			System.out.println("전원 : "+isPowerOn);
			System.out.println("채널 : "+channel);
			System.out.println("볼륨 : "+volume);
			System.out.println("저장된 이전 채널 : "+prevChannel);
		}
}


