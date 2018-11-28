package C_sentence;

import java.util.Scanner;

public class Sentence_05 {
	public static void main(String[] args) {
		/*
		1. while문
		  - 반복횟수를 모를때 사용한다.
		  - 조건식과 수행해야될 블럭{}으로 구성되어있다.
		  - 구조
		  	while(조건식){
		  	
		  	}
		*/
		
		//1. 3~33까지의 합계를 구하세요.
		
//		int sum = 0;
//		int i = 3;
//		while(i < 34){
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		
		//1-1. 3~33까지의 짝수 합계를 구하세요
		
//		int sum = 0;
//		int i = 3;
//		while(i < 34){
//			if(i % 2 == 0){
//				sum += i;
//			}	
//			i++;	
//		}
//		System.out.println(sum);
		
		//2. for문으로 구구단을 출력해주세요
		
//		for (int j = 2; j < 10; j++){
//			for (int i = 1; i <10; i++){
//				System.out.println( j + " * " + i + " = " + j * i);
//			}
//		}
		
		//3. 2번의 for문을 while문으로 변경해주세요
//		(case1)
//		int j = 1;
//		int i = 1;
//		
//		while (j < 10){
//			j++;
//			while (i < 10){
//				System.out.println(j + " * " + i + " = " + j * i);
//				i++;
//			}
//			i = 1;
//		}
//		
//		(case2)
//		int x = 2;
//		while (x < 10){
//			int y = 1;
//			while(y < 10){
//				System.out.println(x + " * " + y + " = " + x * y);
//				y++;
//			}
//			x++;
//		}
		
		
		//3-3. 짝수단의 홀수곱만 출력하시오

//		(case1)
//		int x = 2;
//		while (x < 10){
//			if(x % 2 ==0){
//				int y = 1;
//				while(y < 10){
//					if(y % 2 ==1){
//						System.out.println(x + " * " + y + " = " + x * y);	
//					}
//					y++;
//				}
//			}
//			x++;
//		}
		
//		(case2)
//		int x = 2;
//		while (x < 10){
//			int y = 1;
//			while(y < 10){
//				if(x % 2 ==0 && y % 2 ==1){
//					System.out.println(x + " * " + y + " = " + x * y);	
//				}
//				y++;
//			}
//			x++;
//		}
		
		//4. 1~? 더했을때 합계가 100이상이 되는가?
//		int x = 0;
//		int sum = 0;
//		
//		while(sum < 100){	
//			x++;
//			sum +=x;
//		}
//		System.out.println(x);
		
		//9404-1845
		
		//5. 사용자로부터 시작하는 숫자와 끝나는 숫자를 입력받으세요
		//   시작하는 숫자부터 끝나는 숫자 중 5의 배수의 합계를 구하세요
		//   단, while문을 이용하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작하는 숫자");
		int x = sc.nextInt();
		
		System.out.println("끝나는 숫자");
		int y = sc.nextInt();
		
		int sum = 0;
		while (x < y+1){
			if (x % 5 ==0){
			sum += x;
			}
			x++;
		}
		System.out.println(sum);		
		
		
		
		
		
		
		
	}
}
