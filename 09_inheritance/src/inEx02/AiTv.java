package inEx02;

public class AiTv extends SmartTv {
	
	private String genre;
	
	public String genre(String genre) {
		this.genre = genre;
		return this.genre + "를 보여줍니다";
		
	}
}
