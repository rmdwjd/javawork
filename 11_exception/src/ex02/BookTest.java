package ex02;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		LibraryController lc = new LibraryController();
		lc.insertBook();
		ArrayList<Book> b = lc.selectAll();
		for(int i=0; i<b.size(); i++) {
			System.out.println(b.get(i));
		}
//		Member mem = new Member("김수연", 23, '남');                                                            
//		lc.insertMember(new Member("김수연", 23, '남'));
//		lc.myInfo();
//		
		Book searchBook = lc.searchBook("kkk");
		if(searchBook==null) {
			System.out.println("찿는 책이 없습니다");
		} else {
			System.out.println(searchBook);
		}
		
		int index = lc.rentBook(1);
		if(index < b.size()) {
			System.out.println("");
		System.out.println("=====빌려주는 책 정보=====");
		System.out.println(b.get(index));
		System.out.println("책을 대여함");
		} else {
			System.out.println("책이 없습니다");
		}
		
		
	}
		
	
	

}
