package com.hcl;

public class BankTransaction {
	private long cardNumber;
	private String transactionDate;
	private double amount;
	public BankTransaction(long cardNumber,String transactionDate, double amount) {
		super();
		this.cardNumber = cardNumber;
		this.transactionDate = transactionDate;
		this.amount = amount;
	}
	public BankTransaction()
	{
		
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
