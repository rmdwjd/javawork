package array01;

import java.util.Arrays;
import java.util.Scanner;

public class Array_etc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char chArr[]= {'a', 'b', 'c','d','e'};
		String strArr[] = {"홍길동", "kim", "&^#"};
		boolean bArr[] = {true, false, false, true};
		double dArr[] = {3.14, 7.589, 46.345};
		
		String sArr[] = new String[3];
		
		Scanner scan = new Scanner(System.in);
		for(int i =0; i<sArr.length; i++){
			System.out.println((i+1) +"번쨰 이름 입력 : ");
//			String name = scan.next();
//			sArr[i] = name;
			sArr[i] = scan.next();
		}
		for(int i=0; i<sArr.length; i++) {
			System.out.print(sArr[i]+"  ");
			
		}
		System.out.println();
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(bArr));
		System.out.println(chArr); //char일대만 값 출력
		int iArr[] = {1,2,3,4,5};
		System.out.println(iArr); //주소출력
		System.out.println(dArr);
	}

}
