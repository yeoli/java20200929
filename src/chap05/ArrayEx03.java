package chap05;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = mymethod(2);
		System.out.println(a);
		
		a = mymethod(4);
		System.out.println(a);
		
		int[] arr1 = new int[] {9,8,7};
		int v = mymethod2(arr1);
		System.out.println(v);
		
		int[] arr2 = new int[] {99, 88, 77};
		a = mymethod2(arr2);
		System.out.println(a);
		
		a = mymethod2(new int[] {22,33,44});
		System.out.println(a);
		
	}
	
	public static int mymethod2(int[] ar) {
		System.out.println("===mymethod2시작===");
		int sum = 0;
		for(int i=0; i<3; i++) {
			System.out.println(ar[i]);
			
			sum += ar[i];
		}
		
		System.out.println("===mymethod2종료===");
		return sum;
		
		//int s = arr[0] + arr[2];
		//return s;
	}
	
	public static int mymethod(int i) {
		return i*2;
	}
}
