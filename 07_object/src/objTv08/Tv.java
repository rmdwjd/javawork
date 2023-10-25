package objTv08;

public class Tv {
	String company;
	String model;
	int inch;
	int volume;
	int channel;
	
	Tv(String company, String model, int inch){
		System.out.println("생성자 호출");
		this.company = company;
		this.model = model;
		this.inch = inch;
	}
	int channelUp() {
		channel += 2;
		return channel;
	}
	int channelDown() {
		channel -=2 ;
		return channel;
	}
	int volume(int volume) {
		this.volume = volume;
		return this.volume;
	}
}
