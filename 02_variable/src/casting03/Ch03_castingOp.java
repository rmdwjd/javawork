package casting03;

public class Ch03_castingOp {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		
		byte result = (byte)(b1 + b2);
		int result2 = b1+b2;
		
		System.out.println(result);
		System.out.println(result2);
	
		char c1 = 'A';
		char c2 = (char)(c1+ 1);
		int c3 = c1 + 1;
		System.out.println(c2);
		System.out.println(c3);
		
		int int1 = 100;
		int int2 = 3;
		int result3 = int1 / int2;
		System.out.println(result3);
		
		int int3 = 100;
		double dou1 = 3;
		double result4 = int3/dou1;
		int result5 = (int)(int3/dou1);
		System.out.println(result4);
		System.out.println(result5);
	
	}

}
