package ex_1018;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num1 = scan.nextInt();
		System.out.print("정수를 입력해주세요 : ");
		int num2 = scan.nextInt();
		
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
		System.out.println(num1+" / "+num2+" = "+(num1/num2));
		
		scan.close();
		
	}

}
