package chap14.textbook.s140502;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
//		IntSupplier intSupplier = () -> {
//			int num = (int) (Math.random() * 6) + 1;
//			return num;
//		};
		
//		Supplier<Integer> intSupplier = () -> (int) ((Math.random() * 6) + 1);
		IntSupplier intSupplier = () -> (int) ((Math.random() * 6) + 1);
		
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수 " + num);
	}
}
