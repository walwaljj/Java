package test15_2;
import java.io.*;

public class RandomAccessFileTest {

	public static void main(String[] args)throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt","rw");
		rf.writeInt(100);
		System.out.println("포인터 위치 : "+rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("포인터 위치 : "+rf.getFilePointer());
		rf.writeUTF("안녕하세요");
		System.out.println("포인터 위치 : "+rf.getFilePointer());
		
		rf.seek(0);
		System.out.println("포인터 위치 : "+rf.getFilePointer());
		
		int i =rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		System.out.println(i+d+str);
		
	}

}
