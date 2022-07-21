package javaBook;
import java.io.*;
import java.util.*;
public class Wright {
	
	String title;
	String to;
	String letter;
	
	
	public void showMail() {
		System.out.println("제목 :"+title );
		System.out.println("받는사람 :"+to );
		System.out.println("내용 :"+ letter);
	}
	
	
	public void sendMail() {
		Scanner msc=new Scanner(System.in);
		System.out.println("제 목");
		title = msc.next();
		System.out.println("내 용");
		letter = msc.next();
		System.out.println("받는사람");
		to = msc.next();
		System.out.println("메세지를 보낼까요?");
		System.out.println("[Y]        [N]");
		
		
		String a=" ";
		while(true){
			a=msc.next();
			if(a=="y"&&a=="Y") {	
				System.out.println("메일을 보냈습니다!");
					break;
			}else{
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			}if(a=="n"&&a=="N");
		System.out.println("입력을 취소하고 돌아갑니다.");
			
	}

	public static void main(String[] args) {
		
		Wright wright = new Wright();
		wright.sendMail();
		wright.showMail();


	}
}
