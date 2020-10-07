package com.hcl;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class JdbcExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement pst=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int eno = 0;
		String name = null,address = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcldb","root","root");
			if(con!=null)
			{
				System.out.println("Enter values");
				eno=Integer.parseInt(br.readLine());
				name=br.readLine();
				address=br.readLine();
				
				pst=con.prepareStatement("insert into emp(eno,name,address) values(?,?,?)");
				pst.setInt(1, eno);
				pst.setString(2, name);
				pst.setString(3, address);
				int i=pst.executeUpdate();
				if(i>0)
					System.out.println("Sucessfully inserted");
				else
					System.out.println("Not inserted");	
			}
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
