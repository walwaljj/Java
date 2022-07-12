package practice;

public class walwalTest03 {

	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		for(b=1;b<=9;b++) {
			for(a=1;a<=9;a++) { 
				if(a%2==1)
				continue;
				System.out.print(a+"x"+b+"="+a*b+"\t");
				//System.out.print("\n");
				
			//System.out.println( );
		}System.out.print("\n");
			
		}
		int dan=0;
		int gop=0;
		for(gop=1;gop<=9;gop++) {
			for(dan=1;dan<=9;dan++) {
				if(gop<=dan)
				break;
			System.out.print(gop+"x"+dan+"="+dan*gop+"\t");	
			}System.out.println();
		}
		String star="★";
		for(int i=1;i<8;i++) {
				if(i%2==1)
				continue;
				System.out.println("\t"+star+"\t");
		}
	}
}
