package swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SwingJLebelex {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JLabel l;
		l = new JLabel("이미지출력",new ImageIcon("a.png"),SwingConstants.RIGHT);
		l.setBounds(500, 500, 500, 500);
		f.add(l);
		f.setSize(1000, 1000);
		f.setLayout(null);
		f.setVisible(true);
	}

}
