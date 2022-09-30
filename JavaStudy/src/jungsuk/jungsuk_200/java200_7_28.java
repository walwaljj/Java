package jungsuk.jungsuk_200;
import java.awt.*;
import java.awt.event.*;
public class java200_7_28 {

	public static void main(String[] args) 
	{
		
		Frame f = new Frame();
		f.addWindowListener(new windowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}

}


