package chap06.lecture.constructor;

public class ConstructorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h1 = new Hero("lulu", 200);
		Hero h2 = new Hero("thor", 199);
		System.out.println(h1.name);
		System.out.println(h1.power);
		System.out.println(h2.name);
		System.out.println(h2.power);
		
		Hero h3 = new Hero("spider");
		System.out.println(h3.name);
		System.out.println(h3.power);
	}

}
