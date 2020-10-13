package chap06.lecture.method;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass o1 = new MyClass();
		o1.var1 = String.valueOf(3);
		o1.var2 = 2;
		o1.myMethod();
		
		MyClass o2 = new MyClass();
		o2.var1 = String.valueOf(3);
		o2.myMethod();
		
		o2.myMethod2(8);
		
		o1.myMethod2(5);
		
		if(o1.var1.equals(o2.var1)) {
			System.out.println(true);
		} else
			System.out.println(false);
	}

}
