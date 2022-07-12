package practice;

public class Ex4q2 {

	public static void main(String[] args) {
		
		//구구단 짝수단만 출력
		
		for(int num=1;num<10;num++) {
			for(int num2=1;num2<10;num2++) {
				if(num%2!=0)
					continue;
			System.out.print(num+"x"+num2+"="+num*num2+"\t");
			
			}System.out.println();
			
		}
		
		//구구단 단보다 곱하는 수가 작거나 같은경우만 출력하는경우
		
	
		for(int dan=1;dan<10;dan++) {
			for(int gop=1;gop<10;gop++) {
				if(dan<gop)
				break;
				System.out.print(gop+"x"+dan+"="+dan*gop+"\t");
			}System.out.println();
		}

	}

}
