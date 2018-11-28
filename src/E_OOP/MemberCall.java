package E_OOP;

public class MemberCall {
	
	int iv = 10;
	static int cv = 100;
	
	int iv2 = iv;
	int iv3 = cv;
	
	static int cv2 = cv;
//	static int cv3 = iv; (x)
	
	static void method(){
		cv = 500;
//		iv = 10; (x)
	}
	
	void method2(){
		cv = 1000;
		iv = 1000;
	}
	
	static void method3(){
		method();
//		method2();  (x)
	}
	
	void method4(){
		method();
		method2();
	}
	
	
	
	
	
	
	
	
	
	
}
