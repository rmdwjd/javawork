package com.addinedu.run2;

import java.util.Scanner;

import com.addinedu.model.vo2.*;

public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book("해리포터",12000,0.15,"조앤k롤링");
		Book b2 = new Book();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("책 이름 : ");
		b2.setTitle(sc.next());
		System.out.print("책 가격 : ");
		b2.setPrice(sc.nextInt());
		System.out.print("책 할인율 : ");
		b2.setDiscountRate(sc.nextDouble());
		System.out.print("책 저자 : ");
		b2.setAuthor(sc.next());
		
		
		System.out.println(b1.informaition());
		System.out.println(b2.informaition());
		
		System.out.println("=====================================");
		
		b1.setTitle("해리포터:비밀의 방");
		System.out.println(b1.informaition());
		
		System.out.println("=====================================");
		
		System.out.println("b1 할인된 가격 : " + ( b1.getPrice() - (b1.getPrice()*b1.getDiscountRate()) ));
		System.out.println("b2 할인된 가격 : " + ( b2.getPrice() - (b2.getPrice()*b2.getDiscountRate()) ));
	}

}
