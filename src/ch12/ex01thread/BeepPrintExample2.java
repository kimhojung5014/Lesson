package ch12.ex01thread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			//람다식 Runnable interface
			Thread thread = new Thread( ()->{
				for(int i = 0;i<5;i++) {
					toolkit.beep();
					try {Thread.sleep(500);} 
					catch (InterruptedException e) {}
				}
			} );
			
			//익명 자식 객체
			Thread thread4 = new Thread(){
				@Override
				public void run() {
					for(int i = 0;i<5;i++) {
						toolkit.beep();
						try {Thread.sleep(500);} 
						catch (InterruptedException e) {}
					}
				}
			};
			thread4.start();
			
			thread.start();
			
			//자식 스레드 이용
			Thread thread2 = new Task();
			thread2.start();
			
			//Runnable 인터페이스 구현 객체 대입
			Runnable runnable = new Runnabletask();
			Thread thread3 = new Thread(runnable);
			thread3.start();
			
			
				
			
			for(int i = 0;i<5;i++) {
				System.out.println("팅");
				try {Thread.sleep(500);} 
				catch (InterruptedException e) {}
			}
		}
	}


