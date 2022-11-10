package jungsuk.jungsuk_200;

public class java200_4chapter4 {

	public static void main(String[] args) {
		for(int i = 1 ; i <= 9 ; i ++) {
			for(int j = 1; j <= 3; j++) {
				int x = j + 1 + (i - 1) / 3 * 3;
				int y = i % 3 == 0 ? 3 : i % 3;
				
				if (x > 9)
					break;
				System.out.println(x + "*" + y + "=" + x*y+ "\t");
			}
//			System.out.println();
//			if(i%3==0) System.out.println();
		}
		System.out.println("-----------");
		for(int i = 1 ; i < 4; i ++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + j*i+ "\t");
			}

			System.out.println();
		}
		System.out.println("-----------");
		for(int i = 1 ; i < 4; i ++) {
		
			for(int j = 2; j < 10; j++) {

				System.out.print(j + "*" + i + "=" + j*i+ "\t");
			}
			System.out.println();
			
			for(int j = 5; j < 8; j++) {
				if(j%8==1) {
					break;
				}
				System.out.print(j + "*" + i + "=" + j*i+ "\t");
			}
			System.out.println();
			
//			for(int j = 8; j < 10; j++) {
//				if(j%10==1) {
//					break;
//				}
//				System.out.print(j + "*" + i + "=" + j*i+ "\t");
//			}
//			System.out.println();
		}
	}

}
