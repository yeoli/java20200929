package chap05;

public class ArrayCopyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {5,6,7};
		
		int[] arr2 = new int[arr1.length];
		
//		arr2[0] = arr1[0];
//		arr2[1] = arr1[1];
//		arr2[2] = arr1[2];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int n : arr2) {
			System.out.println(n);
		}
		
		int[][] arr3 = {{3,4}, {88,99}, {2,1}};
		int[][] arr4 = new int[arr3.length][];
		

		for(int i=0; i<arr3.length; i++) {
			arr4[i] = arr3[i];
		}
		
		for(int[] arr : arr4) {
			for(int n : arr) {
				System.out.println(n);
			}
		}
		
		int[][] arr5 = {{3,4}, {88,99}, {2,1}};
		int[][] arr6 = new int[arr5.length][];
		

		for(int i=0; i<arr5.length; i++) {
			int[] newArr = new int[arr5[i].length];
			

			for(int j=0; i<arr5[i].length; i++) {
				newArr[j] = arr5[i][j];
			}
			
			arr6[i] =  newArr;
		}
		
		arr5[0][0] = 100;
		
		for(int[] arr : arr5) {
			for(int n : arr) {
				System.out.println(n);
			}
		}
		
		}

	}

