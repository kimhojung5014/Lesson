package swing;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class EventEx {
	JLabel label;
	
	EventEx(){
		label = new JLabel();
		label.setBounds(10, 10, 170, 20);
		Button btn = new Button("click me");
		btn.setBounds(50, 50, 80, 30);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("익명객체를 이용한 이벤트");			
			}
		});
	
	}
	
	public static void main(String[] args) {
		new EventEx();
	
	}

}
