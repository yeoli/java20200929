package chap04.exercises;
import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("*");
		  }
			System.out.println(" ");
		}
		System.out.println("=============");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("=============");
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>0; j--) {
				if(i<j) {
				System.out.print(" ");
			    }else {
			    System.out.print("*");
			    }
			}
			System.out.println(" ");
		}
		
		System.out.println("=============");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
		System.out.println("=============");
		
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		for(int i=0; i<num; i++) {
//			for(int j=0; j<num; j++)
//			{
//				if(i<=num/2)
//				{
//					if(i+j<=num/2-1)
//						System.out.print(" ");
//					else if(j-i>=num/2+1)
//						System.out.print(" ");
//					else 
//						System.out.print("*");
//				 }
//				else if (i>num/2) 
//				{
//					if(i-j>=num/2+1)
//						System.out.print(" ");
//					else if(i+j>=num/2*3+1)
//						System.out.print(" ");
//					else 
//						System.out.println("*");
//				}
//			}
//			
//			System.out.println();
		}
	 }
		


