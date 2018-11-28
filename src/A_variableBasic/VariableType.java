package A_variableBasic;

public class VariableType {
	public static void main(String[] args){
		/*
		변수의 타입
		
		1. 기본형타입(primitive type)
			-boolean, char, byte, short, int, long, float, double
		
		2. 참조형타입(reference type)
		 	-주소를 저장한다. (4byte)
		
		3. 종류
		 	- 논리형: true와 false만을 값으로 갖는다. 조건식과 논리적 계산에 많이 사용한다. ex)boolean
		 	- 문자형: 문자를 하나 저장하는데 사용한다. ex)char
		 	- 정수형: (소수점이 없는) 정수값을 저장하는데 사용한다. ex)byte, short, int, long
		 	- 실수형: (소수점 o)실수값을 저장하는데 사용한다. ex)float, double
		4. 크기 (1byte=8bit)
		 	- 1byte: boolean, byte
		 	- 2byte: char, short
		 	- 4byte: int, float
		 	- 8byte: long, double
		
		5. 논리형 - boolean(기본값 false)
		  - boolean형 변수는 true와 false 중 하나의 값을 저장할 수 있다.
		  - 대답 (YES, NO), 스위치(ON/OFF)등의 논리구현에 주로 사용한다.
		  - 1byte의 크기를 가진다.
	
		 */
	
		
		
//		변수의 선언
//		[변수의타입]  [변수명];
		//true의 값을 저장할 수 있는 변수 power를 선언 및 초기화 해주세요
		
		
		boolean power = true;
		boolean poweroff = false;
		
		
		
		/*
		6. 문자형 - char('\u0000')
		  - 문자 하나를 저장하는 용도로 사용된다.
		  - java는 Unicode문자 체계를 이용한다.
		  - 2byte의 크기를 가진다.
		
		*/
		// code라는 변수에 'A'를 저장해 주세요
		
		char code = 'A';
		char code2 = '\u0041';
		char code3 = 65;
		
		System.out.println(code);
		
		
		
		/*
		7. 정수형 - byte, short, int, long
		  - 기본자료형은 int형이다.
		  - 변수에 저장하고자 하는 정수값의 범위에 따라 4개중 하나를 선택해야 한다.
		   
		 */
		// byte 타입의 변수 b1에 150의 값을 저장해 주세요
		byte b1 = 100;
		// 9508312111111
		long b2 = 9508312111111L;
		
		/*
		8. 실수형 - float, double(기본형)
		  - 실수형 값을 저장하는데 사용된다.
		  - float: 1+8+23
		  - double: 1+11+52
		*/
		// 3.14159254863
		double pi = 3.14159254863;
		float pi2 = 3.14159254863F;
		
		System.out.println(pi);
		System.out.println(pi2); //소수점 아래 7자리까지만 표현 가능
		
		
		double d2 = 0.5; 
		float f2 = 0.5f;
		
		System.out.println(d2 == f2); //double은 2의 n승으로 표현되기때문에 0.1에 근사치값이 됨, 따라서 false가 나옴. 0.5/0.25/0.125값만 true
									  // 노란줄표시 나오면 true	
		
		
		/*
		9. 문자열 -String (참조형이지만 기본형처럼 사용)
		
		*/
		String str = "========\n--------"; //한정없음, 특수문자 가능, 무제한, '\는 사용불가' '\\'는 하나로 인지해서 사용가능
										   //\t는 tap, \n은 newline
		System.out.println(str);
		
		
		/*
		10. overflow
			- 자신이 표현할 수 있는 값을 넘었을 때 최소값으로 돌아가는 현상
		*/
	
		byte c1 = 126;
		System.out.println(c1); //126
		c1++;
		System.out.println(c1); //127
		c1++;
		System.out.println(c1); //-128
		c1++;
		System.out.println(c1); //-127
		
		
		/*
		11. 형변환(casting)
			- 기본형 간에는 다른 타입으로 변환이 가능하다.
			- byte -> short -> int -> long => float -> double
                                ^
                                |
			              char---
		*/
		
		int a2 = 130;
		byte b3 = (byte) a2;   //형태가 바뀌면서 overflow됨
		System.out.println(b3); //-126
		
		int a3 = 65;
		char c3 = (char) a3;   //int형태인 a3을 char형태로 변환 
		System.out.println(c3);
		
		char c4 = 'B';
		int i4 = c4; //char가 int로 바꿀때  char가 int를 다 커버할 수 있는 범위여서 (int)쓰지 않아도 사용 가능
		
		long aa = 180;
		short ff = (short) aa;
		
		/*
		12. 문자열 결합
		*/
		
		System.out.println(55 + 10);
		System.out.println("하이" + 55);   //"하이" + "55" => 하이55
		System.out.println("45" + 20);
		System.out.println("56" + "32");
		System.out.println("" + 45);
		System.out.println(true + "34");
		System.out.println('T' + "G" + 45);
		System.out.println('A' + 4 + "44"); //앞에서부터 더해서 큰쪽으로 바뀜, char A가 int로 바뀌면 65
		
		
		
		
		
		
		
		//
		
		
	}
}
