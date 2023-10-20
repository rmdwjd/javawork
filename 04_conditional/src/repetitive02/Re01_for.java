package repetitive02;

public class Re01_for {

	public static void main(String[] args) {
		// 반복문 : 원하는 횟수만큼 반복하여 실행고자 할 때
		/*
		for(초기식; 조건식; 증감식){
			실행문
		}
		*/	
		for(int i=1; i<=100; i++) {
			System.out.println(i + " 안녕하세요" );
			System.out.println("\t반갑습니다");
		}
		System.out.println("===========================================");
		for(int i =2; i<=10; i+=2) {
			System.out.println(i + "번 출력");
		}
		System.out.println("===========================================");
		for(int i=10; i>=1; i--) {
			System.out.println(i+ ". 1씩 감소");
		}
		System.out.println("===========================================");
		
		// 1~10까지의 합구하기
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합계 : " + sum);
	}

}
