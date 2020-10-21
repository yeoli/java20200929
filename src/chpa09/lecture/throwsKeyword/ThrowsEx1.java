package chpa09.lecture.throwsKeyword;

public class ThrowsEx1 {
	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		method2();
	}
	
	public static void method2() {
		try {
			method3();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method3() throws ClassNotFoundException {
		Class.forName("java.lang.String");
		//FileReader fr = new FileReader("file.txt");
	}
}
