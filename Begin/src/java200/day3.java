package java200;

public class day3 {

	public static void main(String[] args) {
		String regNo;
		regNo="951214-111111";
		System.out.println(regNo);
		
		
		int n=1;
		int num=0;
		while(n<10) {
			n++;
			
			if(n%2!=0)
				continue;
				num+=n;
			
		}System.out.println(num);
	}

}
