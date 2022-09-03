package java200;

public class day16 {

	public static void main(String[]args) {
		int[][] score = {
				{100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}
				, {50, 50, 50}
		};
		int[][] result = new int[score.length+1][score[0].length+1];
		for(int i=0; i < score.length;i++) {
			for(int j=0; j < score[i].length;j++) {
//				
				result[i][j] = score[i][j];
				result[i][j+1]=score[i][j]*3;
				result[i+1][j]=score[i][j]*3;
				result[score.length][score[2].length]+=result[i][j];
//				
//				
				result[i][score[2].length] += result[i][j];	
				//[i][score[2].length] score[n].length는 score배열의 2차원행의 갯수를 뜻함
				}
			}
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
			System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		}
		
		/*100 100 100 300
			20 20 20 60
			30 30 30 90
			40 40 40 120
			50 50 50 150
			240 240 240 720*/
	}
}
