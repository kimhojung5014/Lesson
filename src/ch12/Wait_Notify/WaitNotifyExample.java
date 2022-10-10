package ch12.Wait_Notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		DateBox dateBox = new DateBox();
		
		ProducerThread producerThread = new ProducerThread(dateBox);
		ConsumerThread consumerThread = new ConsumerThread(dateBox);
		
		producerThread.start();
		consumerThread.start();
	}

}
