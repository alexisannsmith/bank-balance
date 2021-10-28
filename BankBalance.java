import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;



public class BankBalance {									// Main Frame. Displays bank balance.
	private JFrame frame = new JFrame ("Account Info");
	private JPanel getAccountBalance;	// Create panel, labels, buttons, and textfields.
	private JLabel balance;
	private JLabel showBalance;
	private JButton showBalanceButton;
	private JButton withdrawalButton;
	private JButton depositButton;
	private JTextField userInputBalance;
	private JTextField userInputWithdrawal;
	private JTextField userInputDeposit;
	double userBalance = 0;				// Initialize values for balance, withdrawal, and deposit amounts.
	double withdrawalAmount = 0;
	double depositAmount = 0;
	
	
	BankBalance() {											// Constructor
		getAccountBalance = new JPanel();					// Create new panel, buttons, labels, and textfields.
		
		showBalanceButton = new JButton("Show Balance");
		balance = new JLabel("Enter Balance");
		showBalance = new JLabel();
		userInputBalance = new JTextField(15);				// Set size for textfields.
		withdrawalButton = new JButton("Make Withdrawal");
		userInputWithdrawal = new JTextField(15);
		depositButton = new JButton("Make Deposit");
		userInputDeposit = new JTextField(15);
		
		getAccountBalance.add(balance);						// Add nodes to panel.
		getAccountBalance.add(userInputBalance);
		getAccountBalance.add(showBalanceButton);
		getAccountBalance.add(showBalance);
		getAccountBalance.add(withdrawalButton);
		getAccountBalance.add(userInputWithdrawal);
		getAccountBalance.add(depositButton);
		getAccountBalance.add(userInputDeposit);
		
	
	userInputBalance.addActionListener(new ActionListener() {		// Action listener for textfield where user inputs balance.
		public void actionPerformed(ActionEvent event)  {					// Sets the current balance to the value entered in the textfield.
			userBalance = Double.parseDouble(userInputBalance.getText());
			userInputBalance.setText(Double.toString(userBalance));
		}
		});
	
	showBalanceButton.addActionListener(new ActionListener() {		// Action listener for the "Show Balance" button.
		public void actionPerformed(ActionEvent event) {			// Displays balance entered in the textfield as a label.
			showBalance.setText("Balance: " + userInputBalance.getText());
			System.out.println(showBalance);
		}
	});
	
	userInputWithdrawal.addActionListener(new ActionListener() {	// Action listener for textfield where user enters withdrawal amount.
		public void actionPerformed(ActionEvent event) {			// Sets withdrawal amount to the value entered in the textfield.
			withdrawalAmount = Double.parseDouble(userInputWithdrawal.getText());
		}
	});
	
	withdrawalButton.addActionListener(new ActionListener() {		// Action listener for the "Make Withdrawal" button.
		public void actionPerformed(ActionEvent event) {			// Subtracts withdrawal amount from current balance and displays new balance as a label.
			userBalance = Double.parseDouble(userInputBalance.getText());
			withdrawalAmount = Double.parseDouble(userInputWithdrawal.getText());
			userBalance = userBalance - withdrawalAmount + depositAmount;
			showBalance.setText("Balance: " + Double.toString(userBalance));
			System.out.println(showBalance);
		}
	});
	
	userInputDeposit.addActionListener(new ActionListener() {		// Action listener for textfield where user enters deposit amount.
		public void actionPerformed(ActionEvent event) {			// Sets deposit amount to the value entered in the textfield.
			depositAmount = Double.parseDouble(userInputDeposit.getText());
		}
	});
	
	depositButton.addActionListener(new ActionListener() {		// Action listener for "Make Deposit" button.
		public void actionPerformed(ActionEvent event) {		// Adds deposit amount to current balance and displays new balance as a label.
			userBalance = Double.parseDouble(userInputBalance.getText());
			depositAmount = Double.parseDouble(userInputDeposit.getText());
			userBalance = userBalance + depositAmount - withdrawalAmount;
			showBalance.setText("Balance: " + Double.toString(userBalance));
			System.out.println(showBalance);
		}
	});
	
		frame.add(getAccountBalance);		// Add panel to Frame, set visible, exit on close.
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	
	public static void main(String args[]) {
		BankBalance newAccount  = new BankBalance();
	}
}
