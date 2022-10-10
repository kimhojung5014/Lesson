package ch8;

public class RemoteControlExample_Anoy {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Power Turn On");			
			}
			
			@Override
			public void turnOff() {
				System.out.println("Power Turn Off");			
			}
			
			@Override
			public void setMute(int volume) {
				
			}
		};
		
		rc.turnOn();
		
		rc.turnOff();
		rc.setMute(true);
		RemoteControl.changeBattery();
	}

}
