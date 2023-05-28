package Tesk;

public class Test02 {
	
	public static void main(String[] args) {

		/*1			2		3		4		5
		 * 16		17		18		19		6
		 * 15		24		25		20		7
		 * 14		23		22		21		8
		 * 13		12		11		10		9		
		 */
	
	int[][] arr = new int[5][5];
	int cnt=0;//1씩 증가시키면서 arr에 값을 cnt에
	int x=0, y=0;//배열의 인덱스로 사용할 변수
	for(int k=0;k<2;k++) {
		for(int i=0;i<4-2*k;i++) {//4번 반복을 돌면서 y를 증가되며 오른쪽으로 숫자가 커짐
				arr[x+k][y+k]=++cnt;	
				y++;
			}
			if(x+y==4-2*k) {
				for(int i=0;i<4-2*k;i++) {//4번 반복을 돌면서 x를 증가시키고 아래로 숫자가 커짐
					arr[x+k][y+k]=++cnt;
					x++;
				}
			}
			if(x==y) {
				for(int i=0;i<4-2*k;i++) {
					arr[x+k][y+k]=++cnt;
					y--;
					
				}	
			}
			if(x+y==4-2*k) {
				for(int i=0;i<4-2*k;i++) {
					arr[x+k][y+k]=++cnt;
					x--;
				}
			}
	}//for=>k
	arr[x+2][y+2]=++cnt;
	///////////////////////////
	System.out.println("---------");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+"\t");
			//System.out.println();
		}
		System.out.println();
	}
	}
}
