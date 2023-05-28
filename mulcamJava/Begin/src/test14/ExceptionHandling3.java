package test14;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.tet");
		}catch(FileNotFoundException e) {
			System.out.println(e);
			return;
		}finally {
			if(fis !=null) {
				try{
					fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}System.out.println("항상 수행됩니다.");
		}System.out.println("나도요!");
	}

}
