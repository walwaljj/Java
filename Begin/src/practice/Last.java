package practice;

public class Last {

	public static void main(String[] args) {
		System.out.println("1"+"2");//12
		System.out.println(true+" ");//true
		System.out.println('A'+'B');//65+66=131
		System.out.println('1'+2);//49+2=51
		System.out.println('1'+'2');//49+50=99
		System.out.println('J'+"ava");//Java
		//System.out.println(true+null);//err
		
		String regNo= "990912-1111111";	
		
		byte b =10;
		char ch = 'A';
		int i = 100;
		long l=1000L;
		
		int num = 10;
		if(num==0) {
			System.out.println("0");
		}else if(num<0) {
			System.out.println("음수");
		}else if(num>0) {
			System.out.println("양수");
		}
		
		int num2 = 111;
		int resurt = 0;
		if(num%100!=0) {
			resurt = num2-(num2%100);
		}
		System.out.println(resurt);
		
	}

}
