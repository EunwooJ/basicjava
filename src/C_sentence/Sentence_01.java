package C_sentence;

public class Sentence_01 {
	public static void main(String[] args) {
			
		/*
		1. 조건문 (if, switch)
		  - 조건식과 실행될 문장을 포함하는 블럭{} 으로 구성되어 있다.
		  - 조건식의 결과에 따라서 프로그램을 실행하는 흐름이 달라진다.
		
		2. if문
		  - 구조
		    1) 기본
		      if (조건식){
		              조건식이 true일때 수행
		      }
		      
		    2) 1단변형
		      if(조건식){
		             조건식이 true일때 수행
		      } else{
		            조건식이 false일때 수행
		      }  
		      
		    3) 2단변형
		      if(조건식1){
		             조건식1이 true일때 수행
		      } else if(조건식2){
		            조건식1이 false이고 조건식2가 true일때 수행
		      } else {
		      	조건식1이 false이고 조건식2가 false일때 수행
		      } 
		*/
		
		int a = 5;
		if(a % 2 == 0){
			//"짝수이다"출력
			System.out.println("짝수이다.");
		} else {
			System.out.println("홀수이다.");
		}
		
	    //1. 변수 a1에 정수값을 입력해주세요	
		int a1 = 0;
		
		//2. 변수 a1에 값이 음수이면 "음수이다" 출력, 양수이면 "양수이다" 출력, 0이면 "0이다"출력
		if(a1 < 0){
			System.out.println("음수이다");
		} else if(a1 > 0){
			System.out.println("양수이다");
		} else{ 
			System.out.println("0이다");
		}	
		
		//1. 변수 a2를 선언하고 a2에 0~100사이의 랜덤한 점수로 초기화 하세요
		int a2 = (int)(Math.random()*101+0);
			System.out.println(a2);
			
		//2. a2의 값이 90이상이면 "A"를 출력하세요
		//          80이상이면 "B"를 출력하세요
		//          70이상이면 "C"를 출력하세요          
		//          60이상이면 "D"를 출력하세요
		//          60미만이면 "나가"를 출력하세요
		if(a2 >= 90){
			System.out.print("A");
			if (a2 >= 95){
				System.out.println("+");
			} else {
				System.out.println("-");
			}			
		} else if(a2 >= 80){
			System.out.print("B");
			if (a2 >= 85){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else if(a2 >= 70){
			System.out.print("C");
			if (a2 >= 75){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else if(a2 >= 60){
			System.out.print("D");
			if (a2 >= 65){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else {
			System.out.println("나가");
		}
		
		/*
		2. switch-case
		  - 조건의 수가 많을 때는 if문 보다는 switch문을 많이 사용한다.
		  - 구조
		    switch(조건식){  //연산결과 또는 값
		    	case 값1 :
		    		조건식 == 값1을 수행
		    		break;
		    	case 값2 :
		    		조건식 == 값2을 수행
		    		break;
				case 값3 : 
					조건식 == 값3을 수행
					break;
				default : 
					조건식과 만족하는 값이 없을 때 수행
			}
		*/
		
		int a3 = 2;
		switch(a3){
		case 1 : 
			System.out.println("a3는 1이다");
			break;
		case 2 : 
			System.out.println("a3는 2이다");
			break;
		case 3 : 
			System.out.println("a3는 3이다");
			break;
		default :
			System.out.println("a3는 1,2,3이 아니다");
		}
		
		
		//문제1
		//1. 1~5사이의 랜덤한 정수값을 a4라는 변수에 저장해주세요
		int a4 = (int)(Math.random()*5+1);
			System.out.println(a4);
			
		//2. a4의 값이 5이면 "강남에 32평 아파트 당첨"
		//   a4의 값이 4이면 "강남에 24평 아파트 당첨"
		//   a4의 값이 3이면 "포르쉐 파나메라 당첨(풀옵)"
		//   a4의 값이 2이면 "200만원대 자전거 당첨"
		//	 a4의 값이 1이면 "영민빌딩 내놔"
		switch(a4){
		case 5 : 
			System.out.println("강남에 32평 아파트 당첨");
			break;
		case 4 : 
			System.out.println("강남에 24평 아파트 당첨");
			break;
		case 3 : 
			System.out.println("포르쉐 파나메라 당첨(풀옵)");
			break;	
		case 2 : 
			System.out.println("200만원대 자전거 당첨");
			break;
		default : 
			System.out.println("영민빌딩 내놔");
		}	
		
		//문제2
		//2. 위의 if문을 switch로 바꿔오세요 	
		int a5 = (int)(Math.random()*101+0);
		System.out.println(a5);

		switch(a5/10){
		case 10 : case 9 : 
			System.out.println("A");
			break;
		case 8 : 
			System.out.println("B");
			break; 	
		case 7 : 
			System.out.println("C");
			break;
		case 6 : 
			System.out.println("D");
			break;
		default : 
			System.out.println("나가");	
		}
		
		
		
		
		
		
		
		
		
		
		}
}
