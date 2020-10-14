package chap06.lecture.encapsulation;

public class Car {
	private int speed;
	
	public void setSpeed(int speed) {
		if(speed >= 0)
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
