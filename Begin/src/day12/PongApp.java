package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class PongApp extends JFrame {

	JPanel p=new JPanel();
	JPanel pN= new JPanel();
	JTextArea ta;
	
	JLabel lb;
	JTextField tfName;
	JButton btAdd, btSave;
	
	public PongApp() {
		super("PongApp");
		add(p,"Center");
		p.setLayout(new BorderLayout());//하지 않으면 pn이 상단에 버튼처럼 작게나온다.
		
		p.add(pN,"North");
		pN.setBackground(Color.LIGHT_GRAY);
		
		p.add(new JScrollPane(ta=new JTextArea()),"Center");
		
		
		lb=new JLabel("이  름 : ");
		tfName=new JTextField(20);
		btAdd = new JButton("등  록");
		btSave=new JButton ("저  장");
		
		pN.add(lb);
		pN.add(tfName);
		pN.add(btAdd);
		pN.add(btSave);
		
		//리스너를 붙혀주기
		MyEventHandler handler=new MyEventHandler();
		btAdd.addActionListener(handler);
		btSave.addActionListener(handler);
		//문제3) tfName에서 얻어온 값을 ta에 붙이기.
		//setTitle("save")
		tfName.addActionListener(handler);//입력 후 엔터치면 ActionEvent발생함.
		
		setSize(500,700);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyEventHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();
			if(obj==btAdd || obj==tfName) {//btAdd 나 tfName이라면..실행해라.
				
			//	setTitle("환영합니다.");  ==> 누르면 타이틀이 바뀜.	
				//문제1)tfName에 입력한 값을 얻어오기
				//public String getText()
				String name=tfName.getText();//text를 받아온다.
				//System.out.println(name);
				name = name.trim();//앞뒤 공백 제거를 위해 재할당.
				
				//문제2)입력한 값의 성을추출하여 퐁씨면 타이틀 xxx님 환영합니다.
				
				try{char fname = name .charAt(0);
			
				
				if(fname=='퐁') {
					setTitle(name+"님 환영합니다.");
				//	ta.setText(name);
					ta.append(name+"\n");
				}else if(fname=='콩') {
					//사용자 정의 예외 객체를 발생시키기 ==> throw new 예외객체();
					//예외가 발생한다면 해당 예외를 try~catch 해주기 throw로 넘기는건 override 한 메소드에서 힘듦.
					throw new NotSupportedNameException("콩씨는 절대로 등록할 수 없음");
				}else {
					throw new NotSupportedNameException("퐁씨가 아닌 성씨분들은 이용에 제한이 있습니다.");
				}
				}catch(NotSupportedNameException ex) {
					String msg = ex.getMessage();
					setTitle(msg);
					
					//메세지 박스 띄우기
					JOptionPane.showMessageDialog(p, msg);//p패널에 msg 를 띄우겠다는 뜻.
					
					
				}finally {
					tfName.setText("");
					tfName.requestFocus();//입력 포커스 주기
				}
				
				
				
			}else if(obj==btSave){
			//	setTitle("save");
			}
		}
	}

	public static void main(String[] args) {
		
		new PongApp();
	}

}
