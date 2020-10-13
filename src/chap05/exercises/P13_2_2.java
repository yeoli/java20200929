package chap05.exercises;

public class P13_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};


	}
	
	public static void shiftTwoDArr(int[][] arr) {
		int[] lastLow = arr[arr.length-1];
		for(int low=arr.length-1; low>0; low--) 
			arr[low] = arr[low-1];
		
		arr[0]=lastLow;
	}
	
	public static void showTowDArr(int[][] arr) {
	
	}
	

}
