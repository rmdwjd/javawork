package singleton15;


//싱글톤 : 전체 프로그램에서 단 하나의 개겣만 만들도록 보장하는 기법
//		: 실행클래스에서 객체를 만들지못하도록 해야 함
class Singleton{
	
	private static Singleton signleton = new Singleton();


	//생성장에 private를 붙여 객체를 생성할수 없게 만든다.
	private Singleton() {}
	
	
	
	//인스턴스 메소드 : 현재 메소드가 호출되었다는 것은 객체가 이미 설정되었다는 의미
	static Singleton getInstance(){
		return signleton;
	}

}


public class SingletonTest15 {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton(); //불가
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		if(sing1==sing2)
			System.out.println("같은 객체를 가리키고 있음");
		else
			System.out.println("다른 객체임");
		
	}

}
