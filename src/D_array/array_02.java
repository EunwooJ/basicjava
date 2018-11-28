package D_array;

import java.util.Arrays;

public class array_02 {
	public static void main(String[] args) {
		
		/*
		1. 정렬
		  - 어떤 데이터를 빠르고 쉽게 찾기 위해 순서대로 데이터들을 가지런히 나열하는 작업
		  - 버블정렬, 삽입정렬, 선택정렬
		
		2. 버블정렬(bubble sort)
		  - 인접한 데이터 간에 교환이 계속적으로 일어나면서 정렬이 이루어진다.
		  - 회전이 진행됨에 따라 가장 큰값이 뒤로 보내진다.
		
		3. 선택정렬(Select sort)
		  - 정렬의 대상에서 최솟값을 찾아서 맨앞의 내용과 교체하는 방식이다.
		  - 회전이 진행됨에 따라 가장 작은값이 앞에 확정된다.
		   	
		*/
		
		//1. 5,2,3,1,4 숫자 5개를 저장할 수 있는 변수를 선언 및 생성하세요 
//		int[] num = new int[]{5, 2, 3, 1, 4};
		
		//2. 1회전만 진행하세요
	
//		for(int i = 0; i < num.length; i++){
//			if (num[i] > num[i+1] ){
//				int j = num[i];
//				num[i] = num[i+1];
//				num[i+1] = j;
//			}	
//		}	
//		System.out.println(num);
		
		
		
		//로또
		
//		int[] num = new int[6];
//		
//		for(int k = 0; k < 5; k++){
//			for(int i = 0 ; i < num.length; i++){
//				num[i] = (int)(Math.random()*45+1); 	
//				for(int j = 0; j < i; j++){				
//					if(num[i] == num[j]){
//						num[i] = (int)(Math.random()*45+1);
//						j=-1;
//					}
//				}
//			}
//			for(int i = 0; i < num.length; i++){
//				System.out.print(num[i] + " ");
//			}
//				System.out.println(" ");
//		}
	
		
		
	    // 버블정렬	
		
		int[] num = new int[]{5, 2, 3, 1, 4};
		int i; 
		int j;
		
		for(int k = 0; k < num.length-1; k++){							//회전 
			System.out.println(k+1 + "회전");
			for( i = 0; i < num.length-1-k; i++){						//변경횟수
				if (num[i] > num[i+1]){									//자리바꾸는 과정
					j = num[i];
					num[i] = num[i+1];
					num[i+1] = j;
				}	
				for(int m = 0; m <num.length; m++){						//배열[0]의 바꾼 순서 출력
					System.out.print(num[m] + " ");
				}
				System.out.println();		
			}
		}
		
		//선택정렬
		
//		int[] num = new int[]{5,2,3,1,4};
//		
//		int min = num[0];
//		int minBang = 0;
//		for(int i = 0; i < num.length; i++){
//			if(min > num[i]){
//				min = num[i];
//				minBang = i;	
//			}	
//		}
//		
//		int temp = num[0];
//		num[0] = num[minBang];
//		num[minBang] = temp;
//		System.out.print(Arrays.toString(num));
		
//		//
//		int min = num[1];
//		int minBang = 1;
//		for(int i = 2; i < num.length; i++){
//			if(min > num[i]){
//				min = num[i];
//				minBang = i;	
//			}	
//		}
//		
//		int temp = num[1];
//		num[1] = num[minBang];
//		num[minBang] = temp;
//		System.out.print(Arrays.toString(num));
//		
//		//
//		int min = num[2];
//		int minBang = 2;
//		for(int i = 3; i < num.length; i++){
//			if(min > num[i]){
//				min = num[i];
//				minBang = i;	
//			}	
//		}
//	
//		int temp = num[2];
//		num[2] = num[minBang];
//		num[minBang] = temp;
//		System.out.print(Arrays.toString(num));
//		
//		//
//		int min = num[3];
//		int minBang = 3;
//		for(int i = 4; i < num.length; i++){
//			if(min > num[i]){
//				min = num[i];
//				minBang = i;	
//			}	
//		}
//		
//		int temp = num[3];
//		num[3] = num[minBang];
//		num[minBang] = temp;
//		System.out.print(Arrays.toString(num));
		//
		
//		for(int j =0; j < num.length-1; j++){
//			int min = num[j];
//			int minBang = j;
//			for(int i = j+1; i < num.length; i++){
//				if(min > num[i]){
//					min = num[i];
//					minBang = i;	
//				}	
//			}
//			int temp = num[j];
//			num[j] = num[minBang];
//			num[minBang] = temp;
//			System.out.print(Arrays.toString(num));
//			System.out.println();	
//		}
		
		
		
		
		
		
		
	}
}
