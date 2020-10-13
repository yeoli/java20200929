package chap05.exercises;
import java.util.Scanner;

public class P13_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, min = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		for(int i=0; i<len; i++) {
		  arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<len; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("최소 : " + minValue(arr));
		System.out.println("최대 : " + maxValue(arr));

	}
	
	public static int minValue(int[] arr) {
		int min = arr[0];
//		for(int i=0; i<arr.length; i++) {
//			min = (min < arr[i]) ? min : arr[i];  
//		}
		
		for(int e : arr) {
			if(min>e)
				min = e;
		}
		
		return min;
		
	}
	
	public static int maxValue(int[] arr) {
		int max = 0;
//		for(int i=0; i<arr.length; i++) {
//			max = (max > arr[i]) ? max : arr[i];  
//		}
		
		for(int e : arr) {
			if(max<e)
				max = e;
		}
		
		return max;
		
	}

}
