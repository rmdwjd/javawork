package polyEx08;

public class Buyer2 {
	int money = 5000;
	int bonusPoint;
	Product[] proList = new Product[3];
	int count;
	
	void buy(Product p){
		if(money < p.price) {
			System.out.println("잔액 부족으로 물건 구매 불가능");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		proList[count++] = p;
		
		System.out.println(p + " 구입");
	}
	void buyList() {
		//물건을 산 총 금액
		//물건 list
		int sum = 0;
		String list="";
		
		for(Product pro : proList) {
			sum += pro.price;
			list += pro.toString()+" ";
		}
		
		/*
		for(int i=0; i<proList.length; i++) {
			sum += proList[i].price;
			list += proList[i]+" ";
		}
		*/
		System.out.println("구입한 물품의 총합계 : "+sum+" 만원입니다");
		System.out.println("구입한 물품의 리스트 : "+list);
		
	}
}
