package exSnack12;

public class Snack {
	private String kind;
	private String name;
	private String flavor;
	private int numOf;	
	private int price;
	
	Snack(){}
	
	Snack(String kind, String name, String flavor, int numOf, int price){
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	void setKind(String kind) {
		this.kind = kind;
	}
	String getKind() {
		return kind;
	}
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	String getFlavor() {
		return flavor;
	}
	void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	 int getNumOf() {
		return numOf;
	}
	void setPrice(int price) {
		this.price = price;
	}
	int getPrice() {
		return price;
	}
	 
	public String information() {
		return kind +", "+ name +", "+ flavor +", "+ numOf +", "+ price ;
	}
	
}
