package java200;

public class day10 {

	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
						// 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

		String src = "abc123";
		String result = "";
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			
			if (ch >='0' && ch<='9') {
				for(int j = 0; j < numCode.length; j++) {
					result+=numCode[ch-'0'];
					break;
				}
			}else if(ch>='a'&& ch<'z') {
				for(int k = 0; k < abcCode.length; k++) {
					result+= abcCode[ch-'a'];
					break;
					}
				}
			}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);

	}

}
