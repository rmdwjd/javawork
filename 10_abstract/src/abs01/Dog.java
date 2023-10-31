package abs01;

public class Dog extends Pet {
	Dog(String color){
		super ("강아지", color);
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	
	// 추상메소드는 반드시 오버라이딩하여 구현해야한다.
	//만약 구현 내용이 없으면 빈채로 나두어도 된다.
	
	@Override
	public void pattern() {
		// TODO Auto-generated method stub
		
	}
}
