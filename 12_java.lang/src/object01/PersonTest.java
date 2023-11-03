package object01;
class Person{
	int id;
	Person(int id){
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id ==((Person)obj).id;
		}else {
			return false;
		}
	}
}
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person(20231102);
		Person p2 = new Person(20231102);
		
		if(p1.equals(p2))
			System.out.println("p1 p2 값이 같다");
		else
			System.out.println("p1 p2 값이 다르다");
		
		if(p1==p2)
			System.out.println("p1 p2 객체가 같다");
		else
			System.out.println("p1 p2 객체가 다르다");
		
		System.out.println("-----------------------------");
		
		int a = 20;
		int b = 20;
		if(a==b)
			System.out.println("a b 같다");
		else
			System.out.println("a b 다르다");
		/*	if(a.equals(b))
				System.out.println("a  b 다르다");
			*/
		
		String x="안녕";
		String y="안녕";
		if(x.equals(y))
			System.out.println("x  y 같다");
		else
			System.out.println("x  y 다르다");
		
		
	}

}
