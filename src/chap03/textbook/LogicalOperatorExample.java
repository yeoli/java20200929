package chap03.textbook;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';
		
		if((charCode>= 65) & (charCode<=90)) {
			System.out.println("대문자 이군요");
		}
		
		if(!(charCode<= 48) && !(charCode>57)) {
			System.out.println("0~9숫자 이군요");
		}
		
		int value = 6;
		
		if((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		if((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수 이군요");
		}
	}

}
