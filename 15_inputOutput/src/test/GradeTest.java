package test;

import java.util.*;

public class GradeTest {

	public static void main(String[] args) {
		int select;
		boolean check;
		ArrayList<Grade> glist = new ArrayList<Grade>();
		int gListIndex;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 학생 정보 및 점수 입력");
		System.out.println("2. login");
		System.out.println("3. 학생 정보 출력");
		System.out.println("4. 합계와 평균 출력");
		System.out.println("5. logout");
		System.out.println("6. 프로그램 종료");
		
		System.out.print(" 번호 입력 >> ");
		select = sc.nextInt();
		
		if(select==1)
			System.out.print(" id 입력 >> ");
			String id = sc.next();
			glist.add(id);
			System.out.print(" 이름 입력 >> ");
			String name = sc.next();
			glist.add(name);
			System.out.print(" 비밀번호 입력 >> ");
			String password = sc.next();
			glist.add(password);
			System.out.print(" 나이 입력 >> ");
			int age = sc.nextInt();
			glist.add(age);
			System.out.print(" 국어점수 입력 >> ");
			int kor = sc.nextInt();
			glist.add(kor);
			System.out.print(" 영어 >> ");
			int eng = sc.nextInt();
			glist.add(eng);
			System.out.print(" 컴퓨터 입력 >> ");
			int com = sc.nextInt();
			glist.add(com);
			System.out.print(" 수학 입력 >> ");
			glist.add(math);
			
			
			
			
	}

}
