package ex_1019;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요 : ");
		char ch = scan.next().charAt(0);
		int uni = (int)ch;
		System.out.printf("%c의 유니코드는 : %d\n", ch, uni);
	}

}
