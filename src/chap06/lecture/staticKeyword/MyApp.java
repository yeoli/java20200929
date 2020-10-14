package chap06.lecture.staticKeyword;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		MyClass o2 = new MyClass();
		
		o1.var1 = 99;
		o2.var1 = 33;
		
		o1.method1();
		o2.method1();
		
		o1.var2 = 100;
	
		System.out.println("---------");
		o2.method1();
		o1.method1();
		
		MyClass.method2();
	}
}
