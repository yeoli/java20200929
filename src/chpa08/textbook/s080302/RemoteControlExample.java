package chpa08.textbook.s080302;

import chpa08.textbook.s080201.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("dfa");
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		
		};
		
		rc.turnOn();
	}
}
