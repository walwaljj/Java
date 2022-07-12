package practice;

public class Ex4q3 {

	public static void main(String[] args) {
		/*       *
		 *     * * *
		 *   * * * * *
		 * * * * * * * *
		 *   * * * * *
		 *     * * *
		 *       *
		 */
		
		int line= 4;
		int spc = 3;
		int sta = 1;
		
		for(int i=0;i<line;i++) {
			for(int j=0;j<spc;j++) {
				System.out.print(" ");
			}for(int j=0;j<sta;j++) {
				System.out.print("*");
			}for(int j=0;j<spc;j++) {
				System.out.print(" ");
			}
				spc-=1;	
				sta+=2;
				System.out.println();
		}
		for(int k=0;k<line;k++) {
			spc+=1;
			sta-=2;
			for(int j=0;j<spc;j++) {
					System.out.print(" ");
			}if(sta!=7)
			for(int j=0;j<sta;j++) {
				System.out.print("*");
			}else{
				continue;
			}for(int j=0;j<spc;j++) {
				System.out.print(" ");
			}
				System.out.println();
		}
	}
}

