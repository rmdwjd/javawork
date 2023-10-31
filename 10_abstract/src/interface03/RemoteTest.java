package interface03;

public class RemoteTest {

	public static void main(String[] args) {
		// 인터페이스는 객체생성을 할 수 없다.
		// 형변환 가능
		RemoteControl rc = null;
		Audio rcAudio = new Audio();
		Tv rcTv = new Tv();
		
		rc = rcAudio;
		rc.turnOn();
		rc.setVolume(-200);
		rc.turnOff();
		
		rc = rcTv;
		rc.turnOn();
		rc.setVolume(400);
		rc.turnOff();
	
		//익명객체(새로운클래스정의)
		Tv tv = new Tv() {
			int a = 3;
			void tvShow() {
				System.out.println("익명객체 tvShow()메소드");
			}
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
				
			}
		};
		// 인터페이스 익명객체로 생성할 수 있다.
		// 단 한번만 사용할 때 만들어 사용
		RemoteControl rc2 = new RemoteControl() {
			//int volume = 0;
			@Override
			public void turnOn() {
				System.out.println("익명객체에서 라디오를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("익명객체에서 라디오를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME)
					volume = RemoteControl.MAX_VOLUME;
				else if(volume < RemoteControl.MIN_VOLUME)
					volume = RemoteControl.MIN_VOLUME;
				else
					volume = volume;
				System.out.println("익명객체의 TV의 볼륨은 : "+ volume);
			}
			
		};
		
		rc2.turnOn();
		rc2.setVolume(45);
		rc2.turnOff();
		System.out.println("=====================================");
		rc.setMute(true);
		System.out.println("=====================================");
		rc = new Radio();
		rc.turnOn();
		RemoteControl.info();
		rc.setMute(true);
		rc.turnOff();
		
	}

}
