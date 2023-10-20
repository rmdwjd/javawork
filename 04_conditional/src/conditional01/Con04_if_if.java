package conditional01;

public class Con04_if_if {

	public static void main(String[] args) {
		// if안에 if무이 중첩으로 들어감
		int num1 = 500;
		
		if(num1 > 100) {
			if(num1>200)
				System.out.println("200보다 큰 숫자");
			else
				System.out.println("100보다는 크고, 200보다 작은 숫자");
		}else {
			if(num1 > 0)
				System.out.println("100보다 작은 양수");
			else {
				if(num1>0)
					System.out.println("100보다 작은 양수");
				else if(num1 == 0)
					System.out.println("0d이다");
				else
					System.out.println("음수");
			}

		}

	}
}
