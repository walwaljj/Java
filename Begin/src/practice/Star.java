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
			}for(int i=0;i<spc;i++) {
				System.out.print(" ");
			}
			System.out.println();
			star-=2;
			spc+=1;
		}
	}

}
