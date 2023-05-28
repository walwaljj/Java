package practice;

public class Array2 {

	public static void main(String[] args) {
		
		int [] num = new int[5];
		
		
		
		
		int sum=0;
		
		
		for(int a=0;a<11;a+=2) {
				for(int i=0;i<num.length;i++) {
					num[i]=a;
				}System.out.println(a);
				sum+=a;
			}System.out.println("num[i] 의 합은 : " + sum);
	}

}
