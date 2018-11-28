package F_OOP2;

public class CastingTest {
	public static void main(String[] args) {
		FireCar fc = new FireCar(); //자식의 인스턴스를 먼저 만들어야 부모로 바꾸거나 자기 자신으로 다시 바꿀 수 있음
		fc.water();
		
		Car c = fc; //up-casting
		c.drive();
		
		FireCar fc2 = (FireCar)c; //down-casting
		fc2.water();
		
//		FireCar fc3 = (FireCar)new Car();
		
	}
}


class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("순천으로 가자");
	}
	
	void stop(){
		System.out.println("주차 중");
	}
}

class FireCar extends Car{
	void water(){
		System.out.println("물뿌려");
	}
}

class Ambulandce extends Car{
	void AED(){
		System.out.println("200줄 차지");
	}
}




















