package chap04.exercises;

public class P5_6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 모든 홀수와 3의 배수인 짝수를 더하고 언제 합이 1000을 넘는지 1000을 넘는 값은 얼마가 되는지
		
		int i = 1;
		int sum = 0;
		
		while(true) {
			
			if((i%2==1)||(i%3==0 && i%2==0)) {
			sum += i;
			}
	
	        if(sum>1000) {
			    System.out.println(i);
				System.out.println(sum);
			    break;
		        }
	        
	    	i++;
		     }
		
//		int sum = 0, num = 1;
//		
//		while(true) {
//			if(num%2 != 0) {
//				sum += num;
//			}
//			else {
//				if(num%3==0)
//				sum += num;
//			}
//			if(sum>1000) {
//				System.out.println(num);
//				System.out.println(sum);
//				break;
//			}
//			num++;
//		    }

	      }
       }
