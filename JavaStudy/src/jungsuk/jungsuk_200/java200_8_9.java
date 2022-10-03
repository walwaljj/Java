package jungsuk.jungsuk_200;
class UnsupportedFunctionExcption extends RuntimeException{
	private final int  ERR_CODE = 100;
	String str = "";
	public UnsupportedFunctionExcption(String a , int ERR_CODE) {
		this.str = "["+ERR_CODE+"]"+ a;
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return str;
	}
}
public class java200_8_9 {

	public static void main(String[] args) throws Exception{
		
		throw new UnsupportedFunctionExcption("지원하지 않는 기능.",100);
	}

}
