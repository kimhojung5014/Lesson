package ch8;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	//추상
	void turnOn();
	void turnOff();
	void setMute(int volume);
	
	//default
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	//정적
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
