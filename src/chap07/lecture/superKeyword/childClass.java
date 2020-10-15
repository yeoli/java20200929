package chap07.lecture.superKeyword;

public class childClass extends ParentClass{
	childClass(int i) {
		super(i);
	}

	@Override
	void method1() {
		super.method1();
		System.out.println("child method1");
	}
	

}
