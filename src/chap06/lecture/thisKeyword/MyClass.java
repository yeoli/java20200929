package chap06.lecture.thisKeyword;

public class MyClass {

	int var; //인스턴스 필드
	
	void method1() {
		System.out.println(this.var);
		int var = 5;
		System.out.println(var); //위의 5가 이 var고 위의 this.var는 myclass아래 var
		
	}
	
	void method2() {
		this.method1();
	}
}
