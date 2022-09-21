package jungsuk;
import java.util.*;
public class Bingo {

	public static void main(String[] args) {
		Set set = new HashSet(new LinkedHashSet());
		int [][] board = new int[5][5];
		
		for (int i = 0 ; set.size() < 25 ; i ++) {
			set.add((int)(Math.random()*50)+1+"");
			
		}
		
		Iterator it = set.iterator();
		
		for(int i = 0 ; i < board.length; i++) {
			for(int j = 0 ; j < board[i].length ; j ++) {
				board[i][j] = Integer.parseInt((String)it.next());
				//board[i][j]에 Iterator it = set.iterator() 를 담음. next는 object타입이라 int로바꿔서 담음.
				System.out.print((board[i][j]<10 ? "  " : " ")+board[i][j]);
				// board[i][j] 각각의 요소가 10보다 작으면 공백두번을 주고, 크면 한번. 그리고 값 출력
			}
			System.out.println();
		}
	}

}
