package ch12.JoinThread;

public class JoinThreadExample {

	public static void main(String[] args) {
		SumThread thread = new SumThread();
		
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("합은 : "+thread.getSum());
	}

}
