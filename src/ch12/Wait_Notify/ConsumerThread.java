package ch12.Wait_Notify;

public class ConsumerThread extends Thread{
	private DateBox dateBox;
	
	public ConsumerThread(DateBox dateBox) {
		this.dateBox = dateBox;
	}
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			String data = dateBox.getData();
		}
	}
}
