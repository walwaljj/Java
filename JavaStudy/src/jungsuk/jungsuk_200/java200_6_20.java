package jungsuk.jungsuk_200;

public class java200_6_20 {

	static public int[] shuffle(int[] arr){
//		int[] result= new int[9];
		int n = 0;
		for(int i=0 ; i < arr.length ; i++) {
			int rnum = (int)Math.random()*9+1;
			
			n = arr[i];
			arr[i] = arr[rnum];
			arr[rnum] = n;
			
			/*순서대로인값a -> 저장해둠c
			 * 랜덤인값a -> 랜덤배열b
			 * 저장해둔 순서대로인값c -> 랜덤이였던배열a*/
			
			
		}
		return arr ;
	}
	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
