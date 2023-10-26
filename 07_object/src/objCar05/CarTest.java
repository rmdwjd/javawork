package objCar05;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car fCar = new Car();
		
		fCar.setCompany("기아자동차");
		fCar.model="k9";
		fCar.color="흰색";
//		fCar.MAX_SPEED = 250; 상수로 설정해서 바꿀 수 없다.
		
		System.out.println("--------내차 정보-----------");
		System.out.println("회사 : "+ myCar.getCompany());
		System.out.println("모델 : "+ myCar.model);
		System.out.println("컬러 : "+ myCar.color);
		System.out.println("최고속도 : "+ myCar.MAX_SPEED);
		
		System.out.println();
		
		System.out.println("-------친구차 정보---------");
		System.out.println("회사 : "+fCar.getCompany());
		System.out.println("모델 : "+fCar.model);
		System.out.println("컬러 : "+fCar.color);
		System.out.println("최고속도 : "+fCar.MAX_SPEED);
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		System.out.print("내 차를 ");
		myCar.run();
		System.out.println("내 차의 현재속도 : "+myCar.speedUp(30));
		System.out.println("내 차의 현재속도 : "+myCar.speedUp(50));
		System.out.println("내 차의 현재속도 : "+myCar.speedDown(20));
		System.out.print("내 차 ");
		myCar.run();
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		System.out.print("친구 차를 ");
		fCar.run();
		System.out.println("친구 차의 현재속도 : "+fCar.speedUp(80));
		System.out.println("친구 차의 현재속도 : "+fCar.speedUp(100));
		System.out.println("친구 차의 현재속도 : "+fCar.speedDown(60));
		System.out.print("친구 차 ");
		fCar.run();
		
	}

}
