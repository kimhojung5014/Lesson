package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class swingFlowLayout extends JFrame{
	
		

	public static void main(String[] args) {
		JFrame f = new JFrame("BorderLayout 예제");
		JButton b1 = new JButton("북");
		JButton b2 = new JButton("남");
		JButton b3 = new JButton("동");
		JButton b4 = new JButton("서");
		JButton b5 = new JButton("중앙");
		
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		
		f.setSize(300,150);
		f.setVisible(true);
	}

}
