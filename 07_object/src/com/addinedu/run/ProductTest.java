package com.addinedu.run;

import com.addinedu.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product("1A","mp3", "동묘", 50000, 3.5);
		Product p2 = new Product("11B", "카메라", "용산", 150000, 3.5);
		Product p3 = new Product("2C", "캠코더", "종로", 100000, 3.5);
		
		System.out.println(p1.informaition());
		System.out.println(p2.informaition());
		System.out.println(p3.informaition());
		
		System.out.println("==============================");
		
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		
		p1.setTax(0.05);
		p2.setTax(0.05);
		p3.setTax(0.05);
		
		System.out.println(p1.informaition());
		System.out.println(p2.informaition());
		System.out.println(p3.informaition());
		
		System.out.println("==============================");
		
		System.out.println("p1의 실제 가격 : "+( p1.getPrice() + (p1.getPrice()*p1.getTax()) ));
		System.out.println("p2의 실제 가격 : "+( p2.getPrice() + (p2.getPrice()*p2.getTax()) ));
		System.out.println("p3의 실제 가격 : "+( p3.getPrice() + (p3.getPrice()*p3.getTax()) ));
		
	}

}
