package chap06.lecture.constructor;

public class ConstructorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println(car1.name);
		System.out.println(car1.price);
		
		System.out.println(car2.name);
		System.out.println(car2.price);
		
		Car car3 = new Car("lulu");
		Car car4 = new Car("momo");
		
		System.out.println(car3.name);
		System.out.println(car4.name);
		
		System.out.println(car3.price);
		System.out.println(car4.price);
		
		Car car5 = new Car("left", 700);
		
		System.out.println(car5.name);
		System.out.println(car5.price);
		
		Car car6 = new Car("right", 800);
		
		System.out.println(car6.name);
		System.out.println(car6.price);
		
		
	}

}
