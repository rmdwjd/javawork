package array01;

public class Array_int01 {

	public static void main(String[] args) {
		// 배열 : 같은 자료형을 연속된 저장 공간에 저장함
		// 	배열의 길이는 늘리거나 줄일 수 없다
		//	int[] 변수명 = new int[갯수]
		//	int 변수명[] = new int[갯수]
		
		// 저장공간을 확보만하고 값은 나중에 넣을 때
		int arrayInt[] = new int[10];
		int[] arrayInt2 = new int[5];
		
		// 배열을 만들면서 값을 바로 넣을 때
		int arrayInt3[] = {1,2,3,4,5};
		//			index = 0,1,2,3,4
		
		System.out.println(arrayInt3[0]);
		System.out.println(arrayInt3[3]);
		
		System.out.println("\n======================\n");
		
		arrayInt3[1] = 20;
		System.out.println(arrayInt3[0]);
		System.out.println(arrayInt3[1]);
		
		System.out.println("\n======================\n");
		
		for(int i=0; i<=4; i++) {
			System.out.println(arrayInt3[i]);
		}
		
		System.out.println("\n======================\n");
		
		for(int i=0; i<=4; i++) {
			arrayInt3[i] = i*2;
			System.out.println(arrayInt3[i]);
		}
		
		System.out.println("\n======================\n");
		
		int int1[] = {3,4,5,6,7,8,9,10,11};
		int int2[] = new int[10];
		System.out.println("int1의 길이 : "+ int1.length);
		System.out.println("int2의 길이 : "+ int2.length);
		
		for(int i=0; i<int1.length; i++) {
			System.out.print(int1[i]+"\t");
		}
		
		System.out.println("\n======================\n");
		
		// 문제 1 : 길이가 5인 배열 값을 for문으로 0,3,6,9,12 를 넣고 합계를 구하여 출력하기
		int arr3[] = new int[5];
		int sum =0;
		for(int i=0; i<arr3.length; i++) {
			 arr3[i] = i*3;
			 sum += arr3[i];
			 System.out.println(arr3[i]);
		}
		System.out.println("배열의 입력된 값의 합계는 : " +sum);
		
		
	}

}
