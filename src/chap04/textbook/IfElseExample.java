package chap04.textbook;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)0.1;
		System.out.println(score);
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}

	}

}
