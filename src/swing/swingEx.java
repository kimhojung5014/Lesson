package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class swingEx extends JFrame{
	
	JFrame f;
	public swingEx() {
		JFrame f = new JFrame();
		JButton b = new JButton("버튼");
		JButton c = new JButton("누르지마!");
		b.setBounds(50, 20, 100, 20);
//		c.setBounds(50, 20, 100, 20);
		f.add(b);
//		f.add(c);
		f.setSize(200, 100);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new swingEx();

	}

}
