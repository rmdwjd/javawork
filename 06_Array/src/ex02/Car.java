package ex02;

public class Car {
	//필드
	public String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	final int MAX_SPEED = 350;
	int speed;
	boolean run;
	
	//메소드
	void run() {
		run = !run;
		if(run) {
			System.out.println("출발합니다. 붕붕");
		}
		else
			System.out.println("운행을 멈춥니다.");
	}
	/*
	int speedUp() {
		++speed;
		return speed;
	}
	int speedDown() {
		--speed;
		return speed;
	}
	*/
	
	int speedUp (int speed) {
		this.speed = speed;
		return this.speed;
	}
	int speedDown(int speed) {
		this.speed = speed;
		return this.speed;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
