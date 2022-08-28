package java200.day13;
import java.util.*;
public class MultArrEx2 {

	public static void main(String[] args) {
		final int SIZE = 5;
		int [][] binggo = new int[SIZE][SIZE];
		Scanner sc = new Scanner(System.in);
		int x=0,y=0,num=0;
		for(int i = 0; i< binggo.length ; i ++ ) {
			for(int j = 0 ; j < SIZE ; j ++) {
				binggo[i][j]=i*binggo.length+j+1;
			}
		}
			for(int i = 0; i< binggo.length ; i ++ ) {
				for(int j = 0 ; j < SIZE ; j ++) {
					
				x= (int)(Math.random()*SIZE);//0~4가랜덤됨
				y= (int)(Math.random()*SIZE);
				
				int tmp = binggo[i][j];//0,0/0,1/0,2..
				binggo[i][j] = binggo[x][y];//0,0=4,3;//0,1=4,3
				binggo[x][y] = tmp;
				
			}
			
			
		}
			do {
				for(int i = 0 ; i<SIZE; i++) {//
					for(int j =0 ; j <SIZE ; j ++) {
						System.out.printf("%2d ",binggo[i][j]);
					}System.out.println();
					
				}
				System.out.println();
				System.out.printf("1~%d의 숫자를 입력 종료:0>",SIZE*SIZE);
				String tmp = sc.nextLine();
				num = Integer.parseInt(tmp);
				
				
				outer :
					for(int i =0;i<SIZE;i++) {
						for(int j=0;j<SIZE;j++) {
							if(num==binggo[i][j]) {
								binggo[i][j]=0;
								break outer;
							}
						}
					}
			}while(num!=0);
	}

}
