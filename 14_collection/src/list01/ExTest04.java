package list01;

import java.util.*;

//ArrayList에 Person 객체 3개 넣기
class Person{
	private String name;
	private int age;
	private String phone;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
}

public class ExTest04 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		ArrayList p = new ArrayList();
		p.add(sc.next());
		
	}

}
