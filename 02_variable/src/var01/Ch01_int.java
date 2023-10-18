package var01;

public class Ch01_int {

	public static void main(String[] args) {
		int num1;
		num1 = 10;
		System.out.println(num1);
		
		num1 = 30;
		System.out.println(num1);
		
		int num2 = 100;
		System.out.println(num2);
		System.out.println(num1);
		
		System.out.println("-------------------------------");
		
		System.out.println("30+100=" + (num1 + num2));
		System.out.println("100-30=" + (num2 - num1));
		System.out.println("100*30=" + num1 * num2);
		System.out.println("100/30=" + num2 / num1);
		
		System.out.println("-------------------------------");
		int result = num1 + num2;
		System.out.println(result);
		
		int result2 = result * 20;
		System.out.println(result2);
		
		System.out.println("-------------------------------");
		int result3 = result2 + 200;
		System.out.println(result3);
		
		result3 = result2 - 500;
		System.out.println(result3);
		
		result3 = result2 * 5;
		System.out.println(result3);
		
		result3 = result/2;
		System.out.println(result3);
	}

}
