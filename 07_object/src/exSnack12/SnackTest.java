package exSnack12;

import java.util.Scanner;

public class SnackTest {

	public static void main(String[] args) {
		Snack s1 = new Snack();
		Snack s2 = new Snack("비스켓", "새우깡", "매운새우맛", 10, 2000);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("종류 입력 : ");
		s1.setKind(sc.next());
		System.out.print("이름 입력 : ");
		s1.setName(sc.next());
		System.out.print("맛 입력 : ");
		s1.setFlavor(sc.next());
		System.out.print("개수 입력 : ");
		s1.setNumOf(sc.nextInt());
		System.out.print("가격 입력 : ");
		s1.setPrice(sc.nextInt());
		
		System.out.println("s1 객체의 정보 : " + s1.information());
		System.out.println("s2 객체의 정보 : " +s2.information());
		
		System.out.println("========================================");
		//s1객체의 수량을 3개로 변경
		//s1객체의 금액 변경
		//s1객체의 정보 출력
		s1.setNumOf(10);
		s1.setPrice(5000);
		System.out.println("s1 객체의 정보 : " + s1.information());
		
		//s2객체의 이름 변경
		//s2객체의 금액 변경
		//s2객체의 정보 출력
		s2.setName("에이스");
		s2.setPrice(2500);
		System.out.println("s2 객체의 정보 : " +s2.information());

		
	}

}
