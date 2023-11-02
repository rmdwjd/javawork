package ex11;


public class NumberController {
	
	NumberController(){}
	boolean check (int num1, int num2) throws NumRangeException { 
			if(0>=num1 || num1>100)
				throw new NumRangeException("1~100까지의 수 입력");
			if(0>=num2 || num2>100)
				throw new NumRangeException("1~100까지의 수 입력");
			/*
			if(num1%num2==0)
				{return true;}
			return false;			
			*/
			return num1%num2==0;
			//맞으면 true , 틀리면 false 로 리턴해준다.
	}
		
}
	

