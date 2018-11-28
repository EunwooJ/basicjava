package C_sentence;

import java.util.Scanner;

public class Sentence_06 {
	public static void main(String[] args) {
	
		/*
		1. do-while
		  - while문의 변형으로 기본구조는 while 비슷하다.
		  	 최소 1회는 블럭{}을 수행한다.
		  - 구조
		  	 do{
		  	 	수행될 문장;
		  	 }while(조건식);
		*/
		
//		int x = 0;
//		int sum = 0;
//		
//		while(sum < 100){	
//			x++;
//			sum +=x;
//		}
//		System.out.println(x);
		
//		int i = 0;
//		int sum = 0;
//		
//		do{
//			i++;
//			sum +=i;
//		}while(sum < 100);
		
		//1. 문자를 입력받는다.
		//2. 문자를 출력한다.
		//3. 문자에 "x"를 입력하면 종료한다
		
//		Scanner sc = new Scanner(System.in);
//		String str = "";
//		do{
//			System.out.println("문자를 입력해주세요");
//			str = sc.next();
//			System.out.println(str);
//		}while(!str.equals("x"));
		
		
		/*
		2. continue 
		  - 반복문 내에서만 사용 가능하다.
		  - 반복문의 끝으로 이동하여 다음 반복문으로 넘어간다.
		  - for문은 증감식으로 이동
		  - while문은 조건식으로 이동
		*/
		
//		for (int i = 0; i < 11; i++){
//			if(i%2==1){
//				System.out.println(i);
//			}
//		}
//		System.out.println("=========");
//		for (int i = 0; i < 11; i++){
//			if(i%2==0){
//				continue;            // 수행안하고 다음단계로 이동
//			}
//			System.out.println(i);
//		}
		
//		int x = 0;
//		int sum = 0;
//		
//		while(sum < 100){	
//			x++;
//			sum +=x;
//		}
//		System.out.println(x);
		
//		int aa = 1;
//		int sum = 0;
//		while(true){
//			sum += aa;
//			if(sum >= 100){
//				break;
//			}
//			aa++;
//		}
//		System.out.println(aa);
		
		for (int j = 2; j < 10; j++){
			if(j % 2 == 1){
				continue;
			}
			for (int i = 1; i <10; i++){
				if(i % 2 == 0){
					continue;
				}
				System.out.println( j + " * " + i + " = " + j * i);
			}
		}
		
		
		
}
}
