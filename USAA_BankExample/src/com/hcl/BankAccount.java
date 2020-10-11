package com.hcl;
import java.util.*;

public class BankAccount {
	private String name,gender,bank;
	private int age;
	private long cardNumber;
	private double creditLimit;
	private Map<String,List<BankTransaction>> transaction = new TreeMap<>();
	public BankAccount(String name, String gender, String bank, int age, long cardNumber, double creditLimit,
			Map<String, List<BankTransaction>> transaction) {
		super();
		this.name = name;
		this.gender = gender;
		this.bank = bank;
		this.age = age;
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
		this.transaction = transaction;
	}
	public BankAccount()
	{
		
	}
	public Map<String, List<BankTransaction>> getTransaction() {
		return transaction;
	}
	public void setTransaction(Map<String, List<BankTransaction>> transaction) {
		this.transaction = transaction;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double cardLimit) {
		this.creditLimit = cardLimit;
	}
	

}
