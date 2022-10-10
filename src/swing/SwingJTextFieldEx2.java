package swing;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingJTextFieldEx2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Swing JTextField");
		JTextField t1,t2;
		
		t1 = new JTextField("Swing Component를 사용합니다.");
		t1.setBounds(20,10,200,30);
		
		t2 = new JTextField("Swing JTextField");
		t2.setBounds(20,10,200,30);
		
		f.add(t1);
		f.add(t2);
		
		f.setSize(300, 150);
		f.setLayout(null);
		f.setVisible(true);
	}

}
