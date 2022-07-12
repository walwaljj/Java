package practice;

public class WalwalTest02 {
 
	public static void main(String[] args) {
		
		int a = 3;
		int b = 1;
		for(b=1;b<=9;b++) {
			for(a=3;a<=7;a++)
				System.out.print(a+"x"+b+"="+a*b+"\t");
			System.out.println();
			}
		
		int total = 0;
		int num;
		
		for(num = 1;num <=100;num++) {
			if(num%2==1)
			total+=num;
				
		}System.out.println(total);
		
		int sam;
		//int ttl;
		
		for(sam = 1;sam<=100;sam++) {
			if(sam%3>0)
				continue;
			System.out.println(sam);
		}
		
		int i=0;
		int sum=0;
		do{
			i++;
			sum+=i;
		}while(sum<=100);
		System.out.println("숫자"+i+"\n"+"합"+sum);
		
		int c;
		int sum2=0;
		for(c=0;c<=100;c++) {
			sum2+=c;
			if(sum2>=100)
			break;
		}System.out.println(sum2);
		
		int sum3=0;
		int num2;
		for(num2=1; ;num2++) {
			sum3+=num2;
			if(sum3>=500)
				break;
		}System.out.println("합은 : "+sum3+"숫자는"+num2);
	
		

	

	}

}
