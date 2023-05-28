package javaBook;
import java.util.*;

public class MailApp {

	public static void main(String[] args) {
		
		Login login = new Login();
		login.add();
		
		
		Wright wright = new Wright();
		wright.sendMail();
		wright.showMail();		

	}

}
