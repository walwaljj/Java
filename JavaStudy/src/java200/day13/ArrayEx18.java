package java200.day13;

import java.util.Arrays;

public class ArrayEx18 {

	public static void main(String[] args) {
		int[][] score= {{100,100,100},{20,20,20},{30,30,30},{40,40,40}};
		
		int ttl = 0,n=0;
		int sum=0;
		double avg=0;
		System.out.println("번호\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("============================================");
		
		for(int i = 0 ; i <score.length; i++) {
			System.out.print(i+1);
			for(int j = 0 ; j < score[i].length ; j ++) {
				sum+=score[i][j];
				avg=sum/score[i].length;
				System.out.print("\t"+score[i][j]);
			}
			System.out.print("\t"+sum);
			System.out.print("\t"+avg);
			System.out.println();
			avg=0;
			sum=0;			
			ttl=0;
			System.out.println();
		}
		System.out.println("============================================");
		System.out.println("총점 : ${d}");
		
		for(int []arr : score) {
			for(int arr2 : arr) {
				System.out.println(arr2);
			}
		}
	}

}
