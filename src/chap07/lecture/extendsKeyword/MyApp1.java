package chap07.lecture.extendsKeyword;

public class MyApp1 {
	public static void main(String[] args) {
		subClass o1 = new subClass();
		System.out.println(o1.var1);
		o1.method01();
		System.out.println(o1.var2);
		o1.method2();
	}
	
}
