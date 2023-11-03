package set_map02;

import java.util.*;

public class set03 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		while(set.size()<6){
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
	
		//순서대로 출력
		//index 없기 때문에 할 수 없음 -> List 로 변경 후 사용
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	
	}

}
