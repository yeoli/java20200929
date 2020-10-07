package chap04.exercises;
import java.util.Scanner;

public class Staraar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("입력");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++)
			{
				if(i<=num/2)
				{
					if(i+j<=num/2-1)
						System.out.print(" ");
					else if(j-i>=num/2+1)
						System.out.print(" ");
					else 
						System.out.print("*");
				 }
				else if(i>num/2) 
				{
					if(i-j>=num/2+1)
						System.out.print(" ");
					else if(i+j>=num/2*3+1)
						System.out.print(" ");
					else 
						System.out.print("*");
				}
			}
			
			System.out.println("");
		}

	}
}
