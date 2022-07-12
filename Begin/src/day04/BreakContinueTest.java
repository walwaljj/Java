package day04;
/*
 * 보조제어문 : break , continue => 단독으로는 사용못함, 주제어문과 함께사용한다.
 * 
 * 
 */
public class BreakContinueTest {

	public static void main(String[] args) {
		System.out.println("1.--------------");
		for(int i=0;i<3;i++) {
			if(i==1)
				break;//가장 가까운 반복문을 벗어남
			System.out.println("i="+i);
		}System.out.println("(반복문 벗어나면 무조건 출력)1끝");
		
		System.out.println("2.--------------");
		for(int i=0;i<3;i++) {
			if(i==1)
				continue;//if 조건에 맞으면 아래 문장을 실행하지 말고 다시 반복문을 수행해라
			System.out.println("i="+i);
		}System.out.println("(반복문 벗어나면 무조건 출력)2끝");
		
		System.out.println("3.--------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
					if(k==1)
						break;
			System.out.println("i="+i+", k="+k);
		}
		}
		System.out.println("4.--------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {

			if(k==1)
				continue;
			System.out.println("i="+i+", k="+k);
		}
		}
		System.out.println("5.--------------");
		outer : //label(반복문 앞에만 붙힐 수 있다)
		for(int i=0;i<3;i++) {
			inner:
			for(int k=0;k<3;k++) {
			if(k==1) 
				break outer;
			System.out.println("i="+i+",k="+k);
			}
		}
	
		System.out.println("6.--------------");
		outer:
		for(int i=0;i<3;i++) {
			inner:
			for(int k=0;k<3;k++) {
			if(k==1)
				continue outer;
			System.out.println("i="+i+",k="+k);
			}
	}
}

}
