package chpa09.lecture.localClass;

public class MyApp2LocalVariable {
	public static void main(String[] args) {
		final int i = 1;
		class LocalClass {
			void method1() {
				System.out.println(i);
				System.out.println(args);
				//i += 1;
			}
		}
		//args = new String[3];
		//i += 1;
	}
}
