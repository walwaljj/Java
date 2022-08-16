package test14;

public class AutoCloseObj implements AutoCloseable{
	public void close() throws Exception{
		System.out.println("리소스가 close 됐다");
	}
}
