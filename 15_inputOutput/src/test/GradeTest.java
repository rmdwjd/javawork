package test;

import java.util.*;

public class GradeTest {

	public static void main(String[] args) {
		int select;
		boolean check = false;
		ArrayList<Grade> glist = new ArrayList<Grade>();
		int gListIndex = 0;
		Grade grade = new Grade();
		Grade g1 = new Grade("aa", "최", "1234", 20, 80, 33, 70, 80);
		Grade g2 = new Grade("bb", "김", "1234", 50, 22, 33, 50, 100);
		Grade g3 = new Grade("cc", "이", "1234", 70, 22, 33, 90, 10);
		glist.add(g1);
		glist.add(g2);
		glist.add(g3);
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 학생 정보 및 점수 입력");
			System.out.println("2. login");
			System.out.println("3. 학생 정보 출력");
			System.out.println("4. 합계와 평균 출력");
			System.out.println("5. logout");
			System.out.println("6. 프로그램 종료");
			
			System.out.print(" 번호 입력 >> ");
			select = sc.nextInt();
			
			glist.add(g1);
	
			if(select==1){
				System.out.println("==========학생 정보 및 점수 입력==========");
				System.out.print(" id 입력 >> ");
				grade.setId(sc.next()) ;
				System.out.print(" 이름 입력 >> ");
				grade.setName(sc.next()) ;
				System.out.print(" 비밀번호 입력 >> ");
				grade.setPassword(sc.next()) ;
				System.out.print(" 나이 입력 >> ");
				grade.setAge(sc.nextInt()) ;
				System.out.print(" 국어점수 입력 >> ");
				grade.setKor(sc.nextInt()) ;
				System.out.print(" 영어 >> ");
				grade.setEng(sc.nextInt()) ;
				System.out.print(" 컴퓨터 입력 >> ");
				grade.setCom(sc.nextInt()) ;
				System.out.print(" 수학 입력 >> ");
				grade.setMath(sc.nextInt()) ;
				glist.add(grade);
				System.out.println("학생 정보, 성적 입력 완료");
				continue;
			}
			else if(select==2){
				int count = 0;
				for(int j=0; j<3; j++) {
					System.out.println("==========로그인==========");
					System.out.print(" id 입력 >> ");
					String id = sc.next();
					System.out.print(" 비밀번호 입력 >> ");
					String pw = sc.next();
					count++;
					for(int i=0; i<glist.size(); i++) {
						if(id.equals(glist.get(i).getId()) && pw.equals(glist.get(i).getPassword()))
						{	check=true; 
							gListIndex = i;
							count = 0;
							System.out.println("로그인 성공");
							break ;  
						}
					}
					if(check) {
						break;
					}
					if(count!=0) {
						System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
					}
				}
				if(count==3) {
					System.out.println("로그인 3회 실패 본인확인필요");
				}
			}
			else if(select==3){
				System.out.println("==========성적 출력==========");
				if(!check) {
					System.out.println("로그인을 해야 출력 가능합니다.");
					continue;
				}
				System.out.println(glist.get(gListIndex).toString());
				
			}
			else if(select==4){
				System.out.println("==========합계 평균 출력==========");
				if(!check) {
					System.out.println("로그인을 해야 출력 가능합니다.");
					continue;
				}
				System.out.println("합계 : "+glist.get(gListIndex).getTotalScore());
				System.out.println("평균 : "+glist.get(gListIndex).getAge());
		
			}
			else if(select==5){
				check = false;
				System.out.println("로그아웃되었습니다.");
			}
			else if(select==6){
				System.out.println("시스템 종료");
				break ;
			}
			else {
				System.out.println("잘못된 숫자 입력입니다.");
				continue;
				}
			
			
		}
	}
}
