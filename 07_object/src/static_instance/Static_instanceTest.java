package static_instance;

class Stin{
	
	// 인스턴스 멤버 : 반드시 객체가 새생성야만 사용가능
	// 인스턴스 멤버와 정적멤버 모두 사용 가능
	int inNum = 10;
	int plus(int x ) {
		return inNum + x;
	}
	
	
	//정적멤버
	//인스턴스 멤버 사용 불가 : 이유는 객체가 만들어졌다는 보장이 없기 때문
	static int sNum = 30;
	static int plus() {
		// int re = inNum + 10; //inNum을 사용하려면 반드시 객체를 만들고 나서 사용ㅅ가능
		int re = sNum +10;
		return re;
	} 
}


public class Static_instanceTest {

	public static void main(String[] args) {
		System.out.println(Stin.sNum);
		System.out.println(Stin.plus());
		Stin st = new Stin();
		st.plus(3);

	}

}
