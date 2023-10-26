package objConstructor07;

public class Car {
	String company;
	String model;
	String color;
	int speed;
	
	{
		company ="대우";
		model = "kk";
		color ="검정";
		speed = 1;
	}
	
	Car(String company, String model, String color){
		System.out.println("생성자 호출");
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	static String companys;
	static String models;
	static String colors;
	static int speeds;
	static {
		companys ="대우";
		models = "kk";
		colors = "검정";
		speeds = 1;
	}
}
