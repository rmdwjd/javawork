package abs02;

public class SmartPhone extends Phone {
	
	SmartPhone(String owner){
		super(owner);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("폴더폰에서 전화를 받았습니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("폴더폰에서 전화를 끊어습니다.");
	}
	
	
}
