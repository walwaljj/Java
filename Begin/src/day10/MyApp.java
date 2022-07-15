package day10;
import java.awt.*;
import javax.swing.*;
public class MyApp extends JFrame {
	
	JButton b1,b2,b3,b4;
	JPanel p=new JPanel();
	JPanel pN=new JPanel();

	public MyApp() {
		super("::MyApp::");
		add(p);
		p.setLayout(new BorderLayout());
		
		b1=new JButton("Login");
		b2=new JButton("Login");
		b3=new JButton("Login");
		b4=new JButton("Login");
		
		p.add(b1);
		p.add(b1);
		p.add(b1);
		p.add(b1);
	
		

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		MyApp my=new MyApp();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
