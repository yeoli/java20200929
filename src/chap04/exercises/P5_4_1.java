package chap04.exercises;

public class P5_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 99까지의 합을 while문으로 
		int i = 1;
		int sum = 0;
		
		while(true) {
			sum += i; //99까지 더하고 if문 만나 종료
			
			if(i==99) {
				break;
			}
			i++;
		}
		
		System.out.println(sum);

	}

}
