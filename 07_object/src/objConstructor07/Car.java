package objConstructor07;

public class Car {
	String company;
	String model;
	String color;
	int speed;
	
	Car(String company, String model, String color){
		System.out.println("생성자 호출");
		this.company = company;
		this.model = model;
		this.color = color;
		
	}
}
