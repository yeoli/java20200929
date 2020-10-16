package chpa08.textbook.s080201;

public interface RemoteControl {
	public int MAX_VOLUME = 10; // public static final 생략 가능
	public int MIN_VOLUME = 0;
	
	public void turnOn(); //public abstract 생략 가능
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
