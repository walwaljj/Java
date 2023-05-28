package test15_2;
import java.io.*;
public class FileOutputnInputTest {

	public static void main(String[] args) throws IOException{
		try(OutputStreamWriter fo = new OutputStreamWriter(new FileOutputStream("a.txt"))){
			
			fo.write("지금까지 자바 정말 재미있게 공부했어요 ^^");
		}
	}

}
