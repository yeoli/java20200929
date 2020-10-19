package chpa08.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		MyInterface i1 = new MyClass();
		i1.method1();
		
		MyClass o2 = (MyClass) i1;
		o2.method2();
		
		System.out.println(i1 instanceof MyInterface);
		System.out.println(o2 instanceof MyInterface);
	}
}
