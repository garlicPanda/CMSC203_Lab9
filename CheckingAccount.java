
public class CheckingAccount extends BankAccount{
	
	private static final double FEE = 0.15;
	
	//a name and an initial amount as parameters
	/*
	 * @param name of the Account holder
	 * @param amount initial amount
	 */
	public CheckingAccount(String name, double amount) {
		super(name,amount);
		// initialize accountNumber to be the current value in 
		//accountNumber concatenated with –10
		super.setAccountNumber(super.getAccountNumber() + "-10");
	}
	
	public boolean withdraw(double amount) {
		//take the amount to withdraw, add to it the fee for check 
		//clearing, and call the withdraw method from the superclass.
		amount = amount + FEE;
		return super.withdraw(amount);
	}

}
