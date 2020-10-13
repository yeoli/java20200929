package chap06.lecture.method;

public class MyAppReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassReturn o1 = new MyClassReturn();
		o1.method1();
		o1.method2();
		
		o1.var1 = 2;
		
		int v = o1.method2();
		System.out.println(v);
	}

}
