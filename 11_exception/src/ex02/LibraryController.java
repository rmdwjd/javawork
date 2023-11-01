package ex02;

import
java.util.ArrayList;
import java.util.Scanner;

public class LibraryController {
	private Member mem;
	private Book book;
	ArrayList<Book> bList = new ArrayList<Book>();
	ArrayList<Member> mList = new ArrayList<Member>();
	
	void insertMember() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 멤버의 이름, 나이, 성별을 입력해주세요");
		String name1 = sc.next();
		int age1 = sc.nextInt();
		char gender1 = sc.next().charAt(0);
		mem.setName(name1);
		mem.setAge(age1);
		mem.setGender(gender1);
		mList.add(mem);
		
	}
	public void insertBook(){
		bList.add(new Book("java","신용권","한빛미디어"));
		bList.add(new Book("oracle","아무개","DBI"));
		bList.add(new Book("spring","홍길동","한빛미디어"));
	}
	public ArrayList<Book> selectAll(){
		return bList;
	}
	public Book searchBook(String keyword) {
		for(int i=0; i<bList.size(); i++) {
			if(bList.isEmpty()) {
				System.out.println("책이 없습니다");
				break;
			}
			else if(keyword.equals(bList.get(i).getTitle())) {
			book  = bList.get(i);
			break;
			}
		}
		return book;
	}
	public int rentBook(int index) {
		return index;
	}
	/*
	void insertBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 책의 제목, 저자, 출판사를 입력해주세요");
		String title1 = sc.nextLine();
		String author1 = sc.nextLine();
		String publisher1 = sc.nextLine();
		book.setTitle(title1);
		book.setAuthor(author1);
		book.setPublisher(publisher1);
		bList.add(book);
		
	}
	*/
}
