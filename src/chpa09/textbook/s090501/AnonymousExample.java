package chpa09.textbook.s090501;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.field.wake();
		anony.method1();
		anony.method2(
				new Person() {
					void study() {
						System.out.println("공부합니다.");
					}
					
					@Override
					void wake() {
						// TODO Auto-generated method stub
						System.out.println("8시에 일어납니다.");
						study();
					}
				});
		
	}
}
