package abs02;

public class PhoneTest {

	public static void main(String[] args) {
		Phone ph = new SmartPhone("j");
		ph.turnOn();
		ph.turnOff();
	
		FolderPhone fp = new FolderPhone("e");
		fp.messge("안녕하세요");
		
		
	}

}
