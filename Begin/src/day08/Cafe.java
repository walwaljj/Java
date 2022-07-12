package day08;

public class Cafe {

	public static void main(String[] args) {
		//밀크 커피 나오게 만들기
		CoffeeMachine coffeemMachine=new CoffeeMachine();
		//int coffee, int sugar, int cream
		
	

		//방법1
		String s=coffeemMachine.maekeTea(4,5,6);
		System.out.println(s);
		//방법1끝
		
		
		//방법2
		System.out.println(coffeemMachine.maekeTea(1,2,3));
		//방법2끝

		//설탕 커피
		coffeemMachine.makeTea(2,2);
		
		//블랙 커피
		coffeemMachine.makeTea(1);
		
		
		//크림 커피
		
		//잘못된 크림커피 출력방법 ㄱ : coffeemachine에서  int, int  타입은 설탕커피였다.
		coffeemMachine.makeTea((short)1,3);
		//맞는 방법 ㄱ : short 형 이기때문에 short 로 형변환 해줘야함. 아니면 int값이 나온다.
		coffeemMachine.makeTea((short)2,3);
		
		//유자차 나오게 만들기 
		Yuja y=new Yuja();
		y.setYuja(3);
		y.setSugar(3);
		coffeemMachine.makeTea(y);
		System.out.println();
		
	}

}
