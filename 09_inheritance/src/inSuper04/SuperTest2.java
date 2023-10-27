package inSuper04;

class Parent2 {
	int x = 10;
	void display() {
		System.out.println("부모클래스의 display() 메소드");
	}
}

class Child2 extends Parent2{
	int x = 20;
	
	//오버라이딩
		void display() {
			System.out.println("자식클래스의 display() 메소드");
		}
	
	void method() {
		display();
		super.display();
		System.out.println("Child2 클래스의 x = "+ this.x);
		System.out.println("Parent2 클래스의 x = "+ super.x);
	}
	
}

public class SuperTest2 {
	public static void main(String[] args) {
		Child2 ch2 = new Child2();
		ch2.method();
		//오버라이딩 된 것은 무조건 자식클래스 메소드 호출
		ch2.display();
		
	}

}


//우선순위는 무조건 하위에서 부터 올라간다
// 자식 클래스 -> 부모 클래스
// 지역변수 -> 자식 클래스 변수 -> 부모 클래스 변수