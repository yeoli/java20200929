package chap06.textbook.exercises.p20_1;

import java.util.Scanner;

public class BankApplication {
		private static Account[] accountArray = new Account[100];
		private static Scanner sc = new Scanner(System.in);
		static int size = 0;
	
		public static void main(String[] args) {
			boolean run = true;
			while(run) {
				System.out.println("====================");
				System.out.println("1.계좌생성 | 2. 계좌목록 | 3.예금 | 4. 출금 | 5. 종료");
				System.out.println("====================");
				System.out.println("선택> ");
				
				int selectNo = sc.nextInt();
				
				switch(selectNo){
					case 1 : 
						createAccount();
						break;
					case 2:
						accountList();
						break;
					case 3:
						deposit();
						break;
					case 4:
						withdraw();
						break;
					case 5:
						run = false;
						break;
											
				}
				
				System.out.println("프로그램 종료");
			}
		}

		private static void withdraw() {
			// TODO Auto-generated method stub
			System.out.println("==============");
			System.out.println("출금");
			System.out.println("==============");
			
			System.out.println("계좌번호: ");
			String ano = sc.next();
			System.out.println("출금액: ");
			int balance = sc.nextInt();
			
			int sum = findAccount(ano).getBalance() - balance;
			findAccount(ano).setBalance(sum);
			
			System.out.println("출금이 성공되었습니다.");
			
		}

		private static void deposit() {
			// TODO Auto-generated method stub
			System.out.println("==============");
			System.out.println("예금");
			System.out.println("==============");
			
			System.out.println("계좌번호: ");
			String ano = sc.next();
			System.out.println("출금액: ");
			int balance = sc.nextInt();
			
			int sum = findAccount(ano).getBalance() + balance;
			findAccount(ano).setBalance(sum);	
			
			System.out.println("예금이 성공되었습니다.");
		}

		private static void accountList() {
			// TODO Auto-generated method stub
			for(int i=0; i<size; i++) {
				System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
			}
			
		}

		private static void createAccount() {
			// TODO Auto-generated method stub
			
			System.out.println("==============");
			System.out.println("계좌생성");
			System.out.println("==============");
			
			System.out.print("계좌번호: ");
			String ano = sc.next();
			System.out.print("계좌주: ");
			String owner = sc.next();
			System.out.println("초기입금액: ");
			int balance = sc.nextInt();
			
			Account my = new Account(ano, owner, balance);
			
			accountArray[size] = my;
			size++;
			
		}
		
		private static Account findAccount(String ano) {
			for(int i=0; i<size; i++) {
				if(accountArray[i].getAno().equals(ano)) {
					return accountArray[i];
				}
			}
			return null;
		}
}
