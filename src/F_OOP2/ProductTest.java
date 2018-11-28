package F_OOP2;

import java.util.Vector;

public class ProductTest {
	public static void main(String[] args) {
		Tv2 t2 = new Tv2("LGTV", 700);
		System.out.println(t2); //toString 없이는 주소만 나옴
		NoteBook nb = new NoteBook("Mac", 400);
		MicroWave mw = new MicroWave("LG", 200);
		
		Buyer b = new Buyer("이상엽", 1000);
		
		b.buy(t2);
		b.buy(nb);
		b.buy(mw);
		
		System.out.println("처음산 물건 : " + b.item.get(0));
		//고객님의 잔여금은 xxx이고, 보너스 포인트는 xxx입니다.
		System.out.println("상엽님의 잔여금은 " + b.money + "이고, 보너스 포인트는" + b.bonusPoint + "입니다");
		System.out.println();
		
		b.refund(nb);
		System.out.println("고객님의 환불 후 금액은 "+ b.money + "입니다");
		System.out.println("고객님의 환불 후 보너스 포인트는" + b.bonusPoint + "입니다");
		System.out.println();
		
		b.summary();
	}
}

class Product{
	
	String name;
	int price;
	int bonusPoint;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
		bonusPoint = price/10;
	}
}

class Tv2 extends Product{
	Tv2(String name, int price){
		super(name, price);
	}
	
	@Override
	public String toString() {   //주소쓰는게 싫어서 새로 만들어줌
		return name;
	}
}

class NoteBook extends Product{
	NoteBook(String name, int price){
		super(name, price);
	}
	
	@Override
	public String toString() {   
		return name;
	}
}


class MicroWave extends Product{
	MicroWave(String name, int price){
		super(name, price);
	}
	
	@Override
	public String toString() {   
		return name;
	}
}

class Buyer{
	String name;
	int money;
	int bonusPoint;
	Vector<Product> item  = new Vector<Product>();
	
	Buyer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("구매불가");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"를 구매하셨습니다");
		item.add(p);
//		System.out.println("고객님의 남은돈"+money);
//		System.out.println("고객님의 포인트"+bonusPoint);
	}
	
	//1. 반품 refund 메서드
	//   구매물품이 없으면 "구매하신 물품이 없습니다."
	//	  구메물품은 있으나 우리 매장에서 산게 아니다
//case1)	
	void refund(Product p){
		if(item.remove(p)){
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println("환불금액은 " + p.price + "입니다");
			System.out.println("차감 포인트는 " + p.bonusPoint + "입니다");
			System.out.println();
		} else if(item.isEmpty()) {
			System.out.println("구매하신 물품이 없습니다.");
		} else {
			System.out.println("우리매장에서 산게 아닙니다.");
		}
		return;
	}

//case2)	
//	void refund(product p){
//		if(item.isEmpty()){
//			System.out.println("구매하신 물품이 없습니다");
//			return;
//		}
//		
//		for(int i = 0; i < item.size()l i++){
//			if(item.get(i)==p){
//				Product p2 = (Prouct)item.remove(i);
//				money += p2.price;
//				bonusPoint -= p2.bonusPoint;
//				System.out.println(p2 + "를 반품하셨습니다.");
//				return;
//			}
//		}
		
//case3)	
//		if(item.contains(p)){ //반품하려고 하는 객체를 포함하고 있으면 true
//			item.remove(p);
//			money += p.price;
//			bonusPoint -= p.bonusPoint;
//			System.out.println(p + "를 반품하셨습니다.");
//		}
	
	
	
	//2. 영수증 summary 메서드
	/*
	  	  영	   수	   증
	  	  
	구매물품 LGTV    700만원
	      Mac     400만원
	      LG전자렌지 200만원  		
	총 구매 금액 	 1300만원
	고객님의 남은돈	 8700만원
	         포인트      130만점
	또 오십시오 고객님~
	         
	 */
	void summary(){
		System.out.println("\t영\t수\t증");
		System.out.println();
		System.out.print("구매물품 ");
		for(int i = 0; i < item.size(); i++){
//			System.out.println(((Product)item.get(i)).name + "\t" +((Product)item.get(i)).price + "만원");
//			System.out.println(item.get(i).name + "\t" + item.get(i).price + "만원"); //위에서 벡터 형을 정해줘서 캐스팅 없이 사용 가능
			Product pd =(Product)item.get(i);
			System.out.print("\t" + pd.name);
			System.out.println("\t" + pd.price + "만원");
		}
		
		int sum = 0;
		for(int i = 0; i < item.size(); i++){
			Product pd =(Product)item.get(i);
			sum += pd.price;
		}
		System.out.println("총 구매 금액" + "\t" + sum +"만원");
		System.out.println("고객님의 남은돈" + "\t" + money + "만원");
		System.out.println("         포인트"+"\t " + bonusPoint + "만점");
		System.out.println("또 오십시오 고객님~");
		
		return;
	}
	
}

//3. 사람 여려명을 관리할 수 있는 클래스를 작성해주세요
// 	 사람은 이름으로 구분

//4. 물품을 관리할 수 있는 클래스를 만드세요




















