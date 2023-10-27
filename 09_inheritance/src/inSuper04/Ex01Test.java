package inSuper04;

public class Ex01Test {

	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		System.out.println(ex.Plus());
		System.out.println(ex.divide());
		System.out.println(ex.MaxNum(35, 90) + "이 더 크다");
		System.out.println("총 짝수의 개수 : "+ex.EvenSum(5, 25));
		ex.scan();
		
	}

}
