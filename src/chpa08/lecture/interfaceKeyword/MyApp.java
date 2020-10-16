package chpa08.lecture.interfaceKeyword;

public class MyApp {
	public static void main(String[] args) {
		KindaCat c1 = new Cat();
		KindaCat c2 = new Tiger();
		
		KindaDog d1 = new Malamute();
		KindaDog d2 = new Wolf();
		
		c1.cry();
		c2.cry();
		
		d1.bark();
		d2.bark();
		
		Pet p1 = new Cat();
		Pet p2 = new Malamute();
		
		p1.sit();
		p2.sit();
		
		
		}
}
