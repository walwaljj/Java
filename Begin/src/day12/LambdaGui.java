package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LambdaGui extends JFrame{

	
	JPanel p=new JPanel();
	JPanel pN = new JPanel();
	JLabel lb;
	JButton bt1,bt2;
	//JTextArea
	
	public LambdaGui() {
		super("::LambdaGui::");
		
		add(p,"Center");
		p.setLayout(new BorderLayout());
		
		lb=new JLabel(new ImageIcon("icon1.png"));
		lb.setText("Welcome to MyApp");
		lb.setHorizontalTextPosition(JLabel.CENTER);
		lb.setVerticalAlignment(JLabel.TOP);
		lb.setFont(new Font("san-serif",Font.BOLD,25));// 서체 스타일 크기 순서.
		
		p.add(pN,"North");
		p.add(lb,"Center");//기본이 왼쪽정열!
		
		
		bt1=new JButton("Blue");
		bt2=new JButton("Pink");
		pN.add(bt1);
		pN.add(bt2);
		
		//[1] BT1 클릭시 lb의 글자색을 파랑으로 ==>Anonymous cls
		
		bt1.addActionListener(new ActionListener(){
		//                       ㄴ 상속받을 클래스
			@Override
			public void actionPerformed(ActionEvent e) {
			lb.setForeground(Color.blue);
			}
		});
				
		//[2] bt2 글자색을 핑크색 = > 람다식 이용해 이벤트 처리.
		bt2.addActionListener(e->{lb.setForeground(Color.pink);});
		//bt2.setBackground(Color.pink);
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	public static void main(String[] args) {
		
		new LambdaGui();

	}

}
