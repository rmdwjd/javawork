package ex_1020;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		String re = age<=13 ? "어린이" : age <= 19 ? "청소년" : "어른";
		System.out.println(re);
		
	}
}
