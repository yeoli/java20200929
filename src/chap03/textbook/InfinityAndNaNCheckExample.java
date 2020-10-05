package chap03.textbook;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		double y = 0.0;
		
		double z = x/y;
		double a = x%y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(Double.isInfinite(a));
		System.out.println(Double.isNaN(a));
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
		System.out.println(z+2);
		}
	}

}
