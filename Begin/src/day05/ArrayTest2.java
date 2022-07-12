package day05;

public class ArrayTest2 {

	public static void main(String[] args) {
		// [1] float 유형의 배열을 선언하여 크기는 3만큼만.
		// 저장할 데이터는 -16.456, 200.5, 30e3 입니다.
		// 데이터를 저장한 뒤 for루프 이용해서 저장된 값을 출력하고
		// 배열에 저장된 값의 총 합과 평균값 구하여 출력
		float a[]= {-16.456f, 200.5f, 30e3f};
		float sum1 = 0f;
		try {
		for(int i=0;i<a.length;i++) {
			sum1+=a[i];
			System.out.println(a[i]);
			System.out.println("-----------");

		}System.out.println(sum1);
		System.out.println(sum1/3);
		
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" ");
			
		}
			
		
		double b[]= {-16.456, 200.5, 30e3};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}System.out.println(b[0]+b[1]+b[2]);
		System.out.println((b[0]+b[1]+b[2])/3);
		
		float [] f = new float[3];
		f[0] = -16.456f;
		f[1] = 200.5f;
		f[2] = 30e3f;
		float sum = 0f;//f을 뒤에 붙혀 형변환
		for(int i = 0; i<f.length; i++) {
			System.out.println(f[i]);
			sum = sum+f[i];
		}System.out.println("총 합= "+sum);
		System.out.println("평균값= "+(sum/f.length));
		

		
		
		
		

	}

}
