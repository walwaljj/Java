package jungsuk.jungsuk_200;

public class java200_6_23 {
	public static int max(int[] arr) {
		if (arr ==null || arr.length == 0) {
			return -999999;
		}
		int max = arr[0];

		for(int i = 0 ; i < arr.length ; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : "+max(data));//최대값 : 9
		System.out.println("최대값 : "+max(null));//최대값 : -99999
		System.out.println("최대값 : "+max(new int[] {}));//최대값 : -99999
		
	}

}
