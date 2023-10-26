package overloading08;

public class Arithmetic {
	//5칙연산 메소드 만들기
	
	int j = 10;
	
	int plus (int x, int y) {
		int re = x+y;
		return re;
	}
	
	void plus(int x) {
		System.out.println("int");
		System.out.println(x + "+" + j + "=" + (x+j));
	}
	
	void plus(double x, double y) {
		System.out.println("double double");
		System.out.println(x + "+" + y + "=" + (x+y));
	}
	
	void plus (int x, double y) {
		System.out.println("int double");
		System.out.println(x + "+" + y + "=" + (x+y));
	}
	
	int minus (int x, int y) {
		int re = x-y;
		return re;
	}
	
	void minus(int x) {
		System.out.println("int");
		System.out.println(x + "-" + j + "=" + (x-j));
	}
	
	void minus(double x, double y) {
		System.out.println("double double");
		System.out.println(x + "-" + y + "=" + (x-y));
	}
	
	void minus (int x, double y) {
		System.out.println("int double");
		System.out.println(x + "-" + y + "=" + (x-y));
	}
	
	int mult (int x, int y) {
		int re = x*y;
		return re;
	}
	
	void mult(int x) {
		System.out.println("int");
		System.out.println(x + "*" + j + "=" + (x*j));
	}
	
	void mult(double x, double y) {
		System.out.println("double double");
		System.out.println(x + "*" + y + "=" + (x*y));
	}
	
	void mult(int x, double y) {
		System.out.println("int double");
		System.out.println(x + "*" + y + "=" + (x*y));
	}
	
	
	double divide (int x, int y) {
		double re = (double)x/y;
		return re;
	}
	
	void divide(int x) {
		System.out.println("int");
		System.out.println(x + "/" + j + "=" + (x/j));
	}
	
	void divide(double x, double y) {
		System.out.println("double double");
		System.out.println(x + "/" + y + "=" + (x/y));
	}
	
	void divide (int x, double y) {
		System.out.println("int double");
		System.out.println(x + "/" + y + "=" + (x/y));
	}
	
	
	int remain (int x, int y) {
		int re = x%y;
		return re;
	}
	
	
	
	
}
