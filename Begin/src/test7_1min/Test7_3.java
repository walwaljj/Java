package test7_1min;

public class Test7_3 {

	public static void main(String[] args) {
		
		int []a=new int[5];
		int sum=2;
		int k=0;
		for(int i=0;i<11;i++) {
			if(i%2==0) {
				for(int j=0;j<a.length;j++) {
					a[j]=+i;
					System.out.println(a[j]);
				}
			}
		}
		
		for(int j=0;j<a.length;j++,sum+=2) {
			if(sum%2==0) {
				a[j]=sum;
				k+=a[j];
			}
		}System.out.println(k);
	}

}
