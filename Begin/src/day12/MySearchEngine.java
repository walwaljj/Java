package day12;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;//awt의 서브패키지 이지만 해주자..

public class MySearchEngine extends JFrame {
	
	JPanel pN,p ;
	JTextArea ta;
	JButton bY, bG, bB, bC;
	JTextField tf;
	
	public MySearchEngine() {
		
		super("::MySearchEngine::");
		pN=new JPanel();
		add(pN);
		pN.setBackground(Color.LIGHT_GRAY);
		pN.setLayout(new BorderLayout());
		
		p=new JPanel();
		p.setLayout(new GridLayout(2,2));//행,열 지정
		pN.add(p,"Center");
		
		bY=new JButton("Google");
		bG=new JButton("Naver");
		bB=new JButton(" Daum");
		bC=new JButton(" Nate");
		
		bY.setBackground(Color.yellow);
		bG.setBackground(Color.GREEN);
		bB.setBackground(Color.BLUE);
		bC.setBackground(Color.CYAN);
		
		p.add(bG);
		p.add(bY);
		p.add(bB);
		p.add(bC);
		
		tf=new JTextField("검색 엔진을 선택하세요!");
		tf.setForeground(Color.white);
		tf.setBackground(Color.DARK_GRAY);
		pN.add(tf,"South");
		
		
		MyEventHandler handler=new MyEventHandler();
		bG.addActionListener(handler);
		bY.addActionListener(handler);
		bB.addActionListener(handler);
		bC.addActionListener(handler);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	class MyEventHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Object obj=e.getSource();
			
			if(obj==bG) {
				tf.setForeground(Color.GREEN);
			}else if(obj==bY) {
				tf.setForeground(Color.yellow);
			}else if(obj==bB) {
				tf.setForeground(Color.blue);
			}else{
				tf.setForeground(Color.CYAN);
			}
		}
		
	}

	public static void main(String[] args) {
		
		MySearchEngine my=new MySearchEngine();
		my.setSize(500, 500);
		my.setVisible(true);
		my.setLocation(580,270);
	}

}
