package chap13.lecture.textbooks.s130201;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		Object o = box.get();
		
		if(o instanceof String) {
			String name = (String) o;
		}
		
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}
}
