package java200;

public class day10 {

	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
		
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

		String src = "abc123";
		String result = "";
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			
				
			if(ch>=0&&ch<=9) {
				for(int j=0; j<numCode.length;j++) {
				System.out.println(numCode[j]);
				System.out.println("num"+numCode[ch]);
			}
			}
			
		}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);

	}

}
