package chap06.textbook.exercises;

public class TriangleInstanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri = new Triangle(10.2, 17.3);
		System.out.println(tri.calArea());
		
		System.out.println("-------------");
		tri.changeInfo(12.5, 13.5);
		
		System.out.println(tri.calArea());
		
	}

}
