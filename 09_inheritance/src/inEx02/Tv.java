package inEx02;

public class Tv {
	private String model;
	private int inch;
	private boolean power;
	private int channel;
	private int volume;

	public void power() {
		power = !power;
		if(power)
			System.out.println("TV - ON");
		else
			System.out.println("TV - OFF");
	}
	public void setChannel(int channel) {
		this.channel = channel;
		
	}
	public int getChannel() {
		return channel;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
}

