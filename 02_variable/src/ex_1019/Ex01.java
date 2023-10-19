package ex_1019;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String ch = scan.next();
		char ch1 = ch.charAt(0);
		char ch2 = ch.charAt(1);
		char ch3 = ch.charAt(2);
		System.out.println("첫번째 문자 "+ch1);
		System.out.println("두번째 문자 "+ch2);
		System.out.println("세번째 문자 "+ch3);
	}

}
