package polyEx09;

public class Frog extends Pet {
	Frog(){
		super("개구리", "초록색");
	}
	void sound() {
		System.out.println("개굴개굴");
	}
	void pattern() {
		System.out.println("없다");
	}
	@Override
	public String toString() {
		return "개구리";
	}
}
