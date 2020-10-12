package chap06.lecture.field;

public class FieldEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		
		Car c1 = new Car();
		c1.name = "lulu";
		c1.model = "d1";
		c1.price = 300;
		
		System.out.println(c1.name);
		System.out.println(c1.model);
		System.out.println(c1.price);
		
		Car c2 = new Car();
		System.out.println(c2.name);
		System.out.println(c2.price);
		c2.name = "food";
		c2.price = 300;
		
		System.out.println(c2.name);
		System.out.println(c2.price);
			
		
	}

}
