package D_array;

public class array_03 {
	public static void main(String[] args) {
		/*
		1. 다차원배열
		  - 자바에서는 1차원 배열뿐만 아니라 2차원 이상의 다차원 배열도 허용한다.
		  - 2차원 배열의 선언
		  	 선언방법					
		  	변수타입[][] 변수명; 
		  	변수타입[] 변수명[]; 
		  	변수타입 변수명[][]; 
		  	
		  - 2차원 배열의 생성
		     new 변수타입[][];
		*/
		
//		int[][] a = new int[3][4];
//		
//		int[][] b = new int[3][];
//		b[0] = new int[2];
//		b[1] = new int[3];
//		b[2] = new int[4];
//		
//		int[][] c = new int[][]{
//									{1,2},
//									{3,4,5},
//									{6,7,8,9}
//								};
//		System.out.println(c[0][0]);
//		System.out.println(c[0][1]);
//		System.out.println(c[1][0]);
//		System.out.println(c[1][1]);
//		System.out.println(c[1][2]);
//		System.out.println(c[2][0]);
//		System.out.println(c[2][1]);
//		System.out.println(c[2][2]);
//		System.out.println(c[2][3]);
		
		
//		for(int i = 0; i < c.length; i++){
//			for(int j = 0; j < c[i].length; j++)
//			System.out.println(c[i][j]);
//		}
		
		
		// 변수 a의 각 방에 10, 20, 30, 40....,90까지 입력해주세요
		
		
		int[][] a = new int[3][];
		
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];
		
		a[0][0] = 10;
		a[0][1] = 20;
		
		int k = 10;
		for(int j = 0; j < a[0].length; j++){
			a[0][j] = k;
			k+=10;
		}
		
		a[1][0] = 30;
		a[1][1] = 40;
		a[1][2] = 50;
		for(int j = 0; j < a[1].length; j++){
			a[1][j] = k;
			k+=10;
		}
		
		a[2][0] = 60;
		a[2][1] = 70;
		a[2][2] = 80;
		a[2][3] = 90;
		for(int j = 0; j < a[2].length; j++){
			a[2][j] = k;
			k+=10;
		}
		
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				a[i][j] = k;
				k+=10;	
			}
		}
		
		
		
		
		
		
		
	}
}
