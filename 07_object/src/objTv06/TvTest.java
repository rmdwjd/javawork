package objTv06;

public class TvTest {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		System.out.println("========TV정보========");
		System.out.println("회사 : "+tv1.company);
		System.out.println("모델 : "+tv1.model);
		System.out.println("인치 : "+tv1.INCH);
		
		
		System.out.println("=====================");
		tv1.on();
		System.out.println("채널을 올립니다 : "+tv1.chUp());
		System.out.println("채널을 올립니다 : "+tv1.chUp());
		System.out.println("채널을 올립니다 : "+tv1.chUp());
		System.out.println("채널을 내립니다 : "+tv1.chDown());
		System.out.println("볼륨 : "+ tv1.volChange(14));
		System.out.println("채널을 올립니다 : "+tv1.chUp());
		System.out.println("채널을 내립니다 : "+tv1.chDown());
		System.out.println("채널을 올립니다 : "+tv1.chUp());
		System.out.println("볼륨 : "+ tv1.volChange(10));
		tv1.on();
	}

}
