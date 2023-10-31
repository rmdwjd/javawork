package interface03;

public interface RemoteControl {
	//상수
	public static final int MAX_VOLUME = 100;
	// public static final 을 붙이지 않으면 컴파일시 자동으로 붙인다.
	int MIN_VOLUME = 0;
	
	
	public abstract void turnOn();
	//public abstract붙이지 않으면 컴파일시 자동으로 붙인다.
	void turnOff();
	void setVolume(int volume);
	//default 메소드는 실행문을 넣을 수 있다.
	//재정의하지 않으면 아래 메소드 실행, 재정의하면 재정의한 메소드 호출
	default void setMute(boolean mute) {
		System.out.println("나중에 추가된 메소드");
		if(mute)
			System.out.println("무음처리 완료");
		else
			System.out.println("무음처리 해제");
	}
	//static 메소드 : 실행문 넣을수 있다
	static void info() {
		System.out.println("static() 메소드 호출 기능");
	}

}
