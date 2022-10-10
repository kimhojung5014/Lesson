package ch12.Wait_Notify;

public class ProducerThread extends Thread{
	private DateBox dateBox;
	
	public ProducerThread(DateBox dateBox) {
		this.dateBox = dateBox;
	}
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			String data = "Data"+i;
			dateBox.setData(data);
		}
	}
}
