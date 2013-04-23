

import java.util.Random;


public class Account {
	private String name;
	private double balance;
	private String acNum;
	private String password;
	private static int numAccount=0;
	public Account(String name) {
		this.acNum = generateAcNum();
		this.name = name;
		numAccount++;
	}
	public Account(){

		name = "";
		balance = 0;
		acNum = Account.generateAcNum();
		password = "";
			
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcNum() {
		return acNum;
	}

	public void setAcNum(String acNum) {
		this.acNum = acNum;
	}

	public static int getNumAccount() {
		return numAccount;
	}

	public static void setNumAccount(int numAccount) {
		Account.numAccount = numAccount;
	}

	private static String generateAcNum() {
		String acNumber="";
		Random r = new Random();
		acNumber = Long.toString(r.nextLong());
		return acNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public  double withdraw(double withdraw)
	{
		balance = balance - withdraw;
		return balance;
	}
	public double deposit(double deposit)
	{
		balance = balance + deposit;
		return balance;
	}
	@Override
	public String toString() {
		return "\n\n\n Account name=" + name + "\n Balance " + balance + "\n acNum " + acNum + "]";
	}
	
}