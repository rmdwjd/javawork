package in01;

class D {
	int x ;
	static int sx;
}

class E extends D{
	String x;
	static String sx;
}

public class InheritanceTest3 {

	public static void main(String[] args) {
		E e = new E();
		e.x = "혼자 공부하는 자바";
		System.out.println(e.x);
//		e.x = 1234; 1. 우선 객체가 생성된 필드부터 보고 있으면 그 필드 사용
//					2. 만약 객체가 생성된 필드명이 없으면 상속받은 부모 필드를 살펴본다
		
		D d = new D();
		d.x = 1233; // int형으로 숫자만 대입 가능!
		System.out.println(d.x);
		
		//static 붙으면 자료형이 다를 경우 사용 가능~
		E.sx = "마이바티스";
		D.sx = 123;
	}

}
