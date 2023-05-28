package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * 
 */
class MyJPanel extends JPanel{
	
	//컨테이너의 바깥여백을 주는 메서드를 오버라이딩하기
	@Override
	public Insets getInsets() {//Insets : 창의 여백을 줄 수 있다. insets를 오버라이드해서 사용.
		
		Insets in=new Insets(20, 20, 20, 20);//top left bottom right 순서
		return in;//해당내용을 ()를 통해 반환해준다.
	}
	
}//---------------------------


public class SerchEnngine extends JFrame{
	JPanel p = new MyJPanel();//부모타입(JPanel) 선언하고 자식의(MyJpanel) 재정의 메소드를(getInsets)를 사용
	
	
	JButton[] bt = new JButton[4];//버튼 공간 확보, bt라는 변수가 공간을 가리키고있다.
	String [] str = {"Naver","Google","Daum","Yahoo"};
	
	public SerchEnngine() {
		super("::SerchEnngine::");
		add(p,"Center");
		
		//GridLaout(int row, int col, int hgap, int vgap)
		p.setLayout(new GridLayout(2,2,20,20));//레이아웃설정은 add 하기전에 정해야한다.
										//그리드 레이아웃은 균등하게 붙는다.
		
		for(int i=0;i<bt.length;i++) {
			bt[i]=new JButton(str[i]);
			p.add(bt[i]);
		}
		
		//버튼에 대한 이벤트 처리를 anonymous class로 해보기
		bt[0].addActionListener(new ActionListener() {//이름없는 클레스, ActionListener를 상속받는다.
			
			@Override
			public void actionPerformed(ActionEvent e) {//bt[]에대한 이벤트 처리 구간.
				bt[0].setBackground(Color.green);	//버튼 0번째에대한 지정			
				setTitle(str[0]+"버튼을 눌렀군요");
			}
		});
		//bt[1] 에 대한 배경색
		bt[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[1].setBackground(Color.yellow);
				setTitle(str[1]+"버튼을 눌렀군요");
			}
		});
		
		bt[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();//이벤트 소스의 라벨 문자열을 반환한다.
				String cmd= e.getActionCommand();
				setTitle(cmd);
				((JButton)obj).setBackground(Color.pink);//object는 setbackground메소드가 없기때문에 
														//jbutton 형으로 강제형변환.
			}
		});
		bt[3].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();//이벤트 소스의 라벨 문자열을 반환한다.
				String cmd= e.getActionCommand();
				setTitle(cmd);
				((JButton)obj).setBackground(Color.magenta);
													
			}
		});
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	public static void main(String[] args) {
		SerchEnngine my = new SerchEnngine();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
