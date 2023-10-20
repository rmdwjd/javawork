package repetitive02;

import java.util.Scanner;

public class Re02_중첩for {

	public static void main(String[] args) {
		// 중첩 for문
		for(int i=1; i<=3; i++) {
			for(int j=5; j<=10; j++) {
				System.out.println("i = "+i+", j = "+j);
			}
			System.out.println();
		}
		//구구단 2단 출력
		for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++ ) {
				System.out.println(dan + " * " + i+" = "+ dan*i );
			}
			System.out.println();
		}
		
		//구구단 가로로 출력
		for(int i=1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {
//				System.out.println(dan + " * " + i+" = "+ dan*i );
				System.out.printf("%d * %d = %2d\t", dan, i, dan*i);
			}
			System.out.println();
		}
		System.out.println();
		
		// 키보드로 정수 두개를 입력 받아 두 정수 중 작은 값을 시작값으로 큰 값을 종료값으로 사용 작은값에서 큰값까지의 정수 합계를 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하세요 (단, 두번째 숫자는 무조건 첫번째 숫자보다 큰 숫자를 입력하세요 ex: 5 100 ): ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		for(int i=num1; i<=num2; i++) {
			System.out.printf("%3d + %3d = %3d\n", sum, i, sum+i );
			sum += i;
		}
		System.out.printf("%3d에서 %3d까지 정수의 합 : %3d \n", num1, num2, sum );

		// 정수를 하나 입력 받아 그 수가 양수일 때만 입력된 수를 줄 수로 적용하여 아래와 같이 출력
		/*
			ex 
			정수입력 : 5
			*
			**
			***
			****
			*****
		*/
		System.out.println();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num3 = sc1.nextInt();
		if(num3<0)
			System.out.println("양수가 아닙니다.");
		for(int i=0; i<num3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		sc1.close();
	}
}
