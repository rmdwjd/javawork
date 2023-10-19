package ex_1019;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수를 입력해주세요 : ");
		int k = scan.nextInt();
		System.out.print("영어 점수를 입력해주세요 : ");
		int e = scan.nextInt();
		System.out.print("수학 점수를 입력해주세요 : ");
		int m = scan.nextInt();
		System.out.printf("국어 : %d\n영어 : %d\n수학 : %d\n",k, e, m);
		int sum = k+e+m;
		System.out.printf("총점 : %d\n",sum);
		double avg = (double)sum/3;
		System.out.printf("평균 : %.2f", avg);

	}

}
