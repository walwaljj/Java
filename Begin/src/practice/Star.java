package practice;

public class Star {
	
	public static void main(String[] args) {
		int star=9;
		int spc=0;
		int line=5;
		
		
		for(int j=0;j<line;j++) {
			for(int i=0;i<spc;i++) {
				System.out.print(" ");
			}
			for(int i=0;i<star;i++) {
				System.out.print("*");
			}
			for(int i=0;i<spc;i++) {
				System.out.print(" ");
			}
			System.out.println();
			star-=2;
			spc+=1;
		}
		for(int i=0;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=9;k>=2*i+1;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<9;j+=2) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
