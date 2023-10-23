package repetitive02;

import java.util.Scanner;

public class Re05_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======================");
		
		//랜덤으로 1~6까지의 숫자 추출하기
		int com = (int)(Math.random() * 6) + 1;
		int user = 0;
		
		do{
			Scanner sc = new Scanner(System.in);
			System.out.print("주사위의 숫자를 맞춰보세요 (1~6) : ");
			user = sc.nextInt();
			if(com == user)
					System.out.println("축하합니다, 맞췃습니다.");
			else
				System.out.println("틀렸습니다. 다시 넣으세요.");
		}while(com != user);
	}
	
}
