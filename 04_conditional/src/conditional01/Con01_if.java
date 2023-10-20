package conditional01;

public class Con01_if {

	public static void main(String[] args) {
		// if(조건식)
		//	조건식이 참일 때 실행
		
		int num1 = 100;
		if(num1==100){ //실행문이 하나일 때 중괄호 생략 가능
				System.out.println("100입니다");
			}
		if(num1 >80) { //실행문이 하나 이상일 때는 반드시 중괄호
			System.out.println("합격입니다.");
			System.out.println("축하합니다"); //중괄호가 없으니 출력된다.
		}
		System.out.println("if문과 상관없이 실행됨");
	
	}

}
