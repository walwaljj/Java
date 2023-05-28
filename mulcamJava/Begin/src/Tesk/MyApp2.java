package Tesk;
import javax.swing.*;
import java.awt.*;

public class MyApp2 extends JFrame{
	
	JPanel p;
	JTextArea t = new JTextArea();
	
	
	public MyApp2(){
			
		super("▀█▀ █▬█ █ ▄█▀ █ ▄█▀  ▄  ▄  ▄ ");
		p= new JPanel(new BorderLayout());
		p.setBackground(Color.BLUE);
		t.setLineWrap(true);
		JScrollPane sb=new JScrollPane(t);
		
		p.add(t);
		
		add(p);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		MyApp2 my=new MyApp2();
		my.setSize(500,400);
		my.setVisible(true);
	}
}


