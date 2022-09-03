package java200;

public class day12_ArrayEx14 {
	
	
	public static void main(String[] args) {	

		String src = "ABCDE";
		
		for(int i = 0; i <src.length();i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+"):"+ch);
		}
		
		char[] charr = src.toCharArray();
		System.out.println(charr);
		
		String source = "SOSHELP";
		String [] morse = {".-","-...","-.-.","-..",".","..-."
							,"--.","....","..",".---","-.-",".-..",
							"--","-.","---",".--.","--.-",".-.","..."
							,"-","..-","...-",".--","-..-","-.--","--.."};
		String result = " ";
		
		for(int i = 0 ; i < source.length(); i++) {
			result += morse[source.charAt(i)-'A'];
		}
		
		System.out.println("source : "+ source);
		System.out.println("morse : "+result);
	}
	
	
	

}
