package polyEx09;

public class Cat extends Pet{
	Cat(){
		super("고양이", "검정색");
	}
	void sound() {
		System.out.println("야옹야옹");
	}
	void pattern() {
		System.out.println("턱시도");
	}
	
	@Override
	public String toString() {
		return "고양이";
	}
	
}
