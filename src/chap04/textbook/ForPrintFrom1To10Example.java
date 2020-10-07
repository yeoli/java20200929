package chap04.textbook;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		//11~20
		for(int i = 11; i<=20; i++) {
			System.out.println(i);
		}
		System.out.println("\n");
		
		//1~9 홀수만
		for(int i=1; i<=10; i++) {
			if(i%2==1)
			System.out.println(i);
		}
		System.out.println("\n");
		
		//10~1
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		System.out.println("\n");
		
		//10~2 짝수만
		for(int i=10; i>=1; i--) {
			if(i%2==0)
			System.out.println(i);
		}
		
		//10~2 짝수만 (선생님)
		for(int i=10; i>=1; i-=2) {
			System.out.println(i);
		}

	}

}
