package ch12.ex02set_name;

public class ThreadNameExample {

	public static void main(String[] args) {
		
		Thread maintThread = Thread.currentThread();
		System.out.println("현재 Thread 이름: "+maintThread.getName());
		
		Thread threadA = new ThreadA();
		threadA.start();
		Thread threadB = new ThreadB();
		threadB.start();
		
		
	}

}
