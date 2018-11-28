package Y_exam;

public class Exam_02 {
	public static void main (String[] args) {
		
		/*
		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
			      
			      1byte   2byte   4byte   8byte
			논리형  boolean
			문자형                char
			정수형   byte    short    int     long 
			실수형                            float   double
		
	
		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
		(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
		초기화 하는 한 줄의 코드를 적으시오.
			
			long regNo = 8910212468518L; =>int로 판단하기 때문에 'L'을 붙여야 함
		
		
		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
			
			int i = 100;
			long l =100L;
			final float PI = 3.14f;
			
			- 리터럴 : 100, 100L, 3.14f //변수의 값
			- 변수 : i, l  //변수명
			- 키워드 : int, long, final float //자바에서 정해준 의미를 가지고 있는 단어 (예약어는 보라색임)
			- 상수 : PI //변하지 않는 값, 상수는 대문자로 표시
		
		
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은? 답: b
			
			a. int
			b. Byte => 변수는 대문자 사용하지 않음
			c. double
			d. boolean
		
		
		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오류’라고 적으시오.
			
			System.out.println(“1” + “2”) → (12) => String + String => String "12"
			
			System.out.println(true + “”) → (true) => boolean + String => String + String => String "true"
		    
		    System.out.println(‘A' + 'B') → (131) => char + char => char a = 'A';                => int + int => int 131
			 													    int a1 = (char)a;
			 													    System.out.println(a1); //65
			 												     => char b = 'B';
			 												        int b1 = (char)b;
			 												        System.out.println(b1); //66												  
			                                                     //자바 연산은 기본 4byte이기 때문에 4byte형 보다 작은 것끼리 연산하면 4byte인 int형으로 바꿔서 계산함
			                                                     //4byte형 보다 큰 타입이 있으면 큰 쪽으로바꿔서 계산함
			                                                      
			System.out.println('1' + 2) → (51) => char + int => char a = '1';                 =>int + int => int 51
															    int a1 = (char)a;
															    System.out.println(a1); //49
			
			System.out.println('1' + '2') → (99) => char + char => char a = '1';                 =>int + int => int 99
																   int a1 = (char)a;
																   System.out.println(a1); //49
															    => char b = '2';
															       int b1 =  (char)b;
															       System.out.println(b1); // 50 
			
			System.out.println('J' + “ava”) → (Java) => char + String => String + String => String "Java"
			
			System.out.println(true + null) → (오류) => null은 모든 참조형의 기본값인 주소이기 때문에 String이 아님
			                                        => String을 제외한 기본형끼리만 연산가능하기 때문에 주소와 값을 연산 할 수 없음
		
		
		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오) 답: b, c, d
			
			a. if
			b. True => true
			c. NULL => null
			d. Class => class
			e. System
		      
		
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오) 답: a, d, e, g
			
			a. $ystem 
			b. channel#5 
			c. 7eleven 
			d. If 
			e. 자바 
			f. new 
			g. $MAX_NUM 
			h. hello@com 
			  // c. 숫자로 시작해서는 안됨
			  // b. h. 특수문자는 '_', '$'만 사용가능
		      // f. 예약어는 사용 불가
		        
		       
		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고르시오) 답: a, d
			
			a. int
			b. long => 8byte
			c. short => 2byte
			d. float
			e. double => 8byte
			  // 참조형변수의 크기는 4byte
		
		
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오) 답: d, e
			
			byte b = 10; 
			char ch = 'A'; 
			int i = 100;
			long l = 1000L;
			
			a. b = (byte)i; => i는 int이므로 byte로 바꿀때 형변환 필요
			b. ch = (char)b; => b는 byte이므로 char로 바꿀때 형변환 필요
			c. short s = (short)ch; => ch는 char이므로 short로 바꿀때 형변환 필요
			d. float f = (float)l; => l은 long이므로 float로 바꿀때 형변환 생략 가능
			e. i = (int)ch; => ch는 char이므로 int로 바꿀때 형변환 생략 가능
	          // byte->short->int->long->float->double
	                           ^
	                           |
	                     char---     	
		
		
		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오) 답: 0 ~ 65,535
				
			char는 2byte = 16bit
			최소값 0 ~ 최대값 2^16-1 = 65,535
				
				
		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오) 답: a, b, c, d
		
			a. byte b = 256; => 1byte는 8bit, 최소값 -2^7 ~ 최대값 2^7-1 = 127
			b. char c = ''; => 빈칸으로 둘 수 없음
			c. char answer = 'no';=> char는 하나의 문자만 저장함 
			d. float f = 3.14 => 'f', ';'필요
    		e. double d = 1.4e3f; => double이 float의 범위를 포함함, (double)1.4e3f;
		
		
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오) 답: c, e, f
			
			a. boolean - false 
			b. char - '\u0000' => 유니코드 문자체계
			c. float - 0.0 => float의 기본값은 0.0f
			d. int - 0
			e. long - 0 => long의 기본값은 0L
			f. String - "" => String의 기본값은 null		
		*/
	
		
		
		
		
		
				
		
	}
}
