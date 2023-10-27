package inOverriding03;

// 오버라이딩 : 상속에서 자식이 부모의 메소드의 원형은 그대로 하고 실행내용만 다르게 정의
// 			오버라이딩 시 무조건 자식의 메소드가 호출됨


class F{
	void show() {
		System.out.println("부모 클래스 show()메소드 호출");
	}
	void play(String title) {
		System.out.println("부모 클래스에서 "+title+"을 플레이합니다.");
	}
}
class G extends F{
	
	//오버라이딩
	void show() {
		System.out.println("자식 클래스 show()메소드 호풀");
	}
	
	//오버로딩 : 매개변수의 개수나 자료형이 다름
	void play(int aa) {
		System.out.println("자식 클래스에서 "+aa+"을 플레이합니다.");
	}
}

public class OverridingTest1 {

	public static void main(String[] args) {
		G g = new G();
		g.show();
		g.play("영화");//부모클래스 play를 호출함
		g.play(4); //자식클래스에서 호출
	}

}
