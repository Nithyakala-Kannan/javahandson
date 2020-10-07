import java.sql.*;
public class JdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
	    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcldb","root","root");
		if(con!=null)
		{
			st=con.createStatement();
			rs=st.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			
		    }
			st.close();
			con.close();
         }
}
}