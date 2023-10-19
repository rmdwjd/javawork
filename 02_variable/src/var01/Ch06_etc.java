package var01;

public class Ch06_etc {

	public static void main(String[] args) {
		// 정수 : long 실수 : float
		int num1 = 111111111;
		
		// 숫자 뒤에 L을 붙여서 long형임을 알린다.
		long long1 =1111111111111L;
		float float1 = 2.3456f;
		
		//자료형의 범위를 미리 만들어 놓은 클래스 사용
		System.out.println("byte 크기 : "+ Byte.MIN_VALUE + " ~ "+Byte.MAX_VALUE);
		System.out.println("short 크기 : "+ Short.MIN_VALUE + " ~ "+ Short.MAX_VALUE);
		System.out.println("int 크기 : "+ Integer.MIN_VALUE + " ~ "+ Integer.MAX_VALUE);
		System.out.println("char 크기 : "+ (int)Character.MIN_VALUE+" ~ "+ (int)Character.MAX_VALUE);
		System.out.println("double 크기 : "+ Double.MIN_VALUE + " ~ "+ Double.MAX_VALUE);
	}

}
