package practice;
import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			String regNo="951214-1111111";
				System.out.println(regNo);
				System.out.println(true+"");
		
		
		//int i=sc.nextInt();
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
			for(int i=0;i<coinUnit.length;i++) {
		
				int j =(money%coinUnit[i]);
				
				System.out.println(coinUnit[i]+"="+j);
					
				
			}
	}
}