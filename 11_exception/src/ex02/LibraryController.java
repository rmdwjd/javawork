package ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryController {
	Scanner sc = new Scanner(System.in);
	ArrayList<Member> mList = new ArrayList<Member>();
	ArrayList<Book> bList = new ArrayList<Book>();
	
	void insertMember() {
		for(Member mem:mList) {
			System.out.print("이름을 적");
		}
	}
}
