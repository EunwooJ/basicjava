package Y_exam;

public class Exam_03 {
	public static void main(String[] args) {
		
		/*
		[Exercise3_1]
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		System.out.println(1 + x << 33); => 3 << 33 = 3 * 2^1 = 6
		 								 //int는 4byte, 32bit이므로 32칸을 돌고 제자리에 왔을 때 1칸만 이동한 것과 같다
		
		System.out.println(y >= 5 || x < 0 && x > 2); => x < 0 && x > 2
		                                                (false)&&(false) => false
		                                                y >= 5 || false
		                                                (true)           => true
		                                                
		System.out.println(y += 10 - x++); => y = y + 10 - x => y = 5 + 10 - 2 = 13
		                                      x = 3
		                                      
		System.out.println(x+=2); => x = x + 2 => 3 + 2 = 5
		
		System.out.println( !('A' <= c && c <='Z') ); => 'A' <= c && c <='Z'
														  (true)     (true)  => true
													  => !(true) = false 
		
		System.out.println('C'-c); => char 'C' - char 'A' => 67 - 65 = 2
								   //char 끼리의 연산은 int로 바뀜
		 
		System.out.println('5'-'0'); => char '5' - char '0' => x+5 - x = 5
									 //char 끼리의 연산은 int로 바뀜
		
		System.out.println(c+1); => char 'A' + int 1 => 65 + 1 = 66
							     //char와 int의 연산은 int로 바뀜
							      
		System.out.println(++c); => char 'A' => 'B'
		
		System.out.println(c++); => char 'A' => 'B'
		 
		System.out.println(c); => 'C'
		
		
		
		[Exercise3_2]
		
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = (1 <= numOfApples % sizeOfBucket && numOfApples % sizeOfBucket <= 9 ? (numOfApples / sizeOfBucket) + 1 : numOfApples / sizeOfBucket); // 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 :"+numOfBucket); => 13
	                      case2) numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket == 0 ? 0 : 1);
	
	    [Exercise3_3]
	
		int num = 10;
		System.out.println(0 > num ? "양수" : num < 0 ? "음수" : "0"); => 양수
	
	
        [Exercise3_4]
        
		int num = 456;
		case1) System.out.println(num / 100 * 100);	=> 400
	    case2) System.out.println(num - num % 100); => 400
	
	
	    [Exercise3_5]
	    
		int num = 333;
		case1) System.out.println(num / 10 * 10 + 1); => 331	
	    case2) System.out.println((num - num % 10) + 1); => 331
	
	
		[Exercise3_6]
		
		int num = 24;
		System.out.println((num / 10 + 1) * 10 - num); => 6
	
		[Exercise3_7]
		
		int fahrenheit = 100;
		float celcius = ((int)((5f/9 * (fahrenheit -32)) * 100 + 0.5f) / 100f);
								37.77778 * 100 = 3777.778 +0.5 = 3778.278
								(int)3778 /100f = 37.78	
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	
	
		[Exercise3_8]
		
		byte a = 10;
		byte b = 20;
		byte c = a + b; => int c = a + b; => 30
		                // byte끼리의 연산은 int로 바뀜
		
		char ch = 'A';
		ch = ch + 2; => ch = (char)(ch + 2); => C
						// char와 int의 연산은 int가 되므로 'C'가 나오려면 int에서 char로의 형변환이 필요함
						 
		float f = 3 / 2; => 3 / 2f; => 1.5
		                 => (float) 3/2;
		                   //소수점이 필요하므로 int값을 실수형인 float으로 바꿔줘야 하므로 f를 붙여줘야함
		long l = 3000 * 3000 * 3000; => 3000L * 3000L * 3000L; => 27000000000
		                             =>(long) 3000 * 3000 * 3000;
		                             //int가 표현할 수 있는 숫자 범위를 넘어섬으로 타입을 바꿔줘야함
		float f2 = 0.1f;
		double d = 0.1; =>0.1f;
		                // double은 2의 n승으로 표현되기 때문에 0.1에 가까운 수가 되므로 0.1이 아니기 때문에 float 0.1f와는 다른 값을 가져 false가 나옴 
		                // 0.5, 0.25, 0.125의 정확한 값과는 같은 값이므로 true가 될 수 있음
		                // 값에 f를 붙여 float과 같은 값을 만들어 줘야함
		                 * 
		boolean result = d==f2; => ture
		
	
		[Exercise3_9]
			
		char ch = 'z';
		boolean b = ( 'A' <= ch && ch <= 'Z' || 'a' <= ch && ch <= 'z' || '0' <= ch && ch <= '9' );
		System.out.println(b); => true
		
	
		[Exercise3_10]
		
  		char ch = 'A';
		char lowerCase = ( 'A' <= ch && ch <= 'Z' ) ? (char)(ch + 32) : ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		
	    */	

		
		
		}
}





