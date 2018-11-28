package F_OOP2;

public class InterfaceTest {
	public static void main(String[] args) {
		Fight f = new Fight();
		
		if(f instanceof Unit2){
			System.out.println("f는 Unit2의 인스턴스 이다.");
			Unit2 u2 = f;
		}
		
		if(f instanceof Fightabel){
			System.out.println("f는 Fightable인터페이스를 구현했다.");
			Fightabel f2 = f;
			
		}
		
		if(f instanceof Movabel){
			System.out.println("f는 Fightable인터페이스를 구현했다.");
			Fightabel f2 = f;
			
		}
		
		
		
	}
}

class Unit2{
	int x;
	int y;
	int currentHp;
}

interface Movabel{
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit2 u);
}

interface Fightabel extends Movabel, Attackable{
	
}

class Fight extends Unit2 implements Fightabel{

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit2 u) {
		
	}
	
}
























