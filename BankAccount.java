public class BankAccount {		// Superclass
	
	protected String firstName;		// Initialize class members.
	protected String lastName;
	protected int accountID;
	protected double balance;

	public BankAccount () {		// Constructor sets balance to 0.
		balance = 0;
	}
	
	public void setFirstName (String firstName) {	// Setter methods.
		this.firstName = firstName;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	public void setAccountID (int accountID) {
		this.accountID = accountID;
	}
	
	public void setBalance (double balance) {
		this.balance = balance;
	}
	
	public double Deposit (double depositAmount) {		// Deposit method returns new balance after adding deposit.
		balance += depositAmount;
		return balance;
	}
	
	public double Withdrawal (double withdrawalAmount) {	// Withdrawal method returns balance after subtracting withdrawal.
		return balance -= withdrawalAmount;
	}
	
	public String getFirstName () {		// Getter methods.
		return firstName;
	}
	
	public String getLastName () {
		return lastName;
	}
	
	public int getAccountID () {
		return accountID;
	}
	
	public double getBalance () {
		return balance;
	}
	
	public void accountSummary (String firstName, String lastName, int accountID) {		// Method that displays account summary.
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Account ID: " + accountID);
		System.out.println("Balance: " + balance);
	}
}
