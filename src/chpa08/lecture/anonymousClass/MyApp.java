package chpa08.lecture.anonymousClass;

public class MyApp {
	public static void main(String[] args) {
		Myinterface o1 = new MyClass();
		o1.method1();
		
		Myinterface o2 = new Myinterface() {
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("anonymous class method");
			}
		};
	}
}
