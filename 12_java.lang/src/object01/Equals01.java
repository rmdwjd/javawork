package object01;

class Value{
	int value;
	Value(int value){
		this.value = value;
	}
	@Override				
	public boolean equals(Object o) {
		/*		//			ㄴ자식을 부모타입으로 형변환
		Value v  = (Value)o; //부모타입을 자식타입으로 형변환
		int num = v.value;
		return value == num;
		*/
		
		 return value == ((Value)o).value;
	}
}

public class Equals01 {

	public static void main(String[] args) {
		//오버라이딩 안했을경우 주소가 같냐 안같냐?
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		
		/*
		//오버라이딩 하기 전
		if(value1.equals(value2))
			System.out.println("value1과 value2가 주소가 같다");
		else
			System.out.println("value1과 value2가 주소가 다르다");
		
		*/
		
		//오버라이딩 하고난 후 
		if(value1.equals(value2))
			System.out.println("value1과 value2가 값이 같다");
		else
			System.out.println("value1과 value2가 값이 다르다");
		
		if(value1==value2)
			System.out.println("value1과 value2가 주소가 같다");
		else
			System.out.println("value1과 value2가 주소가 다르다");
		
		System.out.println("=========================================");
		
		value1 = value2;
		
		if(value1.equals(value2))
			System.out.println("value1과 value2가 같다");
		else
			System.out.println("value1과 value2가 다르다");
		
	
	
	}

}
