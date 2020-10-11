package com.hcl;
import java.util.*;
import java.io.*;
public class ManageDetails
{
	
	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public static List<BankAccount> getAccount(List<BankAccount> bankList,List<BankTransaction> bankTransaction) throws Exception
	{
		System.out.println("Enter the user name to get details");
		String name = bufferedReader.readLine();
		BankAccount bankAccount = new BankAccount();
		bankAccount.setName(name);
		List<BankAccount> users = new ArrayList<>();

		for (BankAccount bank : bankList) 
		{
			if (bank.getName().equals(name))
			{
				users.add(new BankAccount(bank.getName(), bank.getGender(),bank.getBank(),bank.getAge(),
						bank.getCardNumber(),bank.getCreditLimit(),bank.getTransaction()));

			}
		}

		List<BankAccount> bankUsers = new ArrayList<>();
		for (BankAccount bank1 : users) 
		{
			
			BankAccount bank2 = getTransaction(bank1, bankTransaction);
			if (bank2 != null)
			{
				bankUsers.add(bank2);
			}
		}

		return bankUsers;
	}
	

	private static BankAccount getTransaction(BankAccount bank, List<BankTransaction> transaction)
	{
		List<BankTransaction> transactionList = new ArrayList<>();
		
		for (BankTransaction bankTransaction : transaction) 
		{
			if (bankTransaction.getCardNumber()==(bank.getCardNumber())) 
			{
				transactionList.add(bankTransaction);
			}
		}

		Map<String, List<BankTransaction>> finalList = new TreeMap<>();
		
		finalList.put(bank.getBank(), transactionList);

		return new BankAccount( bank.getName(), bank.getGender(), bank.getBank(),bank.getAge(), 
				bank.getCardNumber(), bank.getCreditLimit(),finalList);

	}


}
