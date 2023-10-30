package polyEx08;

public class Product {
	// 필드 : 제품의 가겨, 보녀스
	int price;
	int bonusPoint;

	Product(int price){
		this.price = price;
		bonusPoint = price/10;
	}

}

