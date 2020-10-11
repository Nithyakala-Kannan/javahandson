package com.hcl;
import java.util.*;
import java.io.*;
public class BankTransactionImpl 
{
	private static List<BankTransaction> bankTransaction = new ArrayList<BankTransaction>();

	public static List<BankTransaction> getTransaction() throws Exception 
	{
		try 
		{
			BankTransaction bank = null;
			String line = "";
			File file = new File("C:\\java training\\work place\\USAA_BankExample\\bankTransaction.csv");
			//@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(file));
			br.readLine();
			line=br.readLine();
			while (line != null) 
			{

				String[] str = line.split(",");
				if (str.length > 0) 
				{
					bank = new BankTransaction();
					bank.setCardNumber(Long.parseLong(str[0]));
					bank.setTransactionDate(str[1]);
					bank.setAmount(Long.parseLong(str[2]));
					bankTransaction.add(bank);
				}
				
			}
			for (BankTransaction acc : bankTransaction)
			{

				System.out.printf("CardNumber:%s , Transactiondate:%s  ,Amount:%d\n", acc.getCardNumber(),
						acc.getTransactionDate(), acc.getAmount());

			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return bankTransaction;
	}

}
