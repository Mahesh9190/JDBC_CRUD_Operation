import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update
{
	public static void main(String[] args) throws SQLException
	{
		 String url="jdbc:postgresql://localhost:5432/demo";
		 String uname="postgres";
		 String pass="root";
		 
		 String sql="update student set sname='Jack' where sid=2"; //->> this is for updating data
		 
		 Connection con=DriverManager.getConnection( url,uname,pass);
		 
		 System.out.println("Connection Established");
		 
		 Statement st=con.createStatement();
		 
		 st.execute(sql);
		
		 
		 con.close();
		 System.out.println("connection closed ");
		 
		
	}

}