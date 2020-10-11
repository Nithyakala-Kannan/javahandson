package com.hcl;
import java.util.*;
import java.io.*;
public class BankAccountImpl {

	public static List<BankAccount> getDetails() throws Exception 
	{
		List<BankAccount> list = new ArrayList<BankAccount>();
		try 
		{
			BankAccount bank = null;
			String line = "";
			File file = new File("C:\\java training\\work place\\USAA_BankExample\\bankAccountDetails.csv");
			BufferedReader br = new BufferedReader(new FileReader(file));
			//
			line = br.readLine();
			while (line != null) 
			{

				String[] str = line.split(",");
				if (str.length > 0)
				{
					bank = new BankAccount();
					bank.setName(str[0]);
					bank.setAge(Integer.parseInt(str[1]));
					bank.setGender(str[2]);
					bank.setBank(str[3]);
					bank.setCardNumber(Long.parseLong(str[4]));
					bank.setCreditLimit(Long.parseLong(str[5]));
					list.add(bank);

				}
				line = br.readLine();

			}
			br.close();

			for (BankAccount acc : list) 
			{
				System.out.printf("Name:%s, age:%d, Gender:%s, BankName:%s, Cardnumber:%s, CreditLimit:%d\n",
						acc.getName(), acc.getAge(), acc.getGender(), acc.getBank(), acc.getCardNumber(), acc.getCreditLimit());

			}

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		return list;
	}
}
