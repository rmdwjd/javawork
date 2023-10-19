package ex_1018;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.next();
		
		
		System.out.print("성별을 입력해주세요 : ");
		String gender = scan.next();
		
		System.out.print("나이를 입력해주세요 : ");
		int age = scan.nextInt();

		System.out.print("키를 입력해주세요 : ");
		double height = scan.nextDouble();
		
		System.out.println("키 "+height+" "+age+"살 "+gender+" "+name+"님 반갑습니다");
		scan.close();

	}

}
