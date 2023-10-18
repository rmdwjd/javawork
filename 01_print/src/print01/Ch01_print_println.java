package print01;

public class Ch01_print_println {

	public static void main(String[] args) {
		// 한줄 주석
		// - 주석은 컴파일하지 않음
		// - 실행되지 않음
		// - 설명, 날짜, 누가 만들었는지, 중요한 메서드에 대한 설명
		// - 단축키 ctrl + / (토글키)
		/*
		  여러줄 주석	
		  - 이 안의 모든 글씨는 주석임
		  - 단축키 ctrl + shift + / 
		  - 해제 단축키 ctrl + shift + \ 
		 */
		
		// println : 출력 후 줄바꿈
		System.out.println("최은정");
		System.out.println("과장명 : 엘라스틱서치 로그 빅데이터 분석 및 시각화 개발자 양성과정");
		System.out.println(10+30); // 숫자는 쌍따옴표를 넣지 않는다.
		System.out.println("10+30");
		
		// print : 출력 후 그자리에 다음 것을 출력함
		System.out.print("줄바꿈 안함");
		System.out.print("강의실 : 3강의실");
	
	}

}