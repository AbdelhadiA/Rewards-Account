public class RewardsAccount extends StudentAccount {

	private double rewards;

	/**
	 * This constructor calls super, to use the constructor from the StudentAccount
	 * class, and initializes rewards with 0.
	 */
	public RewardsAccount() {
		super();
		rewards = 0;
	}

	/**
	 * This constructor calls super, and passes the parameter value to it to
	 * initialize balance with the amount passed. If the initial value of x is
	 * greater than 100, 5 is added to the rewards.
	 * 
	 * @param x : This parameter, of type double, is used to initialize the balance
	 *          from super() with the amount passed through the method.
	 */
	public RewardsAccount(double x) {
		super(x);

		if (x >= 100) {
			rewards += 5;
		}
	}

	/**
	 * This method gets the rewards variable amount.
	 * 
	 * @return : The rewards variable value is returned.
	 */
	public double getRewards() {

		return rewards;
	}

	/**
	 * This method deposits 25 to the current account and resets rewards to 0 if the
	 * rewards amount is greater than or equal to 25. Else, it prints "Insufficient
	 * amount."
	 */
	public void redeemRewards() {

		if (rewards >= 25) {
			deposit(rewards);
			rewards = 0;
		}

		else {
			System.out.println("Insufficient amount");
		}
	}

	/**
	 * This method overrides the toString method from prints the super() toString
	 * followed by the rewards balance. If the value is greater than or equal to 25,
	 * a congratulations message is printed.
	 */
	@Override
	public String toString() {
		if (rewards >= 25)
			return super.toString() + "Rewards balance: " + rewards + "\n" + "\n"
					+ "Congratulations! You can redeem your rewards";
		else {
			return super.toString() + "Rewards balance: " + rewards + "\n";
		}

	}

	/**
	 * This method overrides the StudentAccount deposit method by calling the
	 * super() deposit and if the value being deposited is greater than or equal to
	 * 100, 5 is added to the rewards.
	 */
	@Override
	public void deposit(double amount) {
		super.deposit(amount);
		if (amount >= 100) {
			rewards += 5;
		}

	}

	/**
	 * This message calls the super() printInfo and then adds a print statement
	 * printing the rewards balance.
	 */
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Rewards balance: " + rewards);
		System.out.println();
	}

}
