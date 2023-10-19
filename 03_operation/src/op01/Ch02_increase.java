package op01;

public class Ch02_increase {

	public static void main(String[] args) {
		// ++ 하나 증가
		int num1 = 10;
		num1++;
		System.out.println(num1);
		
		// -- 하나 감소
		num1 = 10;
		num1--; //9
		num1--; //8
		num1++; //9
		System.out.println(num1);
		
		// 단항일 때는 연산자가 앞/뒤 어디에 있어도 결과가 똑같다.
		++num1;
		--num1;
		
		// 연산시 달라진다.
		int num2 = 10;
		int num3 = 10;
		
		/*
		1. 증가를 먼저 한다 --> num2==11
		2. 증가를 먼저 한다 --> num3==11
		3. 연산 --> 11+11
		4. 대입 --> result==22
		*/
		int result = ++num2 + ++num3;
		System.out.println(result);
		
		/*
		1. 앞에 붙은 num2는 증가 --> num2==11
		2. 연산을 한다 --> num2(11) + num3(10) = 21
		3. 대입을 한다 --> result == 21
		4. 뒤에 붙은 num3 중가 --> num3==11
		*/
		num2 = 10;
		num3 = 10;
		result = ++num2 + num3++ ;
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;
		result = num2++ + num3++ ;
		System.out.println("result : "+ result + " / num2 : "+num2+" / num3 : "+num3);
		
		num2 = 10;
		num3 = 10;
		result = num2-- + ++num3 ;
		System.out.println(result); //21
		
		num2 = 10;
		num3 = 10;
		result = ++num2 + --num3 ;
		System.out.println(result); // 20
		
		num2 = 10;
		num3 = 10;
		result = --num2 + num3-- ;
		System.out.println(result); //19
		
	}

}
