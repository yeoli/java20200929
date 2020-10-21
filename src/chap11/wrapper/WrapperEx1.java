package chap11.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
		//byte, short, int, long
		//float, double, char, double
		
		//Byte, Short, Integer, Long
		//Float, Double. Character, Boolean
		
		int i = 1;
		Integer in = Integer.valueOf(i);
		
		method1(in);
		
		double i1 = 2.9;
		Double in1 = Double.valueOf(i1);
		
		method1(in1);
	}
	
	public static void method1(Object o) {
		System.out.println(o);
	}
}
