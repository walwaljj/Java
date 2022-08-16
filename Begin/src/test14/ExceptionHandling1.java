package test14;
import java.io.*;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
//			e.printStackTrace();
		}
		System.out.println("실행해줘");
		
	}

}
