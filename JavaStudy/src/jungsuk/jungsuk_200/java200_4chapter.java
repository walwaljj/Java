package jungsuk.jungsuk_200;

public class java200_4chapter {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
		 
		int i = 0;
		
		while(i<=10) {
			int j = 0 ; 
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			
		}
		
		for(int j = 1 ; j < 6 ; j ++) {
			for(int k = 6 ; k > 0 ; k -- ) {
				if(j+k==6) {
					System.out.println(j+","+k);
				}
			}
		}

	}

}
