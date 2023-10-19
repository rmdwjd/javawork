package scanner02;

import java.util.Scanner;

public class Ch01_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : "); // 문자열 단어로 입력받을 때 : next() 
		String name = scan.next(); 
		System.out.println("당신의 이름은 : "+name);
					  
		System.out.print("나이를 입력하세요 : "); // 정수로 입력 받을 때 : nextInt() 
		int age = scan.nextInt(); 
		System.out.println("당신의 나이는 : "+age);
					  
		System.out.print("키를 소수점 2째자리까지 입력하세요 : "); 
		double height =scan.nextDouble(); 
		System.out.println("당신의 키는 : "+ height);
					
		System.out.print("당신은 여자입니까? (true or false) : ");
					
		boolean gender = scan.nextBoolean();
		System.out.println("당신은 여자입니까?" + gender);
					
		scan.nextLine();
					
		System.out.print("주소를 입력하세요 : ");
		String address = scan.nextLine();
		System.out.println("주소 : "+address);
				
		System.out.print("당신의 성별은 무엇입니까? (남, 여) :" );
		
		char gender2 = scan.next().charAt(0);
		
		/*		
		 String gender2 = scan.next();
		 char gender3 = gender2.charAt(0);
		*/
		
		System.out.println("당신은 "+ gender2+"자입니다.");
		
		/*
		a b c d
		0 1 2 3
		kimjiwon
		01234567
		char gender2 = scan.next().charAt(7); ===> n
		*/
		
		
		System.out.print("당신의 이름을 영문으로 쓰시오 : ");
		char name2 = scan.next().charAt(3);
		System.out.println("당신의 이름 중 4번째 알파벳은 " + name2 + "입니다");
		
		
		scan.close();
	}         

}
