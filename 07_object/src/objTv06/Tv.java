package objTv06;

public class Tv {
	//필드
	String company = "LG전자";
	String model ="올레드 TV";
	final int INCH = 55;
	int vol;
	int ch;
	boolean on;
	
	void on() {
		on = !on;
		if(on) {
			System.out.println("TV를 켰습니다");
		}
		else {
			System.out.println("TV를 껐습니다");
		}
	}
	int chUp() {
		ch += 2;
		return ch;
	}
	int chDown() {
		ch -= 2;
		return ch;
	}
	int volChange(int vol) {
		this.vol = vol;
		return this.vol;
	}
	
}
