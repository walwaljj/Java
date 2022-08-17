package java200;

public class day08 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i : arr) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("sum="+sum);
		System.out.println("------------------");
		int [][] arr1= {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		
		
		int ttl=0;
		float avg=0;
		
		
		float count=0f;
		for(int i[] :arr1){
			for(int j: i) {
				System.out.print(j+",");
				ttl+=j;
				count++;
				avg=(ttl/count);
			}System.out.println();
			
		}
		
		
		
		System.out.println("ttl="+ttl);
		System.out.println("avg="+avg);
		
		System.out.println("------------------");
		
		
		//1과 9사이 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램.
		int [] ballArr = {1,2,3,4,5,6,7,8,9};
		int [] ball3 = new int[3];
		
		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0; i<ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
			System.out.print(ballArr[i]);
		}
		System.out.println();
		//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		
		System.arraycopy(ballArr,0, ball3,0,3);
		
		for(int i = 0; i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
	}

}
