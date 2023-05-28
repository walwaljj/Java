package test15;
import java.io.*;
public class FileOutputStreamTest1 {

	public static void main(String[] args) throws IOException{
		
			FileOutputStream os=new FileOutputStream("output.txt");
				try (os){	
			FileInputStream is=new FileInputStream("output.txt");
			byte[] bs = new byte[26];
			byte data = 65;
			for(int a=0;a<bs.length;a++) {
				bs[a] = data;
				data++;
			}
			os.write(bs,2,11);
			byte [] b=new byte[10];
			int i;
			while((i=is.read(b))!=-1) {
				for(int j = 0; j<i; j++)
					System.out.println((char)b[j]);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("END----");
	
		
	}

}
