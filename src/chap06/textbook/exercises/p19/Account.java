package chap06.textbook.exercises.p19;

public class Account {

	private int balance;

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		if(balance >=0 && balance <= 1000000)
		this.balance = balance;

	}
	
	
}
