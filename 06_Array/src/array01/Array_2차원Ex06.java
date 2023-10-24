package array01;

public class Array_2차원Ex06 {

	public static void main(String[] args) {
		// 2차원 배열에 각 학생별 점수 입력
		// 국어, 영어, 수학
		int score[][] = {{95,100,78},
						{65,75,58},
						{98,88,90},
						{40,75,100},
						{35,50,92}};
		/*
			번호		국어		영어		수학		총점		평균
			------------------------------------------
			1	 	95		100		78		sum		avg
			2	 	95		100		78		sum		avg
			3	 	95		100		78		sum		avg
			4	 	95		100		78		sum		avg
			5	 	95		100		78		sum		avg
			-------------------------------------------
			총점		sum1
			평균		avg1			
		*/		
		int sum=0;
		int ksum=0, esum=0, msum=0;
		System.out.println("번호\t 국어\t 영어\t 수학\t 총점\t 평균");  
		System.out.println("--------------------------------------------");
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+" \t");
			sum=0;
			for(int j=0; j<score[0].length; j++) {
				System.out.print(score[i][j]+" \t");
				sum+=score[i][j];
				if(j==0)
					ksum+=score[i][j];
				if(j==1)
					esum+=score[i][j];
				if(j==2)
					msum+=score[i][j];
			}
			System.out.print(sum+" \t");
			System.out.print(sum/3+" \t");
			System.out.println(); 
		}
		System.out.printf("총점 : %5d %8d %8d\n", ksum, esum, msum);
		System.out.printf("평균 : %5.2f %8.2f %8.2f", ksum/5.0, esum/5.0, msum/5.0);

	}

}
