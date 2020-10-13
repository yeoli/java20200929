package chap06.textbook.exercises;

public class Triangle {
	
	double bottom;
	double height;
	
	Triangle(double bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}
	
	void changeInfo(double bt, double ht) {
		bottom = bt;
		height = ht;
	}
	
	double calArea() {
		return bottom * height/2;
	}
}
