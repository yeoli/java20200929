package chap03.binary;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//논리연산자
		//&& & and
		//|| | or
		// ^ xor exclusive or : 같을 때 False

		System.out.println("=========and========");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
	
		System.out.println("=========or========");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("=========xor========");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("==========& | =========");
		int a = 3;
		System.out.println(false & false);
		System.out.println(false & true);
		System.out.println((a < 0) & (a++ < 0));
		System.out.println(a);
		
		System.out.println("=========&& ||=========");
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println((a < 0) && (a++ < 0));
		System.out.println(a);

	}

}
