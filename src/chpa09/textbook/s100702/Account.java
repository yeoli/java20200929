package chpa09.textbook.s100702;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientExceptions {
		if(balance < money) {
			throw new BalanceInsufficientExceptions("잔고부족: "+(money-balance)+" 모자람");
		}
		
		balance -= money;
	}
}
