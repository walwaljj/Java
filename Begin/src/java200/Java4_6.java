package java200;

public class Java4_6 {

	public static void main(String[] args) {
		//Math.random()을 이용해 1-6사이의 임의의 정수를 value에 저장하는 코드
		int ran = (int)(Math.random()*6+1);
		//---------------------------------------------------------
		int value = (int)(Math.random()*6+1);
		System.out.println(value);
		System.out.println(ran);
		
		
		
		
	//두개의 주사위를 던졌을 때 , 눈의 합이 6이되는 모든 경우의 수를 출력하는 프로그램
		int count = 0;
		
			for(int j=1;j<6;j++) {
				for(int i=5;i>0;i--) {
					if(j+i==6) {
						System.out.println(i+","+j);
						count++;
					}

			}
		}System.out.println(count);
		
		//방정식 2x +4y = 10의 모든 해를 구하기. 
		//단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10이다.
		
		int x;
		int y;
		
		for(x=0;x<=10;x++) {
			for(y=0;y<=10;y++) {
				if((2*x)+(4*y)==10) {
					System.out.println("x="+x+" , y="+y);
				}
			}
		}
		
		//숫자로 이루어진 문자열 str이 있을때 , 각 자리의 합을 더한 결과를 출력하는 코드를 완성하기.
		//만일 문자열이 "12345"일때 '1+2+3+4+5'의 결과인 15가 출력이 되어야한다.
		//String charAt(int i)를 사용하기.
		
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum+=str.charAt(i)-48;
			
//			System.out.println();
		}
		
		System.out.println("sum= "+sum);
		
		//int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하기.
		//만일 변수 num값이 12345 라면 , 1+2+3+4+5 의 결과인 15출력하기
		//문자열 변환 x , 숫자로만 처리하기
		
		int num2 = 12345;
		int sum2 = 0;
		
		for(int i = 1;i<6;i++) {
			sum2+=num2%10;
			num2=num2/10;
			
		}System.out.println(sum2);
		
		int i = 0;
//		int j = 0;
		while(i<=10) {
		int	j=0;
			while(j<=i) {
			j++;
			System.out.print("*");
			}
			System.out.println();
			i++;
		}
		int n =1 ;
		int a=1;
		int sum1=0;
		for(;;n++,a=-a) {
			
			sum1+= n*a;
			if(sum1>=100) {
				break;
			}

		}System.out.println(sum1);
		System.out.println(n);
		
	}

}
