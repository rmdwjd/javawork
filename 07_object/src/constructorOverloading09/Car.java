package constructorOverloading09;

public class Car {
	String company;
	String model;
	String color;
	int speed;
	
	//생성자 오버로딩
	// this() -> 다른 생성자 호출 (매개변수의 갯수와 자료형을 가져온다)
	Car(){
		this("삼성", "sm5", "흰색");
		System.out.println("매개변수 없는 생성자");
		}

	Car(String company){
		this.company = company;
		System.out.println("매개변수 1개인 생성자");
	}
	
	Car(String companay, String model){
		System.out.println("매개변수 2개인 생성자");
		this.company = company;
		this.model = model;
	}
	
	/*Car(String color, String company){
		System.out.println("매개변수 2개인 생성자");
		this.company = company;
		this.model = model;
	} -> 자료형이랑 매개변수 개수가 같아서 오류난다*/
	
	Car(String company, String model, String color){
		System.out.println("매개변수 3개인 생성자");
		this.company = company;
		this.model = model;
		this.color = color;
		
	}
}
