package chap07.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SuperClass();
		SuperClass[] arr = new SuperClass[3];
		arr[0] = new SubClass();
		method3(new SubClass());
		
		SubClass o2 = (SubClass) o1;
		o2.method2();
		
	}
	
	public static void method3(SuperClass s) {
		s.method1();
	}
}
