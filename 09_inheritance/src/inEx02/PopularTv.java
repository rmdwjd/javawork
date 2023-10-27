package inEx02;

public class PopularTv extends Tv {
	private String video;
	
	public String video(String video) {
		this.video = video;
		return this.video + " 비디오를 재생합니다.";
	}
}
