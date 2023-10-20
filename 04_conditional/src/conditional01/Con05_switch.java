package conditional01;

import java.util.Scanner;

public class Con05_switch {
	public static void main(String[] args) {
		int num1 = 1;
		switch(num1) {
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		default :
			System.out.println("1과 2가 아닌 수");
		}
		
		char ch = 'p';
		switch(ch) {
		case 'k' :
			System.out.println("김씨입니다");
			break;
		case 'l' :
			System.out.println("이씨입니다");
			break;
		case 'p' :
			System.out.println("박씨입니다");
			break;
		default :
				System.out.println("김, 이, 박이 아닌 성씨입니다.");
		}
		
		System.out.println("=======================================");
		
		switch(ch) {
		case 'k' :
			System.out.println("김씨입니다");
		case 'l' :
			System.out.println("이씨입니다");
		case 'p' :
			System.out.println("박씨입니다");
		default :
				System.out.println("김, 이, 박이 아닌 성씨입니다.");
		}
		
		System.out.println("=======================================");
		
		int month = 3;
		switch (month) {
		case 1 :
		case 2 :
		case 12 :
			System.out.println("겨울에 태어났군요");
			break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println("봄에 태어났군요");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름에 태어났군요");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("가을에 태어났군요");
		}
		
		System.out.println("=======================================");
		
		// 문) 사용자로부터 연산자(+,-,*,/,%)와 숫자 2개를 입력받아 연산결과 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int x = sc.nextInt();
		System.out.print("숫자를 입력해주세요 : ");
		int y = sc.nextInt();
		System.out.print("연산자를 입력해주세요 (+ , -, *, /, %) : ");
		char op = sc.next().charAt(0);
		
		/*System.out.println("연산할 숫자와 연산자 입력( ex] 4 + 6 ) : ");
		int x1 = sc.nextInt();
		char op2 = sc.next().charAt(0);
		int y1 = sc.nextInt();*/
		
		switch(op) {
		case '+' : 
			System.out.println(x+" + "+y+" = "+(x+y));
			break;
		case '-' :
			System.out.println(x+" - "+y+" = "+(x-y));
			break;
		case '*' :
			System.out.println(x+" * "+y+" = "+(x*y));
			break;
		case '/' :
			System.out.printf("%d / %d = %.3f\n", x,  y, (double)x/y );
			break;
		case '%' :
			System.out.println(x+" % "+y+" = "+(x%y));
			break;
		default :
				System.out.println("연산자를 잘못 입력하였습니다.");
		}
		
		
	
	}
}
