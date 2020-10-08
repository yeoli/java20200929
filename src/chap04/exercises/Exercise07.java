package chap04.exercises;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("입력");
//		String line = scanner.nextLine();
//		
//		System.out.println("출력");
//		System.out.println(line);
//		
//		int num = Integer.valueOf(line); //wrapper class
//		int i = num * 2;
//		System.out.println(i);
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------");
			System.out.print("선택> ");
			
//			int s = scanner.nextInt();
//			
//			if(s == 1){
//				System.out.print("예금액> ");
//				balance += scanner.nextInt();
//			}else if(s == 2){
//				System.out.print("출금액> ");
//				balance -= scanner.nextInt();;
//			}else if(s == 3) {
//				System.out.print("잔고> ");
//				System.out.println(balance);
//			}else
//				run = false;  //이게 정석!
			
			//wrapper class : int num = Integer.valueOf(line);
			
//			String line = scanner.nextLine();
//			int num = Integer.valueOf(line);
//			
//			if(num == 1){
//				System.out.print("예금액> ");
//				balance += Integer.valueOf(scanner.nextLine());
//			}else if(num == 2){
//				System.out.print("출금액> ");
//				balance -= Integer.valueOf(scanner.nextLine());
//			}else if(num == 3) {
//				System.out.print("잔고> ");
//				System.out.println(balance);
//			}else
//				run = false;
			
			String s = scanner.nextLine();
			
			switch(s) {
			case "1":
				System.out.println("예금액> ");
				String moneyStr1 = scanner.nextLine();
				int money1 = Integer.valueOf(moneyStr1);
				balance += money1;
				break;
			case "2":
				System.out.println("출금액> ");
				String moneyStr2 = scanner.nextLine();
				int money2 = Integer.valueOf(moneyStr2);
				balance -= money2;
			case "3":
				System.out.println("잔고> " + balance);
				break;
			case "4":
				run = false;
				break;
			}
		}
		
    	System.out.println("프로그램 종료");
	}

}
