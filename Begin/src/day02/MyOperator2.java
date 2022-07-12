package day02;

public class MyOperator2 {

	public static void main(String[] args) {
		System.out.println("4. 비트연산자 : &, |, ^");
		/* 정수에만 사용되는 연산자이며 비트를 비교하여
		 * & (and연산자)	: 두비트가 1일때만 1
		 * | (or연산자)	: 두 비트 중 한개라도 1이면 1. 모두 0 이면 0
		 * ^ (xor연산자)	: 두 비트가 서로 다르면 1, 같으면 0
		 * 
		 */
		int x=3; //0011
		int y=5; //0101
				
		System.out.println("x&y="+(x&y));//1
		//0001
		System.out.println("x|y="+(x|y));//7
		//0111
		System.out.println("x^y="+(x^y));//
		//0110
		
		System.out.println("5. 논리 연산자: &, &&, |, ||");
		/* & ,|    : 앞의 연산으로 결과를 알 수 있어도 뒤의 문장까지 비교한다.
		 * &&,||   : 앞의 연산으로 결과를 알 수 있을경우 뒤의 문장은 수행하지 않는다.
		 * 			&& 은 앞의 결과가 false 이면 뒤의 연산을 생략한다.
		 * 			|| 은 앞의 결과가 true 이면 뒤의 연산을 생략
		 */
		
		//[예제]
		int a=5;
		int b=6;
		if((a>b) & (a>0)) {
			System.out.println("Hello");
		}else if((b>a)|(b<0)){
			System.out.println("Hi");
		}
		//[예제]
		int i=1;
		int j=i++;//j=1 (i의 값을 먼저 j가 받은 후 다음 j 사용때 ++이됨) , i=2(?)
		if((i>++j) & (i++ ==j)) {
			i=i+j;
		}System.out.println("i="+i);
		
		//false로 {}를 벗어나 출력은 하지만 &이 뒷연산 (i++ ==j)까지 진행하여 i의 값이 ++이 되어 출력됨 ==>3
		
		//[예제]
		int k=0;
		int p=1;
		if((k++ ==0)|(p++ ==2)) {
			k=42;
		}System.out.println("k="+k+", p="+p);
		
		//[예제]
		boolean r= false;
		boolean e= true;
		boolean w=((r=true)||(e=false));//|일때는 뒤에문장까지 실행해서 e=false가되지만 
		System.out.println(r+","+e+","+w);//||일때는 뒤에문장까지 실행하지 않기때문에 e=true
		

	}

}
