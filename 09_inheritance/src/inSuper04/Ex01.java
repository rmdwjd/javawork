package inSuper04;

import java.util.Scanner;

public class Ex01 {
	private int num1 = 30;
	private int num2 = 20;
	private String name;
	private boolean flag;
	private double numDou;
	
	int Plus() {
		return num1 + num2;
	}
	double divide() {
		return (double)num1/(double)num2;
	}
	int MaxNum(int x, int y) {
		if(x>y) { 
			return x;
		}			
		else { 
			return y;
		}
	}
	int EvenSum(int x, int y) {
		int count = 0;
		for(int i =x; i<=y; i++) {
			if(i%2==0){
				System.out.print(i+"\t");
				count++;
			}
		}
		return count;
	}
	void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력: ");
		int x = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력: ");
		int y = sc.nextInt();
		
		System.out.print("연산자를 입력(+,-,*,/,%): ");
		String a = sc.next();
		
		
		if(a.equals("+")) {
			System.out.printf("%d + %d = %d", x, y, (x+y));
		}
		else if(a.equals("-")) {
			System.out.printf("%d - %d = %d", x, y, (x-y));
		}
		else if(a.equals("*")) {
			System.out.printf("%d * %d = %d", x, y, (x*y));
		}
		else if(a.equals("/")) {
			System.out.printf("%d / %d = %.2f", x, y, ((double)x/(double)y));
		}
		else if(a.equals("%")) {
			System.out.printf("%d % %d = %d", x, y, (x%y));
		}
		else
			System.out.println("잘못된 연산자 입력입니다.");
		
	}
	

}
