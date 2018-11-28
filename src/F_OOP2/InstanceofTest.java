package F_OOP2;

public class InstanceofTest {
	public static void main(String[] args) {
		FireCar fc = new FireCar();
		
		if(fc instanceof FireCar){
			System.out.println("fc는 FireCar의 인스턴스이다");
			FireCar fc2 = fc; 
		}
		
		if(fc instanceof Car){
			System.out.println("fc는 Car의 인스턴스이다");
			Car fc3 = fc;
		}
		
		if(fc instanceof Object){
			System.out.println("fc는 Object의 인스턴스이다");
			Object fc4 = fc;
		}
		
		Car c = new Car();
		if(c instanceof Car){
			System.out.println("c는 Car의 인스턴스이다");
			Car fc4 = c;
		}
	

		
	}
}


