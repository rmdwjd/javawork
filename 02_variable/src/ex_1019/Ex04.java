package ex_1019;

public class Ex04 {

	public static void main(String[] args) {

		        int iNum1 = 10;
		        int iNum2 = 4;
		        
		        float fNum = 3.0f;
		        
		        double dNum = 2.5;
		        
		        char ch = 'A';
		        
		        System.out.println( iNum1 / iNum2 ); // 2 몫
		        System.out.println( (int)dNum ); // 2 int 강제형변환
		        
		        System.out.println( iNum2 * dNum ); // 10.0 (int*double->double)
		        System.out.println( (double)iNum1 ); // 10.0 double 강제형변환
		        
		        System.out.println( (double)iNum1/ iNum2 ); // 2.5 하나만 형변환해도 괜찮고 둘다해도 괜찮
		        System.out.println( dNum ); // 2.5
		        
		        System.out.println( (int)fNum ); // 3 int 강제형변환
		        System.out.println( (int)(iNum1/fNum) ); // 3 몫 (강제형변환)

		        System.out.println( iNum1/fNum );// 3.3333333
		        System.out.println((double)iNum1/fNum ); // 3.3333333333333335 (float 보다 더 길기 때문에 double로 형변환
		        
		        System.out.println( ch ); // 'A'
		        System.out.println( (int)ch ); // 65
		        System.out.println( ch+iNum1 ); // 75 자동형변환(char + int -> int)
		        System.out.println( (char)(ch+iNum1) ); // 'K' 자동형변환(int) 후 강제형변환(char)
	}

}
