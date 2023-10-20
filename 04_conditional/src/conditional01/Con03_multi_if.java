package conditional01;

import java.util.Scanner;

public class Con03_multi_if {

	public static void main(String[] args) {
		// 사용자로 부터 점수를 입력받아 학점 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score= scan.nextInt();
		
		if(score>100)
			System.out.println("100점 이상의 점수는 넣을 수 없습니다.");
		else if(score >= 90)
			System.out.println("A학점");
		else if(score >= 80)
			System.out.println("B학점");
		else if(score >= 70)
			System.out.println("C학점");
		else if(score >= 60)
			System.out.println("D학점");
		else if(score >= 0)
			System.out.println("F학점");
		else
			System.out.println("음수는 점수가 될 수 없습니다");
		
		if(score > 100 || score <0)
			System.out.println("점수를 잘못 입력하여습니다.");
		else if(score>=90 && score<=100)
			System.out.println("A학점");
		else if(score>=80 && score<90)
			System.out.println("B학점");
		else if(score>=70 && score<80)
			System.out.println("C학점");
		else if(score>=60&& score<=70)
			System.out.println("D학점");
		else if(score>=0 && score<60)
			System.out.println("F학점");
	
	}

}
