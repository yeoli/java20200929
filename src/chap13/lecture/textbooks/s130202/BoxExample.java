package chap13.lecture.textbooks.s130202;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		
		String str = box1.get();
		
		Box<Integer> box2 = new Box<>();
		box2.set(6);
		int value = box2.get();
	}
}