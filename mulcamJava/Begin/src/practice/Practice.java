package practice;

import java.math.*;

public class Practice {

	public static void main(String[] args) {
		//char a=(char)(Math.random()*26+'A');//밖에있으면 같은수만 찍히게 되어있다.
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				char a=(char)(Math.random()*26+'A');
				System.out.print(a+" ");
			}System.out.println();
		}
		
		

	}

}
