package chap14.lecture.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorEx1 {
	public static void main(String[] args) {
		Random random = new Random();
		//음수, 0, 양수 중 리턴
		//왼쪽이 작으면 음수
		//같으면 0
		//왼쪽이 크면 양수
		Comparator<Integer> asc = (x, y) -> x-y;
		Comparator<Integer> asc1 = (x, y) -> y-x;
		
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		
		for(int i = 0; i<10; i++) {
			list.add(random.nextInt(100));
			list1.add(random.nextInt(100));
		}
	
		list.sort(asc);
		
		list.forEach(e -> System.out.println(e));
		System.out.println("======");
		
		list.sort(asc1);
		
		list.forEach(e -> System.out.println(e));
	}
}
