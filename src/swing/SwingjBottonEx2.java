package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingjBottonEx2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Jbotton을 이용한 버튼");
		
		final JTextField tf = new JTextField();
		tf.setBounds(10, 20, 250, 20);
		
		JButton b = new JButton("버튼 Click");
		b.setBounds(50, 50, 200, 20);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("버튼을 클릭했습니다.");
				
			}
		});
		f.add(b);
		f.add(tf);
		f.setSize(310,150);
		f.setLayout(null);
		f.setVisible(true);
	}

}
