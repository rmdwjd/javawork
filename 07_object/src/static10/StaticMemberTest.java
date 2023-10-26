package static10;

import java.util.Scanner;

public class StaticMemberTest {

	int a; // 인스턴스변수
	static int b; //정적변수 (클래스필드)
	
	public static void main(String[] args) {
		
		int c; // 지역변수
		// 정적필드와 정적메소드는 객체 생성없이 호출 가능 (클래스.정적변수 / 클래스.정적메소드)
		System.out.println("정적 변수 (객체생성안함) : " + StaticMember.sName);
		StaticMember.sMe4();
		
		System.out.println("========================");
		
		StaticMember sm1 = new StaticMember();
		System.out.println("인스턴스 변수 : " + sm1.num);
		System.out.println("정적 변수 : " + sm1.sNum);
		
		sm1.Me1();
		sm1.sMe3();
		
		/*
		Scanner sc = new Scanner(System.in);
		sc.next(); // 객체생성 후 메소드 호출 가능 -> 인스턴스 메소드라는 것을 알 수 있다.
		*/
		
		System.out.println("=========================");
		
		StaticMember sm2 = new StaticMember();
		sm2.sNum = 100;
		
		// 클래스를 이용하는 모든 객체들의 공통으로 사용
		System.out.println(StaticMember.sNum);
		System.out.println(sm1.sNum);
		System.out.println(sm2.sNum);
		
		System.out.println("========================");
	
		System.out.println(StaticMemberTest.Method1());
		
	} //정적 main() 메소드 끝
	
	
	static int Method1() {
		return 10;
	}

}
