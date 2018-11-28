package E_OOP;

public class DoubleDiceTest {
	public static void main(String[] args) {
	
	//throwDice메서드를 호출하여라
		
	DoubleDice dd = new DoubleDice();
	
	int result = dd.throwDice();
	System.out.println("합계: " + result);		
	
	}
}


class DoubleDice{
	
	//인스턴스메서드 throwDice(두개 던져서 합친 값을 리턴)

	int throwDice(){
		int dice1 = (int)(Math.random()*6+1);
		System.out.println("첫번째주사위: " + dice1);
		int dice2 = (int)(Math.random()*6+1);
		System.out.println("두번째주사위: " + dice2);
		
		int result = 0;
		if( dice1 == dice2){
			result = dice1 + dice2 + throwDice();
		} else {
			result = dice1 + dice2;
		}
		return result;
	}
	
	
	
}
