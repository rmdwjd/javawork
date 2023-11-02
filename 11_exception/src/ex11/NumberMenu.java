package ex11;

import java.util.Scanner;

public class NumberMenu {

	public static void main(String[] args) {
		menu();
	}
	static void menu() {
		NumberController nc = new NumberController();
		boolean ck;
		Scanner sc = new Scanner(System.in);
			System.out.print("정수 1 : ");
			int x = sc.nextInt();
			System.out.print("정수 2 : ");
			int y = sc.nextInt();
			System.out.print(x+"은(는) "+y+" 배수인가? ");
			 try {
				System.out.println(nc.check(x, y));
			} catch (NumRangeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}
}
