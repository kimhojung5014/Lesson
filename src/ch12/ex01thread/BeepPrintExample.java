package ch12.ex01thread;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		
		for(int i = 0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
		
		for(int i = 0;i<5;i++) {
			System.out.println("팅");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}

}
