package D_array;

public class array_04 {
	public static void main(String[] args) {
		
		//1. 6명의 7과목을 저장할 수 있는 변수 score를 선언 및 생성해주세요
		
		String[] name = new String[]{"현웅","상엽","은우","대웅","다혜","연욱"};		
		String[] subject = new String[]{"국","영","수","사","과","java","오라클"};
		int[][] score =  new int[name.length][subject.length];
		
		//2. score의 각방을 0~100점 사이의 랜덤한 정수값을 저장해주세요
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				score[i][j] = (int)(Math.random()*101+0);
			}
		}
		
		//학생별 합계
		int[] sum  = new int[score.length];
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				sum[i] += score[i][j];
			}
		}
		
		//학생별 평균
		float[] avg = new float[score.length];
		for(int i = 0; i < score.length; i++){
			avg[i] = (int)((float)sum[i] / subject.length*100+0.5f)/100f;
		}
		
		//과목별 합계
		int[] subSum = new int[subject.length];
		for(int i = 0; i < subject.length; i++){
			for(int j = 0; j < score.length; j++){
				subSum[i] += score[j][i];
			}
		}
		
		//과목별 평균
		float[] subAvg = new float[subject.length];
		for(int i = 0; i < subject.length; i++){
			subAvg[i] = (int)((float) subSum[i] / subject.length*100+0.5f)/100f;
		}
		
		//순위
		
		int[] rank = new int[name.length];
		for(int i = 0 ; i<name.length ; i++){
			rank[i]++;
			for(int j = 0; j<name.length; j++)
				if(sum[i] > sum[j]){
					rank[i] += 1;
			}
		}
		
		
		//0. 아래와 같이 출력해주세요
		for(int k = 0; k < subject.length; k++){
			System.out.print("\t"+subject[k] + " ");
		}
		System.out.print("\t" + "합계");
		System.out.print("\t" + "평균");
		System.out.println("\t" + "순위");
		
		for(int i = 0; i < score.length; i++){	
			System.out.print(name[i] + "\t");
			for(int j = 0; j < score[i].length; j++){
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(sum[i]);
			System.out.print("\t");
			System.out.print(avg[i]);
			System.out.print("\t");
			System.out.println(rank[i]);
		}
		
		System.out.print("과목합계" + "\t");
		for(int i = 0; i < subject.length; i++){
			System.out.print(subSum[i] + "\t");
		}
		System.out.println();
		System.out.print("과목평균" +"\t" );
		for(int i = 0; i < subject.length; i++){
			System.out.print(subAvg[i] + "\t");
		}
		
		


		
		
		
		
		
	}
}
