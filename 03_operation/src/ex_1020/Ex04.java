package ex_1020;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("인원 수를 입력하세요: ");
		int p = sc.nextInt();
		System.out.print("사탕 개수를 입력하세요: ");
		int candy = sc.nextInt();
		System.out.printf("한 명당 %d개의 사탕을 나눠가졌고 사탕 %d개가 남았다.", candy/p, candy%p);
		
	}

}
