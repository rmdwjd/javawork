package ex02;

public class Member {
	private String name;
	private int age;
	private char gender;
	
	Member(){}
	
	public Member(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String toString() {
		return "이름 : " + name +", 나이 : "+age+", 성별 : "+gender;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
