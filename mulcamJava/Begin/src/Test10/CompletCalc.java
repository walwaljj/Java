package Test10;

public class CompletCalc extends Calaulator {
	@Override
	public int times(int num1, int num2) {
		return num1* num2;
		
	}
	@Override
	public int divide(int num1, int num2) {
		if(num2 !=0)
			return num1/num2;
		else
			return Calc.ERROR;
	}
	public int square(int num) {
		return num*num;
	};
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
	
	/*
	 * @Override public void description() { System.out.println("계산 끝 !");//부모 메서드
	 * 내용이 마음에안들면 재정의가능 }
	 */
}
