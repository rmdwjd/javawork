package ex03;

import java.util.Scanner;

public class Ch03_ex {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("가로를 입력해주세요 : ");
		double num1 = scan.nextDouble();
		System.out.print("세로를 입력해주세요 : ");
		double num2 = scan.nextDouble();
		
		System.out.println("면적은 "+num1+" * "+num2+" = "+(num1*num2));
		System.out.println("둘레는 "+"("+num1+" + "+num2+")"+" * "+" 2 = "+ (num1+num2)*2);
		
		scan.close();
	}
}
