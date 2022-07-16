package Tesk;
import java.awt.*;
import javax.swing.*;
public class MyApp extends JFrame {
	
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JTextArea ta=new JTextArea("내용을 입력하세요",100,100);
	JButton b1,b2,b3,b4;
	
	//JTextArea

	public MyApp(){
		super("::MyApp::");
		add(p);
		p.add(pN,"North");
		
		p.setBackground(Color.black);
		pN.setBackground(Color.orange);
		
		b1=new JButton("Login");
		b2=new JButton("Join");
		b3=new JButton("Home");
		b4=new JButton("Exit");
		
		pN.add(b1);
		pN.add(b2);
		pN.add(b3);
		pN.add(b4);
		
		
		
		JScrollPane sp=new JScrollPane(ta);
		ta.setBackground(Color.LIGHT_GRAY);
		p.add(ta);
		p.add(sp);
		

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		MyApp my=new MyApp();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
