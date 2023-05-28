package day03;
//중첩 for루프
public class ForTest3 {

	public static void main(String[] args) {
		for(int i=2;i<4;i++)
		{
			for(int k=1;k<3;k++)
			{
				System.out.println("i="+i+",k="+k);
			}//for---
			System.out.println("***********");
			
		}//for-------------
		
		/*[문제1]중첩 for루프를 이용해서 아래모양이 출력되도록 해보세요.
		 * ★★★★★
		 * ★★★★★
		 * ★★★★★(총 3행5열나오게)
		 * 
		 */
		for(int a=1;a<4;a++)
		{
			for(int b=1;b<6;b++)
			{
				System.out.print("★");
			}
			System.out.println("★");//System.out.print("\n"); 해도 나옴
		}

		
		/*[문제2] 중첩 for루프 이용해 구구단 전체를 아래형태로 출력
		 * 2x1=2    3x1=3   ... 9x1=9
		 * 2x2=4     ...
		 * ...
		 * 2x9=18               9x9=81
		 * 
		 */
		for(int c=1;c<10;c++){//행의 조건
			for(int d=2;d<10;d++){//열의조건
				System.out.print(d+"x"+c+"="+d*c+"\t");
			}
			System.out.print("\n");
		}
		
		
	}
}

		

