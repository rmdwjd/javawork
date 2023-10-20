package ex_1020;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("주민번호를 입력해주세요 (-포함) : ");
		char gender = sc.next().charAt(7);
		String re = (gender=='1'|| gender=='3') ? "남자" : "여자";
		System.out.println(re);
		
	}
	
}
