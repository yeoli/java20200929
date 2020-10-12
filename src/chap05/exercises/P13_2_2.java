package chap05.exercises;

public class P13_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=arr.length; j<0; j--) {
				System.out.println(arr[i][j]);
			}
		}
		

	}
	
	

}
