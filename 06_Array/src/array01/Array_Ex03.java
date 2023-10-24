package array01;

public class Array_Ex03 {

	public static void main(String[] args) {
		int score[] = {100,97, 58, 72, 94};
		int sum = 0;
		for(int i=0; i<score.length; i++){
			sum += score[i];
		}
		
		double avg = (double)sum/score.length;
		System.out.println("점수의 합계 :" + sum);
		System.out.printf("평균 : %.2f", avg);
		
		//2. 최대값, 최소값 구하기
		int num[] = {65, 26, 59, 98, 3, 73, 16, 84, 36, 8};
		int max = num[0];
		int min = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]>max)
				max=num[i];
			if(num[i]<min)
				min=num[i];
		}
		System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	
	}

}
