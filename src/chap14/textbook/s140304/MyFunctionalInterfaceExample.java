package chap14.textbook.s140304;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> {return x+y;};
		
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2,5));
		
		fi = (x, e) -> sum(x, e);
		System.out.println(fi.method(2, 5));
	}
	
	public static int sum(int x, int y) {
		return (x+y);
	}
}
