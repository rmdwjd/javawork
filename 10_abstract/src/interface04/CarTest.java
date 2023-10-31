package interface04;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.run();
		System.out.println("--------------------------");
		
		myCar.backLeftTire = new KumhoTire();
		myCar.run();
	}

}
