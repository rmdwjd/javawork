package objMethod04;

public class MethodTest {

	public static void main(String[] args) {
		Arithmetic ari = new Arithmetic();
		int add = ari.add(5, 15);
		System.out.println("5 + 15 = "+add);
		
		int sub = ari.subtract(10, 5);
		System.out.println("10 - 5 = "+sub);
		
		int multi = ari.mult(5, 8);
		System.out.println("5 * 8 = "+multi);
		
		double div = ari.divide(82, 4);
		System.out.println("82 / 4 = "+div);
		
		int rem = ari.remain(44, 5);
		System.out.println("44 % 5 = "+rem);
	}

}
