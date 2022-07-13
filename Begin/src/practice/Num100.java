package practice;

public class Num100 {

	public static void main(String[] args) {
		
		int num=0;
		
		for(int i=0;i<101;i++) {
			if(i%3==0|i%4==0) {
				num=i+num;
			}
		}System.out.println(num);

	}

}
