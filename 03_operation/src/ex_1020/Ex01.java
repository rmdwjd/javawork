package ex_1020;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		String re = num >= 0 ? "음수가 아니다" : "음수";
		System.out.println(re);
		
	}

}