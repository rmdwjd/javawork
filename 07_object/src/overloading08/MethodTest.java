package overloading08;

public class MethodTest {

	public static void main(String[] args) {
		Arithmetic am = new Arithmetic();
		int add = am.plus(5, 15);
		System.out.println("5 + 15 = "+add);
		
		int sub = am.minus(10, 5);
		System.out.println("10 - 5 = "+sub);
		
		int multi = am.mult(5, 8);
		System.out.println("5 * 8 = "+multi);
		
		double div = am.divide(82, 4);
		System.out.println("82 / 4 = "+div);
		
		int rem = am.remain(44, 5);
		System.out.println("44 % 5 = "+rem);
		System.out.println("========================");
		
		am.plus(89);
		am.plus(89.56 , 67);
		am.plus(80, 68.8);
		System.out.println("========================");
		am.minus(89);
		am.minus(89.56 , 67.55);
		am.minus(80, 68.8);
		System.out.println("========================");
		am.mult(89);
		am.mult(89.56 , 67);
		am.mult(80, 68.8);
		System.out.println("========================");
		am.divide(89);
		am.divide(89.56 , 67);
		am.divide(80, 68.8);
	}

}
