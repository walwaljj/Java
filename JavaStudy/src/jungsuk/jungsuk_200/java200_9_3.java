package jungsuk.jungsuk_200;

public class java200_9_3 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\wort\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		int pos = fullPath.lastIndexOf("\\");
		
		if(pos!=-1) {
			path = fullPath.substring(0,pos);
			fileName = fullPath.substring(pos+1);
		}
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
	}

}
