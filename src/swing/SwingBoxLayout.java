package swing;

import java.awt.Button;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class SwingBoxLayout {

	public static void main(String[] args) {
		JFrame f = new JFrame("BoxLayout 예제");
		Button buttons[];
		buttons = new Button[5];
		for(int i = 0;i<5;i++) {
			buttons[i] = new Button("Button"+(i+1));
			f.add(buttons[i]);
		}
//		f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.X_AXIS));
		f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
		f.setSize(350, 150);
		f.setVisible(true);
		
	}

}
