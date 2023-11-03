package list01;

import java.util.*;

public class ArrayList01 {

	public static void main(String[] args) {
		/*
		ArrayList<제너릭>
		<제너릭> => 자료형이 무엇이 들어올지 모른다.
				  사용할 때 자료형을 넣는다.
				  -갯수를 지정하지 않으면 (기본10개)
		*/
		
		//개수지정가능
		ArrayList<String> alist = new ArrayList<String>(15);
		//부모형으로 변환하여 사용
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("Oracle");
		list.add("HTML5");
		list.add("JSP");
		
		int size = list.size();
		System.out.println("총 객체 수 : "+size);

		String list2 = list.get(2);
		System.out.println(list2);
		
		list.add(2, "Spring");
		System.out.println("총 객체 수 : "+list.size());
		System.out.println(list.get(2));
		
		list.set(2, "SpringBoot");
		System.out.println("총 객체 수 : "+list.size());
		System.out.println(list.get(2));
		
		System.out.println("------------------------");
		
		//삭제 remove(index), remove(객체명)
		String removeStr = list.remove(0);
		System.out.println(removeStr);
		System.out.println(0);
		
		for(int i=-0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		boolean re = list.remove("HTML5");
		System.out.println(re);
		
		list.clear();
		System.out.println("총 객체 수 : " + list.size());
		System.out.println("ArrayList가 비어있는가 ? " + list.isEmpty());
		
		//매개변수에 모든 객체를 받을 떄 <Object>
		ArrayList alist2 = new ArrayList();
		
		alist2.add(1);
		alist2.add(3.1415);
		alist2.add("56");
		alist2.add(new String("88"));
		
		Object obj1 = alist2.get(0);
		int num = (int)obj1;
		double douNum = (double)alist2.get(1);
		int strNum1 = Integer.parseInt((String)alist2.get(2));
		int strNum2 = Integer.parseInt((String)alist2.get(3));
		System.out.println(num + douNum + strNum1 + strNum2);
	}

}
