package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* 이벤트 처리 
 * [1] 이벤트 소스란?
 * [2] 이벤트 
 * [3] 이벤트 핸들러
 * 
 */
public class MyGui extends JFrame {
	JPanel p , pN;
	JTextArea ta;
	JButton bR, bG, bB, bExit;
	
	public MyGui() {
		super("::MyGui::");
		p=new JPanel();
		add(p,"Center");
		p.setBackground(Color.LIGHT_GRAY);
		add(p,"Center");
		
		p.setLayout(new BorderLayout());
		pN=new JPanel();
		pN.setBackground(new Color(180, 50, 100 ));//red green blue 순서
		p.add(pN,"North");
		
		ta=new JTextArea("안녕");
		p.add(new JScrollPane(ta),"Center");//스크롤바에 textarea담아주기
		
		bR=new JButton("Red");
		bG=new JButton("Green");
		bB=new JButton("Blue");
		bExit=new JButton("Exit");
		
		pN.add(bR);
		pN.add(bG);
		pN.add(bB);
		pN.add(bExit);
		//생성자 안에서 이벤트 소스와 이벤트 핸들러를 연결해줘야 함. 
		//- "이벤트 소스.addxxxListener(이벤트 행들러 객체)"
		MyEventHandler handler=new MyEventHandler();
		//ㄴMyGui.MyEventHandler handler=this.new MyEventHangler(); 같다. 같은 클래스기 때문에
		bR.addActionListener(handler);//==>이벤트 핸들러클레스에 메소드를 불러옴.
		bG.addActionListener(handler);//==>버튼을 구분해줘야함.
		bB.addActionListener(handler);
		bExit.addActionListener(handler);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//생성자 ----------------------
	//이벤트 핸들러들은
	//xxx Listener상속 받아야함
	class MyEventHandler implements ActionListener//이벤트 핸들러는 이너클레스로/
	{
		@Override
		public void actionPerformed(ActionEvent e) {//이벤트 처리코드를 넣어준다.
			//이벤트가 발생된 객체의 참조값을 얻어보자.
			Object obj=e.getSource();//이벤트 소스에 대한 정보를 반환
			//ta.setBackground(Color.black);//배경색
			if(obj==bR) {
				ta.setForeground(Color.red);//글자색
			}else if(obj==bG) {
				ta.setForeground(Color.green);
			}else if(obj==bB) {
				ta.setForeground(Color.blue);
			}else if(obj==bExit) {
				System.exit(0);//시스템 종료
			}
			
		}
		
	}////////////////

	public static void main(String[] args) {
		MyGui my=new MyGui();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
