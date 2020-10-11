package com.hcl;
import java.util.*;
import java.io.*;
public class BankMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try 
		{
			List<BankAccount> banklist = BankAccountImpl.getDetails();
			
			List<BankTransaction> bank1 = BankTransactionImpl.getTransaction();
			
			List<BankAccount> list = ManageDetails.getAccount(banklist, bank1);
		
			System.out.println("S.No\tName\tBank\tAge\tGender\tTranscation Date\tTransaction Amount");

			for (BankAccount bank : list) 
			{

				Set<String> bankSet = bank.getTransaction().keySet();
				int start = 0,sno=1;
				for (String key : bankSet) 
				{
					
					List<BankTransaction> list1 = bank.getTransaction().get(key);
					for (BankTransaction btran : list1) 
					{
						if (start == 0)
						{
							System.out.println(sno+"\t"+ bank.getName()+"\t"+bank.getBank()+"\t"+bank.getAge()+"\t"+bank.getGender()+"\t"+btran.getTransactionDate()+"\t"+btran.getAmount());
						}
						else
						{
							System.out.println(sno+"\t"+ bank.getName()+"\t"+bank.getBank()+"\t"+bank.getAge()+"\t"+bank.getGender()+"\t"+btran.getTransactionDate()+"\t"+btran.getAmount());
							start++;
							sno++;
						}
						
					}		
					
				}

			}

		} catch (Exception e) 
		{

			e.printStackTrace();
		}

	}

	}


