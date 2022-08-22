package java200;
import java.util.*;
public class day11_ArrayEx1 {

	public static void main(String[] args) {
//		int[] score = new int[5];
		int k = 1;
		int score[] = {50,60,70,80,90};
		int tmp = score[k+2]+score[4];
//		for(int )
		System.out.printf("tmp:%d%n+++++",k);
		for(int i = 0 ; i<score.length;i++) {
		System.out.printf("%nscore[%d]:%d%n",i,score[i]);
//		}System.out.printf("score[%d]:%d%n",7,score[7]);
		}System.out.println(Arrays.toString(score));
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100,95,80,70,60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i=0; i<iArr1.length;i++) {
			iArr1[i] = i+1;
		}
		for(int i = 0; i<iArr2.length ; i++) {
			iArr2[i] = (int)(Math.random()*100)+1;
		}
		for(int i = 0; i <iArr1.length;i++) {
			System.out.printf("%d",iArr1[i]);
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(iArr3);
		System.out.println(chArr);
		
		int[] arr = new int[5];
		System.out.println("arr.length: "+arr.length);
		for(int i = 0; i<arr.length; i++) 
		 arr[i]=i+1;
		 
//		 System.out.printf("변경전:arr[%d]: %d%n",i,arr[i]);
		
		for(int i =0;i<arr.length;i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
		int []temp = new int[arr.length*2];
		for(int i=0;i<arr.length;i++) 
			
			temp[i]=arr[i];
			arr=temp;
			
		for(int a : arr) {
			System.out.print(a+",");
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++");
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.out.println(result);
		System.arraycopy(num, 0, result, 3, num.length);
		System.out.println(result);
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}

}
