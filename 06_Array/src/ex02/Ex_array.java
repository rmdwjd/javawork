package ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_array {

	public static void main(String[] args) {
		//1번
		Scanner sc = new Scanner(System.in);
		/*System.out.println("배열의 길이 입력 :");
		int num =sc.nextInt();
		int iArr[] =new int[num];
		int sum = 0;
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println("배열 ["+i+"] index에 넣을 값 입력 : ");
			iArr[i] = sc.nextInt();
			sum += iArr[i];	
		}
		System.out.println(Arrays.toString(iArr));
		System.out.println("총 합은 : "+sum);*/
	
		
		//2번
		//풀이 1.
		/*while(true) {
			System.out.print("정수 입력 : ");
			int num2 = sc.nextInt();
			
			if(num2 % 2 == 0 || num2 < 3 ) {
				System.out.println("다시 입력하세요");
				continue;
			}
			
			int iArr2[] = new int[num2];
			int count = 1;
			for(int i=0; i<num2; i++) {
				if(i< num2/2)
					iArr2[i] = count++;
				else 
					iArr2[i] = count--;;
			}
			System.out.println(Arrays.toString(iArr2));
			break;
		}*/
		//풀이 2.
		/*
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		
		if(num2 % 2 == 1 || num2 > 3) {
			int iArr2[] = new int[num2];
			int count = 1;
			for(int i=0; i<num2; i++) {
				if(i< num2/2)
					iArr2[i] = count++;
				else 
					iArr2[i] = count--;;
			}
			System.out.println(Arrays.toString(iArr2));
		}
		else {
			System.out.println("다시 입력하세요");
			System.out.println("정수 입력 : ");
			num2 = sc.nextInt();
		}
		*/
		//3번
		/*
		String chikens[] = {"후라이드", "양념", "파닭", "간장"};
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.next();
		boolean flag = false;
		for(int i=0; i<chikens.length; i++) {
			if(menu.equals(chikens[i])) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println(menu + "치킨 배달 가능");
		else
			System.out.println(menu + "는 없는 메뉴입니다.");
		*/
		//4번
		System.out.print("주민번호 입력(-포함) : ");
		String jumin = sc.next();
		char[] origin = new char[jumin.length()];
		for(int i = 0; i<origin.length; i++) {
			origin[i] = jumin.charAt(i);
		}
		char [] copy = new char[origin.length];
		for(int i = 0; i<copy.length; i++) {
			if(i<8)
				copy[i] = origin[i];
			else
				copy[i] = '*';
		}
		System.out.println(copy);
		
		
		
	
	}
}
