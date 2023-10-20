package ex_1020;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("국어 : ");
		int k = sc.nextInt();
		System.out.print("영어 : ");
		int e = sc.nextInt();
		System.out.print("수학 : ");
		int m = sc.nextInt();
		
		int sum = k+m+e;
		double avg = sum/3.0;
		System.out.println("합계 : "+ sum);
		System.out.printf("평균 : %.2f\n", avg);
		String re = k>= 40 && e>=40 && m>=40 && avg>=60 ? "합격" :"불합격";
		System.out.println(re);

	}

}
