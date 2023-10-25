package objTv08;

import objTv08.Tv;

public class TvTest {
	public static void main(String[] args) {
		Tv tv1 = new Tv("LG전자", "올레드", 55);
		System.out.println(tv1.company);
		System.out.println(tv1.model);
		System.out.println(tv1.inch);
		
		System.out.println();
		
		Tv tv2 = new Tv("삼성전자", "QLED", 75);
		System.out.println(tv2.company);
		System.out.println(tv2.model);
		System.out.println(tv2.inch);
		
		System.out.println();
		
		System.out.println(tv1.company+" tv 채널을 올립니다 : "+tv1.channelUp());
		System.out.println(tv1.company+" tv 채널을 올립니다 : "+tv1.channelUp());
		System.out.println(tv1.company+" tv 채널을 올립니다 : "+tv1.channelUp());
		System.out.println(tv1.company+" tv 채널을 내립니다 : "+tv1.channelDown());
		
		System.out.println(tv1.company+" tv 볼륨을 설정합니다 : "+tv1.volume(15));
		
	}

}
