
public class CheckingAccount extends BankAccount {		// Subclass extends BankAccount superclass.
	 
	private double interestRate;		// Initialize class members.
	private double overdraftFee;
	
	public CheckingAccount () {		// Constructor sets interest rate and overdraft fee.
		interestRate = 0.01;
		overdraftFee = 30.00;
	}

	public double processWithdrawal (double newBalance) {	// Method that processes withdrawals.
		if (newBalance < 0) {								// Will assess fee for withdrawals resulting in negative balances.
			System.out.println("An overdraft fee of $30 has been assessed.");
			newBalance -= overdraftFee;
			super.setBalance(newBalance);
			return newBalance;
		}
		else {
			super.setBalance(newBalance);
			return newBalance;
		}
	}
	
	public void displayAccount () {			// Method displays account info and interest rate.
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Account ID: " + accountID);
		System.out.println("Balance: " + balance);
		System.out.println("Your current interest rate is " + interestRate + "%.");
	}
}
