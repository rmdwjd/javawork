package final05;
final class Final101{
	
}
/*
class FinalInher extends Final101{

}
*/

class Final102{
	int num = 10;
	//변수 앞에 final을 붙이면 상수가 됨 : 값이 한번 저장되면 변경 불가
	final int NUM2 = 34;
	
	//메소드 앞에 final을 붙이면 오버라이딩 불가
	final int play() {
//		NUM2 = 40; 다른값으로ㅂ 변경 불가
		return NUM2;
	}
	int show() {
		return num;
	}
}
class Final102Infer extends Final102{
	//메소드 재정의 불가
	/*
	int play() {
		return 3;
	}*/
}

public abstract class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
