package ch12.ex01thread;

import java.awt.Toolkit;

public class Runnabletask implements Runnable{
@Override
public void run() {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for(int i = 0;i<5;i++) {
		toolkit.beep();
		try {Thread.sleep(500);} 
		catch (InterruptedException e) {}
	}
	
}
}
