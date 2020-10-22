package chap13.lecture.textbooks;

public class GenericEx3 {
	public static void main(String[] args) {
		GenericEx3.<String> method("java");
		method("hello");
		method(3);
		
		String s = method2();
		Integer i = method2();
	}
	
	public static <T> T method2() {
		return null; 
	}
	
	public static <T> void method(T t) {
		System.out.println(t);
	}
}
