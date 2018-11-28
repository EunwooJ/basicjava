package E_OOP;

public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car();	
		Car c2 = new Car("red", "auto", 2 );
		Car c3 = new Car("yellow", "auto");
		
		
		
	}
}


class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		color = "black";
		gearType = "stick";
		door = 4;
	}
	
	Car(String color, String gearType){
		this();   //생성자 내부에서 다른 생성자를 호출할때 , 생성자의 가장 윗 부분에만 쓸 수 있음!
		this.color = color;                
		this.gearType = gearType;
	}
	
	Car(String color, String gearType, int door){
		this.color = color;                //전역변수와 지역변수의 이름이 같을 때 구분해 주기 위해 this 는 '이 인스터스에'라는 의미를 가짐, 인스턴스변수
		this.gearType = gearType;
		this.door = door;
	}
	
	
	
	
}
