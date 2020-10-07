import java.sql.*;
public class JdbcExample {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		try {
			Driver myDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver( myDriver );
		}
		catch(Exception ex) 
		{
			System.out.println("No driver class");
			System.exit(1);
		}
		System.out.println("Driver is loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcldb","root","root");
		System.out.println("jdbc connected to mysql server");
		con.close();
		System.out.println("Connection is closed");


	}

}
