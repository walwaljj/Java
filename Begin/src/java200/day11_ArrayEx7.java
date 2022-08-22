package java200;

public class day11_ArrayEx7 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0;i<arr.length;i++) {
			arr[i]=i;
		System.out.print(arr[i]+",");
		}
		
		for(int i = 0; i<arr.length;i++) {
			int n=(int)(Math.random()*10);
			int arrN = arr[1];
			arr[1] = arr[n];
			arr[n] = arrN;
		}
		System.out.println();
		System.out.println("---------------------");
		for(int a : arr) {
			System.out.print(a+",");
		}
		System.out.println();
		System.out.println("**********************");
		
		int[] ball = new int[45];
		for(int i = 0 ; i <ball.length ; i++) {
			ball[i] = i+1;
			if(i%10==9)
				System.out.println(ball[i]);
			else
			System.out.print(ball[i]+" ");
		}
		
		for(int i=0; i<6;i++) {
			int n = (int)(Math.random()*44+1);
			int ballRd = ball[0];
			ball[0] = ball[n];
			ball[n] = ballRd;
		}
		
		for(int i = 0; i < 6 ; i++) {
			System.out.printf("%n이번주 로또 번호 ~! : ball[%d] : %d",i ,ball[i]);
		}///겹치는 값이 저장된게 아니라면 
		//자리를 바꾸는 것이기 때문에 값이 겹칠 수가 없다 ! 
	}

}
