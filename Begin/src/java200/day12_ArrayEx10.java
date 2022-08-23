package java200;

public class day12_ArrayEx10 {

	public static void main(String[] args) {
		//배열에 어떤값이 몇개 저장되어 있는지 세어서 보여주기.
		//ex 4446579753 0:0개 1:0개 2:0개 3:1개 4:3개... 9:1개
		
		int[] numArr = new int[10];
		int[] counter = new int [10];
		
		for(int i = 0 ; i<numArr.length;i++) {
			int num = (int)(Math.random()*numArr.length);
			numArr[i]=num;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i = 0 ; i < numArr.length ; i++) {
			counter[numArr[i]]++;
			
		}
		for(int i = 0; i < numArr.length ; i++) {
			System.out.println(i+"의 개수 : "+counter[i]);
		}
	}

}
