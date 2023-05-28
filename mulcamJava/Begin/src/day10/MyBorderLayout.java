package day10;
import javax.swing.*;
import java.awt.*;

public class MyBorderLayout extends JFrame{
	
	JButton[] bt=new JButton[5];//배열에 버튼수를 담아준다/
	JPanel p=new JPanel();

	public MyBorderLayout() {
		super("::MyBorderLayout::");
		add(p);
		p.setLayout(new BorderLayout());//마지막 버튼만 나옴 --> 
										//add()할때 동,서,남,북,중앙 지역을 지정해서 붙여야한다.
										//1.for 루프 안 p.add(bt[i]);를 주석처리하고 
										//2. for루프 바깥에 p.add(bt[0], "North");해주기
										//   					ㄴ 여기서 지정하지 않으면 디폴트값인 센터에 붙는다.
										
		
		
		for(int i=0;i<bt.length;i++) {
			bt[i]=new JButton("b"+(i+1));
			//p.add(bt[i]);
		}
		p.add(bt[0], "North");
		p.add(bt[1], "South");
		p.add(bt[2], "West");
		p.add(bt[3], "East");
		p.add(bt[4], "Center");
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyBorderLayout my=new MyBorderLayout();
		my.setSize(400,400);
		my.setVisible(true);
	}
	//패널의 레이아웃을 보더로..==> 동서남북이있으니 JPanel p ==BorderLayout
	//패널을 하나더 생성해 북쪽에 .!					JPanel pN == p에 붙일때 North
	//JTextArea = p에 붗일때 JScrollPane 에 담아서 Center에 붙인다.
	//버튼 4개 생성하기 pN에 JButton4개(Login , Join,Home, Exit)
	//

}
