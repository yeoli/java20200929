package chap14.lecture.api.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx1 {
	public static void main(String[] args) {
		Consumer<Integer> con1 = x -> System.out.println(x*2);
		con1.accept(30);
		
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(70);
		list.add(70);
		list.add(40);
		
		list.forEach(con1);
		
		list.forEach(x -> System.out.println("items : " + x));
	}
}
