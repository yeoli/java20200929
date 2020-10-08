package chap04.exercises;

public class P5_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지 출력하고 다시 거꾸로 100부터 1까지 출력 while문과 do-while문으로 각각 사용해서 구현
		int i = 1;
		
		while(true) {
			System.out.println(i);
			
			if(i==100)
				break;
			
			i++;
		}
		
		System.out.println("==============");
		
		i = 100;
		
		while(true) {
			System.out.println(i);
			
			if(i==0)
				break;
			
			i--;
		}
		
		System.out.println("==============");
		
		i = 1;
		
		do{
			System.out.println(i);
			i++;
			
		}while(i<=100);
		
		System.out.println("==============");
		
		i = 100;
		
		do {
			System.out.println(i);
			i--;
			
		}while(i>0);
		
		i = 1;
		
		while(i<=100) {
			System.out.println(i++);
		}
		
		--i;
		
		do {
			System.out.println(--i);
		}while(i>1);

	}

}
