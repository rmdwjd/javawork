package polyEx09;

public class PetTest {

	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		Frog f = new Frog();
		
		Introduce into = new Introduce();
		
		into.pkind(c);
		into.pkind(d);
		into.pkind(f);
		
		into.pintro();
		
	}

}
