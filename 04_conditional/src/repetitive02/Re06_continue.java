package repetitive02;

import java.util.Scanner;

public class Re06_continue {

	public static void main(String[] args) {
		// break : 반복문을 빠져나올 때
		// continue : continue하위의 실행문을 실행하지 않고 반복문을 다시 실행
		// 				~ 을 데외 할 대 많이 사용
		
		//1~100까지의 숫자중 3의 배수를 제외한 합계를 구하기
		int sum = 0;
		for(int i=-0; i<=100; i++) {
			if(i%3==0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1~100까지 3의 배수를 제외한 합계 = "+ sum);
		
		System.out.println("==========================================");		
		// 1~100 까지 3의 배수의 합 구하기
		int sum1 = 0;
		for(int i=-0; i<=100; i++) {
			if(i%3==0) {
				sum1 += i;
			}
			continue;
		}
		System.out.println("1~100까지 3의 배수의 합계 = "+ sum1);
		
		System.out.println("==========================================");		
		
		//사용자로부터 숫자를 양수를 입력받아 1~ 입력받은 숫자까지의 합계구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("양수를 입력해주세요 : ");
		int num = sc.nextInt();
		int sum2 = 0;
		for(int i=0; i<=num; i++ ) {
			sum2 += i;
		}
		System.out.println(num+"까지의 숫자 합계는 : "+sum2);
		
		System.out.println("==========================================");
		
		//1~100까지의 숫자를 랜덤으로 추출하고 사용자로부터 숫자를 입력받아 숫자 맞추기
		int com = (int)(Math.random()*100)+1;
		int user = 0;
		do {
			Scanner sc1 = new Scanner(System.in);
			System.out.print("숫자를 입력해주세요 (1~100) : ");
			user = sc1.nextInt();
			if(com==user)
				System.out.println("정답입니다");
			else if(com>user)
				System.out.println("더 큰 숫자를 입력해보세요");
			else if(com<user)
				System.out.println("더 작은 숫자를 입력해보세요");
		} while(com!=user);
		
		System.out.println("==========================================");
		
		//4. 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다. 
		Scanner sc2 = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력해주세요 : ");
		int num1 = sc2.nextInt();
		while(true) {
			if(num1<1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				continue;
			}
			for(int i=num1; i>=1; i--) {
					System.out.printf("%3d",i);
					
			}
			break;
		}
		
		System.out.println();
		System.out.println("==========================================");
		
		//5. 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
		Scanner sc3 = new Scanner(System.in);
		System.out.print("1이상의 숫자를 두개 입력해주세요 : ");
		int num2 = sc3.nextInt();
		int num3 = sc3.nextInt();
		if(num2<1 ||  num3<1)
			System.out.println("1 이상의 숫자를 입력해주세요");
		else {
			if(num2>num3)
			for(int i=num3; i<=num2; i++) {
				System.out.printf("%5d",i);
			}
			else {
				for(int i=num2; i<=num3; i++) {
					System.out.printf("%5d",i);
				}
			}
		}
		System.out.println();
		System.out.println("==========================================");
		
		boolean change = true;
		while(change) {
			System.out.print("두 수를 입력하세요 ex> 56 8 :");
			int no1= sc3.nextInt();
			int no2= sc3.nextInt();
			
			if(no1 == 0|| no2 == 0) {
				System.out.println("0보다 더 큰 숫자 입력");
				continue;
			}
				
			
//			if(no1> no2) {
//				for(int i=no2; i<=no1; i++)
//					System.out.print(i + "  ");
//			}else {
//				for(int i=no1; i<=no2; i++)
//					System.out.print(i + "  ");
//			}
//			change = false;
//			}
			if(no1>no2) {
				int tmp = no1;
				no1=no2;
				no2=tmp;
			} //자리바꿈
			for(int i=no1; i<=no2; i++)
				System.out.print(i + "  ");
			
			change = false;
		}
//		

		
	}

}
