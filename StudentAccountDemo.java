
public class StudentAccountDemo {

	public static void main(String[] args) {

		StudentAccount s1 = new StudentAccount();
		StudentAccount s2 = new StudentAccount(1460.0);
		StudentAccount s3 = new RewardsAccount();
		StudentAccount s4 = new RewardsAccount(3000);
		RewardsAccount s5 = new RewardsAccount();
		RewardsAccount s6 = new RewardsAccount(6000);

		System.out.println("***** Student Account Testing *****\n");

		// Test getAcctNo and getBalance.
		System.out.println("S1's account number is: " + s1.getAcctNo());
		System.out.println("S1's initial account balance is: " + s1.getBalance());
		System.out.println();

		// Test setBalance method for a StudentAccount.
		s1.setBalance(465.00);
		System.out.println("S1's set balance is: " + s1.getBalance() + "\n");

		// Test deposit method for a StudentAccount with a negative value.
		s1.deposit(-1000.0);
		System.out.println("S1's account after a negative deposit is: \n" + s1.toString() + "\n");

		// Test deposit method for a StudentAccount.
		s1.deposit(1000.0);
		System.out.println("S1's account after a $1000 deposit is: \n" + s1.toString());

		// Test charge method for a negative value for the StudentAccount.
		s1.charge(-500.0);
		System.out.println("S1's account after a negative charge is: \n" + s1.toString() + "\n");

		// Test charge method for a positive value for StudentAccount.
		s1.charge(500.0);
		System.out.println("S1's account after a $500 charge is: \n" + s1.toString());
		System.out.println();

		System.out.println("S2's account information is: \n" + s2.toString());

		// Test a negative value for the deposit method for StudentAccount.
		s2.deposit(-500);
		System.out.println("S2's account after a negative deposit: \n" + s2.toString());

		// Test a positive value for deposit method for StudentAccount.
		s2.deposit(900.0);
		System.out.println("S2's account after a $900 deposit is: \n" + s2.toString());

		// Test a negative value for the charge method for StudentAccount.
		s2.charge(-1000);
		System.out.println("S2's account after a negative charge: \n" + s2.toString());

		// Test a positive value for the charge value for StudentAccount.
		s2.charge(875.0);
		System.out.println("S2's account after a $1500 charge is: \n" + s2.toString() + "\n");

		// Test positive value for transferOut method for s1 to s2 for StudentAccounts
		s1.transferOut(s2, 240.0);

		System.out.println("S1's account after transferring $240 to S2: \n" + s1.toString());
		System.out.println("S2's account  after s1's transfer: \n" + s2.toString());
		System.out.println();

		// Test positive value for transferIn method for s1 to s2.
		s1.transferIn(s2, 500.0);

		System.out.println("S1's account balance after $500 the transferIn : \n" + s1.toString());
		System.out.println("S2's account balance after the $500 transferIn from s1: \n" + s2.toString());

		// Test negative transferIn value for a StudentAccount.
		s2.transferIn(s1, -1000);
		System.out.println("S2's account after a negative transferIn attempt: \n" + s2.toString());

		// Test negative transferOut value for a StudentAccount.
		s2.transferOut(s1, -300);
		System.out.println("S2's account after a negative transferOut attempt: \n" + s2.toString());

		System.out.println("***** Student Rewards Account Testing *****\n");

		System.out.println("S3's student reward account information: ");

		// Test getAcctNo and getBalance for Student RewardAccount.
		System.out.println("Account Number: " + s3.getAcctNo());
		System.out.println("Account Balance: " + s3.getBalance() + "\n");

		// Test set & get method for a Student RewardsAccount.
		s3.setBalance(1500);
		System.out.println("S3's set balance is: " + s3.getBalance() + "\n");

		// Test negative value for deposit method for a Student RewardsAccount.
		s3.deposit(-2000);
		System.out.println("S3's account after a negative value deposit: \n" + s3.toString() + "\n");

		// Test Student RewardsAccount for a deposit under $100.
		s3.deposit(50);
		System.out.println("S3's account after a deposit less than $100: \n" + s3.toString() + "\n");

		// Test deposit method for a value greater than $100 for a Student
		// RewardsAccount.
		s3.deposit(1500);
		System.out.println("S3's account after the $1500 deposit is: \n" + s3.toString() + "\n");

		// Test negative value for charge value for a Student RewardsAccount.
		s3.charge(-1690);
		System.out.println("S3's account after a negative value charge: \n" + s3.toString() + "\n");

		// Test positive value for charge method for Student RewardsAccount.
		s3.charge(500);
		System.out.println("S3's account after a $500 charge is: \n" + s3.toString() + "\n");

		System.out.println("S4's account is: \n" + s4.toString() + "\n");

		// Test depositing less than $100 into a Student RewardsAccount.
		s4.deposit(50);
		System.out.println("S4's account after depositing less than $100: \n" + s4.toString() + "\n");

		// Type cast to allow for redeemRewards. Test for redeeming a reward amount
		// under $25.
		((RewardsAccount) s4).redeemRewards();
		System.out.println("S4's account after attempting to redeem rewards less than $25: \n" + s4.toString() + "\n");

		// Multiple deposits >$100 meant to increase the rewards value.
		s4.deposit(100);
		s4.deposit(500);
		s4.deposit(1078);
		s4.deposit(1822);

		System.out.println("S4's account after four deposits greater than or equal to $100: \n" + s4.toString() + "\n");

		// Type cast for StudentAccount s4 to allow the object to use method from the
		// RewardsAccount class.
		((RewardsAccount) s4).redeemRewards();
		System.out.println("S4's account after redeeming their rewards: \n" + s4.toString() + "\n");

		// Test negative value for transferIn method for a Student RewardsAccount.
		s3.transferIn(s4, -5042);
		System.out.println("S3's account after a negative transfer value: \n" + s3.toString() + "\n");
		System.out.println("S4's account after a negative transfer value from S3: \n" + s4.toString() + "\n");

		// Test positive value for transferIn method for Student RewardsAccount.
		s3.transferIn(s4, 3000);

		System.out.println("S3's account after the $3000 transferIn method: \n" + s3.toString() + "\n");

		System.out.println("S4's account after the $3000 transferIn method from S3: \n" + s4.toString() + "\n");

		// Test negative value for transferOut method for a Student RewardsAccount.
		s3.transferOut(s4, -1020);
		System.out.println("S3's account after a negative transferOut value to S4: \n" + s3.toString() + "\n");
		System.out.println("S4's account after a negative transferOut value from S3: \n" + s4.toString() + "\n");

		// Test positive value for transferOut method for a Student RewardsAccount.
		s3.transferOut(s4, 1500);
		System.out.println("S3's account after the $1500 transferOut method: \n" + s3.toString() + "\n");

		System.out.println("S4's account after the $1500 transferOut method from S3: \n" + s4.toString() + "\n");

		System.out.println("***** Rewards Account Testing *****\n");

		// Test getBalance for a RewardsAccount.
		System.out.println("S5's account balance: " + s5.getBalance());
		System.out.println("S5's account number is: " + s5.getAcctNo() + "\n");

		// Test setBalance for a RewardsAccount.
		s5.setBalance(2978);
		System.out.println("S5's set balance is: " + s5.getBalance() + "\n");

		// Test negative value for deposit method for a RewardsAccount.
		s5.deposit(-1542);
		System.out.println("S5's account after a negative value deposit: \n" + s5.toString() + "\n");

		// Test positive value for deposit method for a RewardsAccount.
		s5.deposit(1542);
		System.out.println("S5's account after a $1542 deposit: \n" + s5.toString() + "\n");

		// Test negative value for charge method for a RewardsAccount.
		s5.charge(-1600);
		System.out.println("S5's account after a negative value charge: \n" + s5.toString() + "\n");

		// Test positive value for charge method for a RewardsAccount.
		s5.charge(1600);
		System.out.println("S5's account after a charge: \n" + s5.toString() + "\n");

		System.out.println("S6's account information: \n\n" + s6.toString() + "\n");

		// Test redeemRewards for a value under 25.
		s6.redeemRewards();
		System.out.println("S6's account after attempting to deposit rewards under $25: \n" + s6.toString());

		// Test deposit method for a value under 100.
		s6.deposit(50);
		System.out.println("S6's account after a $50 deposit: \n" + s6.toString() + "\n");

		// Multiple deposits greater than $100 in order to increase the rewards amount.
		s6.deposit(100);
		s6.deposit(332);
		s6.deposit(547);
		s6.deposit(789);

		System.out.println(
				"S6's account after four more deposits, each greater than or equal to $100: \n" + s6.toString() + "\n");

		// Test redeemRewards for a RewardsAccount.
		s6.redeemRewards();
		System.out.println("S6's account after redeeming their rewards: \n" + s6.toString() + "\n");

		// Test transferIn with a negative value for a RewardsAccount
		s6.transferIn(s5, -3000);
		System.out.println("S6's account after the negative value transferIn: \n" + s6.toString() + "\n");
		System.out.println("S5's account after the negative value transferIn: \n" + s5.toString() + "\n");

		// Test transferIn with a positive value for a RewardsAccount.
		s6.transferIn(s5, 3000);
		System.out.println("S6's account after the transferIn method: \n" + s6.toString() + "\n");
		System.out.println("S5's account after the transferIn method: \n" + s5.toString() + "\n");

		// Test transferOut with a negative value for a RewardsAccount.
		s6.transferOut(s5, -4000);
		System.out.println("S6's account after the negative transferOut method: \n" + s6.toString());
		System.out.println("S5's account after the negative transferOut method: \n" + s5.toString());

		// Test transferOut with a positive value for a RewardsAccount.
		s6.transferOut(s5, 4000);
		System.out.println("S6's account after the transferOut method: \n" + s6.toString() + "\n");
		System.out.println("S5's account after the transferOut method: \n" + s5.toString() + "\n");

		// Test for the getCounter method.
		System.out.println("The number of accounts created are: " + StudentAccount.getCounter() + "\n");

		// Tests the toString method.
		System.out.println("*****toString method tests*****\n");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s5.toString());
		System.out.println(s6.toString());

		// Tests the printInfo method.
		System.out.println("***** printInfo method tests *****\n");
		s1.printInfo();
		System.out.println();
		s2.printInfo();
		System.out.println();
		s3.printInfo();
		s4.printInfo();
		s5.printInfo();
		s6.printInfo();

		System.out.println("***** compareTo method tests *****\n");

		// Prints the rules for the user to understand.
		System.out.println("If the value is 1, the current object is greater than the parameter Object");
		System.out.println("If the value is 0, that means the values are equal");
		System.out.println("If the value is -1, the current object is less than the parameter Object.\n");

		// Tests the compareTo method.
		System.out.println("S1 and S2's balances: " + s1.compareTo(s2));
		System.out.println("S1 and S3's balances: " + s1.compareTo(s3));
		System.out.println("S3 and S2's balances: " + s3.compareTo(s2));
		System.out.println("S4 and S3's balances: " + s4.compareTo(s3));
		System.out.println("S5 and S6's balances: " + s5.compareTo(s6) + "\n");

	}
}
