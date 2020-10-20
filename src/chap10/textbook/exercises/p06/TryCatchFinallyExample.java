package chap10.textbook.exercises.p06;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = {"10,", "20"};
		int value = 0;
		for(int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch(Error e) {
				System.out.println("숫자로 변환할 수 없음");
			} finally {
				System.out.println(value);
			}
		}
	}
}
