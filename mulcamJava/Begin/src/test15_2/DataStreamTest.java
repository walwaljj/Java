package test15_2;
import java.io.*;
import java.nio.channels.ReadableByteChannel;
public class DataStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeByte(100);
			dos.writeInt(1001);
			dos.writeUTF("A");
			
	DataInputStream dis  =new DataInputStream (new FileInputStream("data.txt"));
				int i;
			
				System.out.print(dis.readByte()+",");
				System.out.print(dis.readInt()+",");
				System.out.print(dis.readUTF()+",");
				
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
