package chap07.textbook.s070706;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) { // parent가 child로 형변환 가능하냐 가 아니고 parent가 참조하는 인스턴스가 child이거나 child를 상속하는 인스턴스냐 라는 뜻!!
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		System.out.println(parentB instanceof Child);
		method1(parentB);
		method2(parentB);
		
	}
}
