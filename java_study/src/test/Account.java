package test;

public class Account {
	int Balance = 0;
	int MIN_BALANCE = 0;
	int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return Balance; 
	}
	
	public void setBalance(int Balance) {
		if (Balance > MIN_BALANCE && Balance < MAX_BALANCE) {		
			this.Balance = Balance; 
		}
	}
}


