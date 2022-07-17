package practice;

public class Array {

	public static void main(String[] args) {
		
		
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		
		for(int i=0;i<num.length;i++) {
			sum += num[i];
		}System.out.println(sum);
		
		
		
		char [] ch = new char[26];
		char ch_a = 'A';
		for(int i = 0; i<ch.length;i++) {
			ch[i]=ch_a++;
			System.out.println(ch[i]);
		}
		
		
		//알파벳 소문자를 2글자씩 13줄(13행 2열)로 출력하는 프로그램 2차원배열
		
		char al[][]=new char[13][2];
		char c = 'a';
		for(int i=0;i<al.length;i++) {
			for(int j=0;j<al[i].length;j++) {
				al[i][j]=c++;
				System.out.print(al[i][j]);
			}System.out.println();
		}
		
		
		

	}

}
