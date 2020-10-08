package chap04.exercises;

public class P5_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50, num2 = 100;
		
		int big, diff;
		
		big = (num1>num2) ? num1 : num2;
		System.out.println(big);
		
		diff = (num1>num2) ? num1-num2 : num2-num1;
		System.out.println(diff);
		
		//조건 연산자 대신 if-else
		
		if(num1>num2) {
			big = num1;
			System.out.println(big);
			diff = num1-num2;
			System.out.println(diff);}
		else {
			big = num2;
		    System.out.println(big);
		    diff = num2-num1;
			System.out.println(diff);
		}

	}

}
