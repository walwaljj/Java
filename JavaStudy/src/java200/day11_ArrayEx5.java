package java200;

public class day11_ArrayEx5 {

	public static void main(String[] args) {
		//배열의 모든 요소를 더해서 총합과 평균을 구하기
		int arr[] = {53, 63, 73, 80,11, 90, 100};
		
		float avg=0;
		
		for(int i = 0; i < arr.length; i++) {
			avg+=arr[i];
			System.out.print(arr[(int)(Math.random()*arr.length)]+"  ");
		}System.out.println("\n합산 :"+avg);
		System.out.println("평균 : "+avg/(float)arr.length);
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i = 1; i < arr.length ; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}else if(max<arr[i]) {
				max=arr[i];
			}
		}System.out.println("arr에서 가장 작은 값 :"+min);
		System.out.println("arr에서 가장 큰 값 :"+max);
		
//		arr = (int)(Math.random()*arr.length)+min;
	}

}
