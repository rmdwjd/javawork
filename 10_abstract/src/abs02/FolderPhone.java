package abs02;

public class FolderPhone extends Phone{
	
	FolderPhone(String owner){
		super(owner);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰에서 전화를 받았습니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰에서 전화를 끊었습니다.");
	}
	public void messge(String msg) {
		System.out.println(msg+" 로 문자를 전송합니다.");
	}

}
