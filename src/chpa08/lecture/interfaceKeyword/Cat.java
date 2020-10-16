package chpa08.lecture.interfaceKeyword;

public class Cat extends KindaCat implements Pet{
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}
	
	@Override
	public void sit() {
		// TODO Auto-generated method stub
		System.out.println("고양이가 앉습니다");
	}
}
