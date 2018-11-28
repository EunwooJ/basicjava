package D_array;

import java.util.Scanner;

public class array_01 {
	public static void main(String[] args) {
		/*
		1. 배열(array)이란?
		  - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것.
		  - ex) 5명의 점수
		  	  int score1 = 100;
			  int score2 = 50;
			  int score3 = 30;
			  int score4 = 70;
			  int score5 = 63;
			  
		2. 배열의 선언
		  - 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 []를 붙여준다.
		    int[] a1;
		    int a2[];  //사용x		  
		*/
		
		/*
		3. 배열의 생성
		  - 배열을 선언한 다음에는 배열을 생성해야 한다.
		  - 배열생성을 위해서는 'new'와 함께 배열의 타입과 크기를 지정해 주면된다.
		  	int[] a = new int[3]; 
		 
		 */
		
		
//		int[] a = new int[3]; //int타입 3개 넣을 수 있음, 기본값 0,0,0
//		
//		int[] a2 = new int[]{3,4,5};
//		int[] a2;
//		a2 = new int[]{3,4,5};
//		
//		int[] a3 = {3,4,5};
//		int[] a3;
//		a3 = {3,4,5};
//		
//		int[] score = new int[4];
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//	
//		for(int i = 0; i<score.length; i++){
//			System.out.println(score[i]);
//		}
//		
//		
//		//1. score의 0번째 방에 10을저장해주세요.
//		score[0] = 10;
//		//2. score의 1번째 방에 20을저장해주세요.
//		score[1] = 20;
//		//3. score의 2번째 방에 30을저장해주세요.
//		score[2] = 30;
//		//4. score의 3번째 방에 40을저장해주세요.
//		score[3] = 40;
//		
//		for(int i = 0; i < score.length; i++){
//			score[i] = (i+1)*10;
//		}
//		
		//1. 207호의 자바초급 점수를 저장할 수 있는 변수를 선언 및 생성해주세요
//		int[] scr = new int[17];
		//2. 각 사람의 점수를 0~100점 사이의 랜덤한 정수값으로 저장해주세요
//		scr[0] = (int)(Math.random()*101+0);
//		scr[1] = (int)(Math.random()*101+0);
//		scr[2] = (int)(Math.random()*101+0);
//		scr[3] = (int)(Math.random()*101+0);
//		scr[4] = (int)(Math.random()*101+0);
//		scr[5] = (int)(Math.random()*101+0);
//		scr[6] = (int)(Math.random()*101+0);
//		scr[7] = (int)(Math.random()*101+0);
//		scr[8] = (int)(Math.random()*101+0);
//		scr[9] = (int)(Math.random()*101+0);
//		scr[10] = (int)(Math.random()*101+0);
//		scr[11] = (int)(Math.random()*101+0);
//		scr[12] = (int)(Math.random()*101+0);
//		scr[13] = (int)(Math.random()*101+0);
//		scr[14] = (int)(Math.random()*101+0);
//		scr[15] = (int)(Math.random()*101+0);
//		scr[16] = (int)(Math.random()*101+0);

//		for(int i = 0; i < scr.length; i++){
//			scr[i] = (int)(Math.random()*101+0);
		
		//2.5 각 사람의 점수를 출력해주세요
//			System.out.println((i+1) + "번 사람의 점수 = " + scr[i]);
		
		
		//3. 모든 사람의 합계를 구해주세요
		
//		int sum = 0;
//		sum += b1[0];
//		sum += b1[2];
//		sum += b1[3];
//		sum += b1[4];
//		sum += b1[5];
//		sum += b1[6];
//		sum += b1[7];
//		sum += b1[8];
//		sum += b1[9];
//		sum += b1[10];
//		sum += b1[11];
//		sum += b1[12];
//		sum += b1[13];
//		sum += b1[14];
//		sum += b1[15];
//		sum += b1[16];
			
//		int sum = 0;
//		for(int i = 0; i < scr.length; i++){
//			scr[i] = (int)(Math.random()*101+0);
//			sum += scr[i];
//		}
//		System.out.println("총합계="sum);
		
		
		
//		int[] scr = new int[17];
//		int sum = 0;
//		for(int i = 0; i < scr.length; i++){
//			scr[i] = (int)(Math.random()*101+0);
//			System.out.println((i+1) + "번 사람의 점수 = " + scr[i]);
//			sum += scr[i];
//		}
//		System.out.println("총합계 = " + sum);
		
		
		
		//1. 7개의 정수를 저장할 수 있는 변수 input을 선언 및 생성해주세요
		int[] input = new int[7];
		
		//2. input변수의 각각의 방을 사용자로부터 입력받아 저장해주세요			
		Scanner scr = new Scanner(System.in);
		
		for (int i = 0; i < input.length; i++){
			System.out.println("입력해주세요");
			int save = scr.nextInt();
			input[i] = save;
//			input[i] = scr.nextInt();
		}
		
		//3. 출력
		for (int i = 0; i < input.length; i++){
			System.out.println(input[i]);
		}
		
		//4. 합계
		int sum = 0;
		for (int i = 0; i < input.length; i++){
			sum += input[i];
		}
		System.out.println("합계="+sum);
		
		//5. 평균
		float ave = 0;

		ave= (int)((float) sum / input.length * 100 + 0.5f)/100f;
		System.out.println("평균=" + ave);
		
		//6. 최대값
		int max = input[0];
		for (int i = 1; i < input.length; i++){
			if(max < input[i]){
				max = input[i];
			}	
		}
		System.out.println(max);
		
		//7. 최소값
		int min = input[0];
		for (int i = 1; i < input.length; i++){
			if(min > input[i]){
				min = input[i];
			}
		}
		System.out.println(min);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
