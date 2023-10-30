package polymorphism07;

public class Car {
	boolean power;
	String model;
	String color;
	final int MAX_SPEED = 300;
	int speed;
	
	Car() {
		this("EIE2023", "white");
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	void getPower() {
		power = !power;
		if(power) {
			System.out.println("차를 운행합니다.");
		}
		else
			System.out.println("차가 멈춥니다.");
	}
	void speedUp() {
		speed += 10;
	}
	void speedDown() {
		speed -= 10;
	}
	    
	
	String info() {
		return "모델 : " + model + ", 색상 : "+ color + ", 현재속도 : "+speed;
	}
	
}
