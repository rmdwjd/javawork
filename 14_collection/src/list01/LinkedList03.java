package list01;

import java.util.*;

public class LinkedList03 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(3);
		list.add(1,5);
		list.addFirst(1);
		list.addLast(7);
		
		for(int i : list)
			System.out.println(i);
		System.out.println("---------");
		
		list.remove();
		for(int i : list)
			System.out.println(i);
	}

}
