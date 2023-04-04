package LabWork4;

public class Account {
	private double balance;
	private String owner;

//Constructor
	public Account(String name) {
		balance = 0;
		owner = name;
	}

// Deposits amount into the account

	public void deposit(int amount) {
		balance = balance + amount;
	}

// Withdraws 'amount' from the account.

	public void withdraw(int amount) {
		if (amount <= balance) {
			balance = balance - amount;
		}
	}

// Returns the balance of the Account

	public double getBalance() {
		return balance;
	}

// Returns the owner of the Account

	public String getOwner() {
		return owner;
	}
}
