package ex_1020;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int group = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		System.out.print("성별 (M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적 (소수점 둘쨰자리까지) : ");
		float score = sc.nextFloat();
		
		String g = gender=='M'?  "남" : "여"; 
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.", grade, group, num, name, g, score);
		
	}

}
