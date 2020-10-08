package chap04.exercises;

public class P5_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//100이하 자연수 중 2의 배수면서 7의 배수인 숫자 출력하고 그 수들의 합을 while문으로
		int i = 1;
		int sum = 0;
		
		while(i<100) {
			if((i%2==0)&&(i%7==0))
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		

	}

}
