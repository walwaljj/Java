package test12_1;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMeterial(new Powder());// 파우더 클래스 호출과 동시에 
												//GenericPrinter의 meterial메소드에 대입.
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		//				ㄴGenericPrinter<T> 에서 T에 Plastic 클래스를 대입, plasticPrinter변수에 대입.
		plasticPrinter.setMeterial(new Plastic());
		// ㄴ GenericPrinter클레스 형인 plasticPrinter가 GenericPrinter클레스의 메소드 setMeterial에
		//Plastic을 매개변수로 받아 this에 대입,, toString까지 거치게됨.
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);// 스태틱이아니고 , 리턴타입이 String이기 때문에 sysout 으로 출력
		
		
		//	이 후에 T extends Material을 사용했기때문에 GenericPrinter클래스의 
		//material의 자료형이 Material로 지정됨. 
		// 따라서 extends 전의 T형은 Object로 모든 자료형을 받을 수 있었지만 
		// extends 이후에는 상속받은 클래스의 자료형만 대입가능하기때문에 지정된 자식들만 올 수 있다.
		GenericPrinter<Object> printer = new GenericPrinter<>();
		// 				ㄴ여러 자료형을 담아줄때 Object를 쓸수있다.
		// Object면 아래처럼 매개변수로 여러클래스를 담아 원하는 자료형으로 출력하능.
		
		printer.setMeterial(new Powder());
		System.out.println(printer);
		
		printer.setMeterial(new Plastic());
		System.out.println(printer);
	}

}
