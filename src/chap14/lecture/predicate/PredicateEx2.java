package chap14.lecture.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PredicateEx2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Supplier<Integer> random = () -> (int) (Math.random() * 200) - 50;
		
		for(int i=0; i<30; i++) {
			list.add(random.get());
		}
		
		System.out.println("---값 확인");
		list.forEach(e -> System.out.println(e));
		
		boolean b = list.removeIf(x -> x<0 || x>100); //조건에 맞는 애들 삭제
		
		System.out.println("---값 확인");
		
		list.forEach(e -> System.out.println(e));
	 
	}
}
