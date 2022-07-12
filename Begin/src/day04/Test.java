package day04;

public class Test {

	public static void main(String[] args) {
		
		//2또는 3의 배수가 아닌 수의 총 합.
		int sum=0;
		for(int i=1;i<21;i++) {
			
			//if(!(i%2==0 || i%3==0)) {==아래식과 같음
			if(i%2!=0&&i%3!=0) {
			//	System.out.println("i: "+i);
				sum=sum+i;
				
			}
		}
		System.out.println("sum: "+sum);
		
		//1~10까지의 합
		//1+ 1+2+ 1+2+3+ ... +8+9+10
		int a=0;
		int anum=0;
		for(int i=0;i<11;i++) {
			a+=i;
			anum+=a;
		}System.out.println(anum);
	}

}
