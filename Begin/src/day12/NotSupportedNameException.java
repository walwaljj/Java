package day12;
//사용자 정의 예외 클래스 만들기


//[1] Exception 을 상속받는다.
//[2] 생성자를 구성해서 생성자안에서 super("예외메시지")를 호출해서 예외 메세지를 등록한다.


public class NotSupportedNameException extends Exception {

	public NotSupportedNameException() {
		//super()를 묵시적으로 호출중인데, string을 호출?
		super("NotSupportedNameException");//예외메시지
	
	}
	public NotSupportedNameException(String msg) {
		super(msg);
	}

}//-클래스를 만들었으니 다른클래스에서 사용하면 된다.
//예외를 사용할때는 throws가아닌 throw new NotSupportedNameException("  ")
