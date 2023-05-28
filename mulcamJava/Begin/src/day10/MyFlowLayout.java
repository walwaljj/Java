package day10;
import javax.swing.*;
import java.awt.*;

/*LayoutManger 
 * -[1]FlowLayout  : 기본임. 변경하고싶다면 setLayout 으로 변경.23, 24번줄
 * -[2]BorderLayout : 동, 서, 남, 북, 중앙 영역을 지정해서 배치
 * -[3]GridLayout : 행과 열의 형태로 균등히 배치
 * 레이아웃을 변경 : setLayout()이용
 */

public class MyFlowLayout extends JFrame{//jframe은 윈도우를 만들수있는 부모클래스 상속해야함/
	
	JButton b1,b2,b3,b4;
	JPanel p;// JPanel 은 원단.. 붙힐수 있는곳..
	
	//---------------------------------------------------------
	public MyFlowLayout() {
		super("::MyFlowLayout::");
		p=new JPanel(); 
	//	p.add(b1);//b1은 이 단계에서 null...  만들어지지 않았는데 호출해서.!
		this.add(p);
		p.setBackground(Color.orange);
		//p.setLayout(new BorderLayout()); //-마지막 버튼(b4)만 나옴
		//p.setLayout(new GridLayout(2,2));//2행 2열
		p.setLayout(new FlowLayout(FlowLayout.LEFT));//오라클에 FLOWLAYOUT 의 INT값은 LEFT<-STATIC으로 클래스.LEFT
		
		
		b1=new JButton("  b1  ");//버튼은 사이즈를 조정할 수 없고 공백으로 조절..
		b2=new JButton("b2");
		b3=new JButton("b3");
		b4=new JButton("b4");
		
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		//창닫기 메소드
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//STATIC FAINAL 상수이며 창닫고 콘솔 비활성화/
	}

	public static void main(String[] args) {
		MyFlowLayout my=new MyFlowLayout();
		//창 사이즈조절 메소드.
		my.setSize(400,400);
		
		//창을 띄우는 메소드.
		my.setVisible(true);
	}

}
