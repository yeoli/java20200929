package chap04.exercises;

public class P5_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		
		for(int num = 1; num<=100; num++)
		{
			if(num%5 == 0 && num%7 == 0) {
		    count += 1;
		    System.out.println(num);
			}
			
		}
		
		System.out.println("count : " + count);

	}

}
