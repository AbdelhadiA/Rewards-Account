public class StudentAccount implements Comparable<StudentAccount> {

	private long acctNo;
	private double balance;
	static private long counter = 1;

	/**
	 * This constructor initializes the balance with 0, initiliazes the acctNo with
	 * the current value of the counter, and then increments the counter.
	 *
	 */
	public StudentAccount() {
		balance = 0;
		this.acctNo = counter;
		counter++;
	}

	/**
	 * This constructor intializes the balance with the value passed into the
	 * parameter, initializes the acctNo with the current value of the counter, and
	 * then increments the counter.
	 * 
	 * @param balance : The "balance" parameter, of type double, is used to
	 *                initialize the "this" balance with the value passed in the
	 *                method.
	 */
	public StudentAccount(double balance) {
		this.balance = balance;

		acctNo = counter;
		counter++;
	}

	/**
	 * Method is used to get the acctNo.
	 * 
	 * @return : This method returns the value of the acctNo.
	 */
	public long getAcctNo() {
		return acctNo;
	}

	/**
	 * Method is used to get the balance value of an object.
	 * 
	 * @return : This method returns the value of the balance for an account.
	 */
	public double getBalance() {
		return this.balance;
	}

	/**
	 * This method is used to get the total nubmer of accounts created.
	 * 
	 * @return : Returns the value of the counter, which represents the number of
	 *         accounts generated.
	 */
	public static long getCounter() {
		return counter - 1;
	}

	/**
	 * Method sets the balance variable with the parameter value.
	 * 
	 * @param balance : This method has a parameter "balance" of type double, and is
	 *                used to set the value of the "this" balance with the value
	 *                passed through the parameter.
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Deposit method uses a parameter, and adds the value passed through the
	 * parameter with the current balance of the object. If the number is negative,
	 * it prints an error message.
	 * 
	 * @param amount : The amount value, of type double, is added to the current
	 *               object's balance if positive. Otherwise, it does not add to the
	 *               value.
	 */
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("ERROR: Amount must be a positive number");
		}

		else {
			this.balance = this.balance + amount;
		}
	}

	/**
	 * Charge method takes in a parameter and subtracts the current's object's
	 * balance by the value passed as a parameter. If the value passed is a negative
	 * amount, a error message is printed.
	 * 
	 * @param amount : The amount value, of type double, gets the current object's
	 *               balance and takes away however much the balance is. If it is a
	 *               negative value, it does not do anything.
	 */
	public void charge(double amount) {
		if (amount < 0) {
			System.out.println("ERROR: Amount must be a positive number");
		}

		else {
			this.balance = this.balance - amount;
		}
	}

	/**
	 * transferIn method takes another student account and transfers an amount from
	 * that account into the current objects balance. The parameters account loses
	 * some value while the current account gains value. If the value is negative, a
	 * error message is printed to the screen.
	 * 
	 * @param acct   : This paramter, of type StudentAccount, takes an account in
	 *               for the value to be transferred from.
	 * @param amount : This parameter, of type double, determines the amount that
	 *               will be subtracted from the parameters account and added to the
	 *               current account.
	 */
	public void transferIn(StudentAccount acct, double amount) {

		if (amount < 0) {
			System.out.println("ERROR: Amount must be a positive number");

		}

		else {
			acct.balance = acct.balance - amount;
			this.balance = this.balance + amount;
		}

	}

	/**
	 * transferOut takes another account and adds an amount to that account while
	 * subtracting that same amount by the current account. If the value is
	 * negative, an error message is printed to the screen.
	 * 
	 * @param acct   : This parameter, of type StudentAccount, determines the
	 *               destination of where the amount will be added to.
	 * @param amount : This parameter, of type double, takes a value and adds it to
	 *               the destination account while subtracting the amount from the
	 *               current account.
	 */
	public void transferOut(StudentAccount acct, double amount) {
		if (amount < 0) {
			System.out.println("ERROR: Amount must be a positive number");

		}

		else {
			this.balance = this.balance - amount;
			acct.balance = acct.balance + amount;
		}
	}

	/**
	 * This method prints the account information with the account number first and
	 * the current balance after.
	 */
	public void printInfo() {
		System.out.println("Account number: " + this.acctNo);
		System.out.println("Current balance: " + this.balance);

	}

	/**
	 * Method prints the String version of the account number followed by the
	 * current balance.
	 */
	@Override
	public String toString() {

		return "Account number: " + this.acctNo + "\n" + "Current balance: " + this.balance + "\n";

	}

	/**
	 * The compareTo method takes a StudentAccount as a parameter and compares the
	 * balance between the current object and the object passed as a parameter. If
	 * the current object is greater than the object, the program returns a 1. If it
	 * is equal, it returns 0. Otherwise, it returns -1.
	 */
	public int compareTo(StudentAccount x) {

		if (this.balance > x.balance) {
			return 1;
		} else if (this.balance == x.balance) {
			return 0;
		} else {
			return -1;
		}

	}
}
