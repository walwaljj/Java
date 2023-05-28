package day13;

import java.io.IOException;

public class InputStreamTest3 {

	public static void main(String[] args) throws IOException{
	
		
			int cnt=0;
			int n=0;
			System.out.println("입력하세요=>");
			
			
			//데이터를 배열에 담아 읽고 써보기
			byte[] arr = new byte[6];//6사이즈의 배열, 사이즈가 넘어가면 엔터값까지 출력 후 남은 문자가 계속 엔터시 출력.
			int total=0;
			while((n=System.in.read(arr))!= -1) {//배열을 read(arr)안에 담기 .
				
				//System.out.write(n);//n= 읽은 바이트 수가 담겨있어서 종료시 이상한문자가 나옴.
				System.out.write(arr,0,n);//arr에 담긴 0의 값까지만 보내라는 뜻.
				
				System.out.flush();//스트림에 남아있는 데이터를 밀어내 출력해줌.
				cnt++;//배열에 담았기 때문에 바이트 수가 아니라 반복문 횟수가 됨. 변수를 생성해 n을 누적해줘야함.
				total+=n;
			}System.out.println(total+"bytes 읽음");
			
			System.in.close();
			System.out.close();

		

	}

}
