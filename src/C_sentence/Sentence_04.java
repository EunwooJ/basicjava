package C_sentence;

import java.util.Scanner;

public class Sentence_04 {
	public static void main(String[] args) {

		for(;;){
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력");
			int str = sc.nextInt();
			
			System.out.println("사칙연산 입력");
			String a= sc.next();
			if(a.equals("x")||(a.equals("X"))){
				break;
			}
			
			System.out.println("숫자 입력");
			int str2 = sc.nextInt();
			
			if(a.equals("+")){
				System.out.println(str + str2);
			} else if(a.equals("-")){
				System.out.println(str - str2);
			} else if(a.equals("*")){
				System.out.println(str * str2);
			} else if(a.equals("/")){
				System.out.println(str / str2);
			} 	
		}


		
	}
}