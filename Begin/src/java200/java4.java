package java200;

public class java4 {

	public static void main(String[] args) {
		//int 형 변수 x가 10보다 크고 20보다 작을때 true
		int x=11 ;
		boolean result;
		result= (x>10&&x<20) ? true:false;
		System.out.println(result);
		//--------------------------------------------
		if(x>10&&x<20) {
			result = true;
			System.out.println(result);
		}else {
			result =false;
			System.out.println(result);}
		//char 형 ch가 공백이나 탭이 아닐때 
		char ch = '	';
		result = (ch!=' '&&ch!='	')?true:false;
		System.out.println(result);
		//--------------------------------------------
		if(ch==' '||ch=='	') {
			result =false;
			System.out.println(result);
		}else {
			result = true;
			System.out.println(result);}
		
		//char형 ch가 x또는 X일때 true인 조건식
		char ch1 = 'x';
		if(ch1=='x'||ch1=='X') {
			result = true;
			System.out.println(result);
		}else {
			result =false;
			System.out.println(result);
		}
		//---------------------------------------------
		result = ch1=='x'||ch1=='X'? true : false;
		System.out.println(result);
		
		result = false;
		//char 형 변수 ch 가 숫자 0~9일 떼 true인 조건식
		char ch2 = '5';
		result = (ch2>='0'&& ch2<='9') ? true : false;
		System.out.println(result);
		//--------------------------------------------
		
		if(ch2>='0'&&ch<='9') {
			result = true;
			System.out.println(result);
		}else {
			result =false;
			System.out.println();
		}
		//char형 변수 ch가 영문자일때 true인 조건식
		char ch3='D';
		result = ch3>='a'&& ch3<='z' || ch3>='A' && ch3<='Z'? true : false;
		System.out.println(result);
		//---------------------------------------------------------------
		
		if(ch3>='a'&& ch3<='z' || ch3>='A' && ch3<='Z') {
			result =true;
			System.out.println(result);
		}else {
			result = false;
			System.out.println(result);
		}
		//int형 변수가 year가 400으로 나눠떨어지거나
		//4로 나눠떨어지고 100으로 나눠 떨어지지않을때 true인 조건식
		int year = 443;
		result = year%400==0||(year%4==0&&year%100!=0) ?  true : false;
		System.out.println(result);
		
		//--------------------------------------------------------
		
		if(year%400!=0||(year%4!=0&&year%100==0)) {
			result = false;
			System.out.println(result);
		}else {
			result = true;
			System.out.println(result);
		}
		//boolean 형 변수 powerOn이 false일때 true인 조건식
		boolean powerOn = false;
		result = powerOn ==false? true : false;
		System.out.println(result);
		//----------------------------------------------
		if(powerOn!=false) {
			result = false ;
			System.out.println(result);
		}else {
			result = true;
			System.out.println(result);
		}
		
		//문자열 참조변수 str이 "yes"일 때 true인 조건식

		String str = "yes";
		
		result = str!="yes" ? false : true;
		System.out.println(result);
		//----------------------------------------
		
		if(str=="yes") {
			result = true;
			System.out.println(result);
		}else {
			result = false ;
			System.out.println(result);
		}
		//----1부터 20까지 정수 중에서 2또는 3의배수가 아닌 수의 총합.
		int i = 0;
		int sum = 0;
		for(; i <=20 ; i++) {
			if(!(i%2==0||i%3==0)) {
				sum+=i;
				System.out.println(i);
			}
		}		
		System.out.println("2또는 3의배수가 아닌 수의 총합 : "+sum);
		//------1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과계산
		
		int i2=1;
		int sum2=0;
		int ttl=0;
		for(;i2<11;i2++) {
			sum2+=i2;
			ttl+=sum2;
		}System.out.println("결과 : "+ttl);
		
		//1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야
		//총합이 100이상이 되는지 구하시오.
		int a=-1;
		int asum=0;
		int j=0;
		while(true) {
			int k=0;
			j++;
			if(j%2==0) {
				k=j*a;
			}else {
				k=j;
			}
			asum+=k;
			if(asum>=100)
				break;
		}System.out.println("최종 숫자 : "+j);
		System.out.println("총 합 : "+ asum);
		//-----------------------------------------------
		int asum2=0;
		int j2=0;
		int k=0;
		
		for(;;j2++) {
			
			if(j2%2==0) {
				k+=j2*a;
			}else{
				k+=j2;
			}
			if(k>=100) {
				break;
			}
		}System.out.println("최종숫자 : "+j2);
		System.out.println("총 합 : "+k);
		//다음 for문을 while문으로 변경하세요
		
		for(int i3 = 0; i3<=10; i3++) {
			for(int j3 = 0; j3<=i3 ; j3++)
				System.out.print("*");
			System.out.println();	
		}
		//----------------------------------------------
		int line=0;
		
		
		while(line<=10) {
			int star=0;//밖에서 초기화하면 반복문안에서 star ++ == line++ 이기떄문에 *가 한줄에 하나씩만 찍힘.
						//바깥 반복문에서 0으로 초기화해줘야지 안쪽반복문을 돌고 
						//while의 반복 조건문안에서 line수만큼
						//안쪽반복문을 돌아 *을 라인카운팅만큼 찍을 수 있다.
			while(star<=line) {
				System.out.print("*");
				star++;
			}System.out.println();
			line++;
			
		}
	}

}
