package test15_2;
import java.io.*;
public class FileTest {

	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\wjdtn\\Desktop\\newFile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getAbsolutePath());
		
		file.delete();
	}

}
