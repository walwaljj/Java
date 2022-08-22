package java200;
import java.util.*;

public class day11arrayEx9 {

	public static void main(String[] args) {
		int[] code= {-1,-3,-5,9,11};
		
		for(int i = 0; i<code.length;i++) {
			int n = (int)(Math.random()*code.length);
			int[] code2 = new int[code.length];
			code2[n]=code[i];
			
		}System.out.println(Arrays.toString(code));
		
		int numArr[] = new int [10];
		
		for(int i = 0; i < numArr.length ; i ++) {
//			numArr[i] = (int)(Math.random()*numArr.length);
			System.out.printf("[%d]",numArr[i]= (int)(Math.random()*numArr.length));
		}
		System.out.println();
//		for(int i = 0; i<numArr.length;i++) {
//			Arrays.sort(numArr);
			
//		}System.out.println(Arrays.toString(numArr));
		
		for(int i = 0; i < numArr.length-1;i++) {
			boolean cng = false;
			for(int j = 0; j < numArr.length-1-i;j++) {
				if(numArr[j]>numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					cng = true;
				}
				
			}
			
			if(cng!=true)
				break;
		}
		for(int a : numArr) {
			System.out.println(a);
		}

	}

}
