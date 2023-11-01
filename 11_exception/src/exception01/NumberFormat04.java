package exception01;

public class NumberFormat04 {

	public static void main(String[] args) {
		String strNum[] = {"23","17","3.14159"};
		
		for(String num : strNm) {
			int result = Integer.parseInt(num);
			System.out.println("숫자로 변환된 값 : " + result ) ;
		}
		
	}

}
