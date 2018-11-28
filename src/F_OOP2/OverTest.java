package F_OOP2;

public class OverTest {
	public static void main(String[] args) {
		
		OverGo og = new OverGo();
		String str =  og.upMethod();
		
		
		
		
	}
}


class OverUp{ //부모
	int x = 3;
	int y = 3;
	
	String upMethod(){
		return "하이" + x + y;
	}
	
}

class OverGo extends OverUp{ //자식
	int z = 5;
	
	
	String upMethod(){
		return x + y + z + "오버라이드"; //부모에 있는 메서드를 재정의 해서 쓰는것
	}
	
	String upMethod(int k){
		return x + y +  z + "오버로딩";
	}
	
//	String upMethod(int k){
//		return super.upMethod(); //자식에서만 쓸 수 있음
//	}
	
	
	
	
}















