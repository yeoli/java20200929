package chap14.lecture.predicate;

import java.util.function.Predicate;

public class PredicateEx1 {
	public static void main(String[] args) {
		Predicate<Integer> isEven = x -> x % 2 == 0;
		Predicate<Integer> isOdd = x -> x % 2 == 1;
		
		boolean s = isEven.test(29);
		boolean t = isOdd.test(29);
		System.out.println(s);
		System.out.println(t);
		
	}
}
