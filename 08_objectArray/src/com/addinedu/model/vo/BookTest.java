package com.addinedu.model.vo;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		/*Book b1 = new Book();
		b1.setTitle("혼자 공부하는 자바");
		b1.setAuthor("신용건");
		b1.setPrice(32000);
		b1.setPublisher("한빛미디어");
		
		Book b2 = new Book("마이바티스 프로그래밍","이동국", 25000,"에이콘");
		Book b3 = new Book(); //사용자로부터 입력 받기
		*/		
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.print("도서명 입력 : ");
		b3.setTitle(scan.nextLine());
		
		System.out.print("저자명 입력 : ");
		b3.setAuthor(scan.nextLine());
		
		System.out.print("도서가격 입력 : ");
		b3.setPrice(scan.nextInt());
		scan.nextLine();
		System.out.print("출판사 입력 : ");
		b3.setPublisher(scan.nextLine());
		*/
		/*
		System.out.println(b1.information());
		System.out.println(b2.information());
		System.out.println(b3.information());
		
		Book b4 = new Book(title, author, price, publisher);
		*/
		//일반 변수에 3권의 책을 입력
		Book book1 = null;
		Book book2 = null;
		Book book3 = null;
		
		for(int i=1; i<=3; i++) {
			
			System.out.print("도서명 입력 : ");
			String title = scan.nextLine();
			
			System.out.print("저자명 입력 : ");
			String author = scan.nextLine();
			
			System.out.print("도서가격 입력 : ");
			int price = scan.nextInt();
			scan.nextLine();
			System.out.print("출판사 입력 : ");
			String publisher = scan.nextLine();
			// 매번검사
			if(i==1)
				book1 = new Book(title, author, price, publisher);
			else if(i==2)
				book2 = new Book(title, author, price, publisher);
			else if(i==3)
				book3 = new Book(title, author, price, publisher);
		
		}
//		System.out.println(b1.information());
//		System.out.println(b2.information());
//		System.out.println(b3.information());
		
		System.out.println("검색할 책 제목 : ");
		String search = scan.nextLine();
		
		if(book1.getTitle().equals(search))
			System.out.println(book1.information());
		else if(book2.getTitle().equals(search))
			System.out.println(book2.information());
		else if(book3.getTitle().equals(search))
			System.out.println(book2.information());
	}

}
