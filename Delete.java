import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation
{   
	public static void main(String[] args) throws SQLException
	{
		 String url="jdbc:postgresql://localhost:5432/demo";
		 String uname="postgres";
		 String pass="root";
		 
		 String sql="delete from student where sid=5"; //->> this is for deleting data
		 
		 Connection con=DriverManager.getConnection( url,uname,pass);
		 
		 System.out.println("Connection Established");
		 
		 Statement st=con.createStatement();
		 
		 st.execute(sql);
		
		 
		 con.close();
		 System.out.println("connection closed ");
		 
		
	}


	
}