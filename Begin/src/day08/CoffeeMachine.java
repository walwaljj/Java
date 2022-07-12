package day08;

public class CoffeeMachine {
	
	int coffee, sugar, cream;
	/*메소드 오버로딩(다중정의)
	 * -메소드 이름은 동일하게
	 * -매개변수의 자료형이 다르거나, 개수가 다르거나, 순서가 다르게
	 * -반환타입은 같아도, 달라도 상관없다.
	 * 
	 */
	
	//메인 안붙은 애들은 실행이안됨.
	
	//동일한 메소드 이름으로 여러가지 매개변수 구성을 하는것.
	public void makeTea(int coffee) {
		this.coffee = coffee;
		System.out.println("블랙커피 나가요! 농도 : " +this.coffee);
		
	}
	public void makeTea(int coffee, int sugar) {
		this.coffee = coffee;
		this.sugar = sugar;
		int n = this.coffee+this.sugar;
		System.out.println("설탕커피 나가요! 농도 : " +this.coffee+n);
	}
		
	
	public String maekeTea(int coffee, int sugar, int cream) {
		this.coffee = coffee;
		this.sugar = sugar;
		this.cream = cream;
		String s= "밀크 커피 나가요 ~~ 농도 :" +(this.coffee+this.sugar+this.cream);
		return s;
		
	}
	
	
	public String creamCoffee(int coffee,int cream) {
		this.coffee = coffee;
		this.cream = cream;
		String a = "크림 커피 나가요 ! :" +(this.coffee+this.cream);
		return a;
	}
		
	public void creamCoffee(short coffee) {
			this.coffee = coffee;
			System.out.println("크림커피 나가요! 농도 : " +this.coffee);
			
		}
		
	public void creamCoffee() {
		coffee = 1;
		sugar = 1;
		cream = 2;
		}
	
	public int makeTea(short cream, int coffee) {
		this.makeTea(cream,coffee);//this.메소드() : 자기 자신의 메소드를 호출할때 사용한다.
		return (this.coffee+this.cream);

	}
	
	
	
	//유자차 만드는 메소드
	
	Yuja yj;
	public void makeTea(Yuja y) {
		this.yj =y;
		System.out.println("[신메뉴]유자차 나가요 ~~");
		System.out.println("유자 : "+yj.getYuja());
		System.out.println("설탕 : "+yj.getSugar());
	}
		

}
