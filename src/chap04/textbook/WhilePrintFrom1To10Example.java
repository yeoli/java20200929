package chap04.textbook;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n");
		
		//11~20
		i = 11;
		while(i<=20) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n");
		
		//10~1
		int i2 = 10;
		while(i2>0) {
			System.out.println(i2);
			i2--;
		}
		
		System.out.println("\n");
		
		//1~9 홀수만
		int i1 = 1;
		while(i1<=10) {
			if(i1%2==1)
			System.out.println(i1);
			i1++;
		}
		
		System.out.println("\n");
		
		//10~2 짝수만
		int i3 = 10;
		while(i3>=2) {
			System.out.println(i3);
			i3-=2;
		}
		
		

	}

}
