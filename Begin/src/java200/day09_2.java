package java200;

public class day09_2 {

	public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		
		for(int i = 0 ; i<answer.length;i++) {
			
			System.out.println(answer[i]+"*");
		
		}
		for(int i = 0; i< counter.length;i++) {
			counter[i]=i;
			
			System.out.print(answer[i]+"*");
			System.out.println();
		}
		//*은 42 0은 48 1은49 2는 50 3은 51 -6-7-8-9
		
	}


}
