package chap06.textbook.exercises.p20_2;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	static int count = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3. 예금 | 4.출금 | 5.종료");
			System.out.println("------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			case 1 :
				createAccount();
				break;
			case 2 :
				accountList();
				break;
			case 3 :
				deposit();
				break;
			case 4 :
				withdraw();
				break;
			case 5 :
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		System.out.println("--------------------");
		System.out.println("계좌생성");
		System.out.println("--------------------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("계좌주 : ");
		String owner = sc.next();
		System.out.print("초기입금액 : ");
		int balance = sc.nextInt();
		
		Account ac = new Account(ano, owner, balance);
		
		accountArray[count] = ac;
		count ++;
		
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	
	private static void accountList() {
		System.out.println("--------------------");
		System.out.println("계좌생성");
		System.out.println("--------------------");
		
		for(int i=0; i<count; i++) {
			System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}
	
	private static void deposit() {
		System.out.println("--------------------");
		System.out.println("예금");
		System.out.println("--------------------");
		
		System.out.println("계좌번호: ");
		String ano = sc.next();
		System.out.println("예금액");
		int balance = sc.nextInt();
		
		int sum = findAccount(ano).getBalance() + balance;
		findAccount(ano).setBalance(sum);
		
		System.out.println("결과 : 예금이 성공되었습니다.");
	
	}
	
	private static void withdraw() {
		System.out.println("--------------------");
		System.out.println("출금");
		System.out.println("--------------------");
		
		System.out.println("계좌번호: ");
		String ano = sc.next();
		System.out.println("출금액");
		int balance = sc.nextInt();
		
		int sum = findAccount(ano).getBalance() - balance;
		findAccount(ano).setBalance(sum);
		
		System.out.println("결과 : 출금이 성공되었습니다.");
		
	}
	
	private static Account findAccount(String ano) {
		for(int i=0; i<count; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
	
}
