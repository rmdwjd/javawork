package inSuper04;

class Phone {
	private boolean power;
	private int volume;
	
	public void power(){
		this.power=!power;
		if(power)
			System.out.println("phone on");
		else
			System.out.println("phone off");
	}
	public void volume(int x) {
		this.volume=x;
		System.out.println("볼륨 설정 : "+this.volume);
	}
	
}

class SmartPhone extends Phone {
	private String search;

	public void search(String search) {
		this.search = search;
		System.out.println(this.search+"를 검색합니다.");
	}
}

public class PhoneTest {

	public static void main(String[] args) {
			SmartPhone sp = new SmartPhone();
			sp.power();
			sp.volume(20);
			sp.search("python");
			sp.power();
		
	}

}
