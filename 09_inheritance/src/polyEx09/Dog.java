package polyEx09;

public class Dog extends Pet{
	Dog(){
		super("강아지", "하얀색");
	}
	void sound() {
		System.out.println("멍멍");
	}
	void pattern() {
		System.out.println("민무늬?");
	}
	
	@Override
	public String toString() {
		return "강아지";
	}
}
