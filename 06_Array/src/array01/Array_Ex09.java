package array01;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Ex09 {

	public static void main(String[] args) {

		/*
		1. 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		*/		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int arr[] = new int[sc.nextInt()];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총 합 : "+sum);
		
		/*
		2. 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		다시 정수를 받도록 하세요. 
		*/
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("3이상의 홀수를 입력해주세요 : ");
		int arr2[] = new int[sc.nextInt()];
	
		if(arr2.length%2==0 || arr2.length<3)
			{
				System.out.println("3이상의 홀수를 입력해주세요");
			}
		else {
			int count = 0;
			for(int i=0; i<arr2.length; i++) {
				if(i<=arr2.length/2) {
					arr2[i] = count+1;
					count+=1;
				}
				else{
					arr2[i] = count-1;
					count-=1;
					}
			}
			System.out.println(Arrays.toString(arr2));
		}
		
		/*
		3.
		사용자가 입력한 값이 배열에 있는지 검색하여
		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		*/
		String chiken[] = {"후라이드", "양념", "간장", "순살"};
		System.out.print("치킨 메뉴를 입력해주세요 : ");
		Scanner sc3 = new Scanner(System.in);
		String choice = sc3.next();
		for(int i=0; i<chiken.length; i++) {
			if(choice.equals(chiken[i])) {
				System.out.println(choice+"치킨 배달 가능");
			}
			else if(i==(chiken.length-1) && !choice.equals(chiken[i]))
				System.out.println(choice+"치킨은 없는 메뉴입니다.");
			
		}
		/*
		4.
		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("주민등록번호입력해주세요 :");
		
		
		
		
		
		
		
		
	}	
}

