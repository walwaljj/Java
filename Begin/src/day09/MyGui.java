package day09;
import javax.swing.*;
import java.awt.*;

//CLI : Command Line Interface 도스 콘솔에서 실행되는 프로그램
//GUI : Graphic User Interface 그래픽 환경을 갖춘 프로그램
//JFrame : Window 계열의 컨테이너
//			반드시 사이즈를 정해주고 setVisible(true)를 주어야 화면에 보여짐


//JPanel : Panel계열의 컨테이너
public class MyGui extends JFrame{
	JPanel p;//ex 옷
	JButton bt1, bt2, bt3;//component : 구성품 ex 단추
	Icon icon1, icon2, icon3, icon4, icon5;
	
	JTextField tf1, tf2;
	JTextArea ta1, ta2;

	//기본생성자 생성
	public MyGui() {
		super("::MyGui Progream v1.1::");//타이틀에 문자열이 올라간다.
		p=new JPanel();
		add(p);//JFrame의 중앙에 판넬이 붙는다.
		
		p.setBackground(Color.GRAY);
		
		icon1=new ImageIcon("icon1.png");
		icon2=new ImageIcon("icon2.png");
		icon3=new ImageIcon("icon3.png");
		icon4=new ImageIcon("icon4.png");
		icon5=new ImageIcon("icon5.png");
		
		bt1=new JButton(icon1);
		
		bt2=new JButton("Home", icon3);
		bt2.setHorizontalTextPosition(JButton.CENTER);
		bt2.setVerticalTextPosition(JButton.TOP);
		
		bt3=new JButton("Login",icon2);
		bt3.setHorizontalTextPosition(JButton.CENTER);
		bt3.setVerticalTextPosition(JButton.BOTTOM);
		bt3.setPressedIcon(icon4);
		bt3.setRolloverIcon(icon5);
		
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		
		
		tf1=new JTextField(20); 
		tf2=new JTextField("네이버를 검색하세요",30);
		
		tf1.setBackground(Color.gray);
		
		tf2.setBackground(Color.CYAN);//배경색 
		tf2.setForeground(Color.BLUE );//글자색
		
		ta1=new JTextArea("안녕하세요. 반갑습니다!!",5,20);
		ta2=new JTextArea(10,30); //rows:10,columns:30
		
		p.add(tf1);
		p.add(tf2);
		//jtextarea 는 JScrollPane에 붙여야 스크롤바가 붙는다.
		JScrollPane sp=new JScrollPane(ta1);
		p.add(sp);
		
		//p.add(ta2); ㄱ아래방식으로 해도됨.
		p.add(new JScrollPane(ta2));
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame 으로 상속받은 메소드..창닫기 처리 - 프로세스 종료
	}//생성자-------
	
	public static void main(String[] args) {
	
		
		MyGui my=new MyGui();//JFrame
		my.setSize(500, 500);//폭,높이
		my.setVisible(true);//<== 하지않으면 창이 뜨지않는다. 꼭 해야함
		

	}

}
