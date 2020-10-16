package chpa08.lecture.interfaceKeyword;

public class Malamute extends KindaDog implements Pet{
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	
	@Override
	public void sit() {
		// TODO Auto-generated method stub
		System.out.println("말라뮤트가 앉습니다");
	}
}
