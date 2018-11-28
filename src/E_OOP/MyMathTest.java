package E_OOP;

import java.util.Scanner;

public class MyMathTest {
	public static void main(String[] args) {
		
//		MyMath.add();
//		
//		MyMath ab = new MyMath();
//		ab.add2(10);  //인자값
//		
//		MyMath.add3(1, 2.2f);
//		
//		ab.add4(1, 2, 'A');
//		
//		int result = MyMath.add5(7);
//		System.out.println(result);
//		
//		int result2 = ab.add6(10, 5);
//		System.out.println(result2);
//		
//		long result3 = ab.multiply(300000000, 30000000);
//		System.out.println(result3);
//		
//		float result4 = ab.divide(15, 7);
//		System.out.println(result4);
		
		
		//인스턴스만들기
		MyMath mm = new MyMath();
		
		//숫자a입력
//		int a = mm.a();	
		//사칙연산입력
//		String str= mm.str();
		//숫자b입력
//		int b = mm.b();
		
		mm.methodA();

	}
}




class MyMath{
	
//	static int number = 50;
//	
//	static void add(){
//		System.out.println(number * 2);
//	}
//	
//	void add2(int a){ // 매개변수
//		System.out.println(number * a); //
//	}
//	
//	static void add3(int a, float c){
//		System.out.println(a*c);
//	}
//	
//	void add4(int c, int d, char e){
//		System.out.println(c+d+e); // 68
//	}
	
	// 클래스 메서드명은 add5
	// 매개변수는 int 하나
	// 수행내용 매개변수와 number의 합을 반환
	
//	static int add5(int a){
//		int result = a + number;
//		return result;
//	}
	
//	static int add5(int a){
//		return = a + number;
//	}
	
	int add7(int a, int b){
		int result = a + b;
		return result;
	}
	
	
	// 메서드명 add6
	// 매개변수 int 두개
	// 앞에 받은 값에서 뒤에 받은 값을 뺀 결과를 반환하는 메서드를 만드세요
	
	int add6(int a, int b){
		int result = a - b;
		return result;
	}
	
	// 인스턴스 메서드 multiply
	// int 두개
	// 두개의 수를 곱해서 반환해주세요
	// 단, overflow 고려해주세요
	
	long multiply(int a, int b){
		long result = (long)a * b;
		return result;
	}

	// 인스턴스 메서드 divide
	// int 값 두개
	// 앞의 값을 뒤의 값으로 나눈 결과를 반환해주세요
	// 단, 소수점 셋째자리에서 반올림하여 두번째 자리까지 표현해주세요.
	
	float divide(int a, int b){
		float result = (int)((float)a / b *100 +0.5f) / 100f;
		return result;
	}
	
	// 1.JVM그려오기!
	// 2.무한계산기/ c입력하면 초기화, x는 종료
		
	void methodA(){
		for(;;){
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력");
			int a = sc.nextInt();
			
			System.out.println("사칙연산 입력");
			String str= sc.next();
			if(str.equals("x")||(str.equals("X"))){
				System.out.println("종료");
				break;
			}
			
			System.out.println("숫자 입력");
			int b = sc.nextInt();
			
			if(str.equals("+")){
				System.out.println(add7(a, b));
			} else if(str.equals("-")){
				System.out.println(add6(a, b));
			} else if(str.equals("*")){
				System.out.println(multiply(a, b));
			} else if(str.equals("/")){
				System.out.println(divide(a, b));
			} 	
		}
	}	
	
}	




//		*이렇게 할 필요 없음
//		int a(){
//			System.out.println("숫자를 입력하세요");
//			Scanner sc = new Scanner(System.in);
//			int a = sc.nextInt();
//			return a;
//		}
	
//		int b(){
//			System.out.println("숫자를 입력하세요");
//			Scanner sc = new Scanner(System.in);
//			int b = sc.nextInt();
//			return b;
//		}
	
//		String str(){
//			System.out.println("사칙연산을 입력하세요");
//			Scanner sc = new Scanner(System.in);
//			String str = sc.next();
//			return str;
//		}
		
//		for(;;){
//			int a = a();
//			String str = str();
//			if(str.equals("x") || (str.equals("X"))){
//				System.out.println("종료");
//				break;
//			}
//			int b = b();
//			
//			if(str.equals ("+")){
//				System.out.println(add7(a, b));
//			} else if (str.equals ("-")){
//				System.out.println(add6(a, b));
//			} else if (str.equals ("*")){
//				System.out.println(multiply(a, b));
//			} else if (str.equals ("/")){
//				System.out.println(divide(a, b));
//			}
//		}	


	
	
	
	
