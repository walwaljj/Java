package test15;
import java.io.*;
public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")){
			char [] ch=new char[50];
			String str ="ㅎㅎㅎㅎ어렵다 ㅜ";
			fw.write("정말로", 1,1);
			fw.write(str,5,1);
			fw.write("안녕?");
			ch[0]= 'k';
//			char alpa=65;
//			for(int i=0;i<ch.length;i++) {
//				ch[i]=alpa;
//				alpa++;
//			}
			fw.write(ch);
			
//			FileReader fr = new FileReader("writer.txt");
//			int r;
//			char[] chr = new char[30];
//			while((r=fr.read(chr))!=-1) {
//				for(int k = 0; k<r ; k++) {
//					System.out.println((char)chr[k]);
//				}
//			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}System.out.println("완료");
	}

}
