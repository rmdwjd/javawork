package polyEx09;

import java.util.ArrayList;

public class Introduce {
	 ArrayList<Pet> aList = new ArrayList<Pet>();
	
	 void pkind(Pet p) {
		 aList.add(p);
		 System.out.println("키우는 동물은 : "+p);
	 }
	 
	 void pintro() {
		 for(int i=0; i<aList.size(); i++) {
			 Pet p1 = aList.get(i);
			 System.out.println(p1.kind + " 색은 : "+p1.color+"입니다.");
		 }
	 }
}
