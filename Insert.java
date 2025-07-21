import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert
{
	// This code is for insert operartion .
	public static void main(String[] args) throws SQLException
	{
		 String url="jdbc:postgresql://localhost:5432/demo";
		 String uname="postgres";
		 String pass="root";
		 
		 String sql="insert into student values(5,'john',48)"; //->> this is for inserting data
		 
		 Connection con=DriverManager.getConnection( url,uname,pass);
		 
		 System.out.println("Connection Established");
		 
		 Statement st=con.createStatement();
		 
		 boolean status = st.execute(sql);
		 System.out.println(status);
		 
		 con.close();
		 System.out.println("connection closed ");
		 
		
	}

}
