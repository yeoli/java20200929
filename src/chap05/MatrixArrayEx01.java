package chap05;

public class MatrixArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] str = new int[2];
		//int[] str =  new int[] {2,3}; 
		
		int[][] matrix = new int[3][2];
		
		int[] arr = new int[3];
		System.out.println(arr.length);
		
		System.out.println(matrix[0].length);
		System.out.println(matrix[1].length);
		System.out.println(matrix[2].length);
		
		arr[0]=99;
		arr[1]=88;
		arr[2]=77;
		
		matrix[0][0] = 1;
		matrix[2][0] = 2;
		
		


	}

}
