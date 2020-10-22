package chap13.lecture;

public class MyClass<T> {
	public void method1() {
		System.out.println("메소드1");
	}
	
	public void method2(T d) {
		//T를 클래스 안에서 사용하기 위해
		System.out.println(d);
	}
}
