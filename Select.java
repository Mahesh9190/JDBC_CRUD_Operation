import java.sql.*;
class Select
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:postgresql://localhost:5432/demo";
		String uname = "postgres";
		String pass = "root";
		// String sql="select sname from student where sid=1"; // ->> it is for single
		// data fetching
		String sql1 = "select * from student"; // ->> it is for multiple data fetching (fetching all records.)

		// step 1 load or register driver optional step throws CNFE
		// Class.forName("org.postgresql.Driver");

		// step 2 create connection throws SQLE

		Connection con = DriverManager.getConnection(url, uname, pass);

		System.out.println("Connection Established");

		// Step 3 create statement
		Statement st = con.createStatement();

		// step 4 execute statement
		ResultSet rs = st.executeQuery(sql1);
//         rs.next();
//         String name=rs.getString("sname");
//         System.out.println("name of student is : "+name);     // --> above 3 lines for fetching single data  
		while (rs.next()) {
			System.out.print(rs.getInt(1) + " - ");
			System.out.print(rs.getString(2) + " - ");
			System.out.println(rs.getInt(3)); // --> above 4 lines for fetching all records .
		}

		// step 5 Close
		con.close();
		System.out.println("Connection Closed");
	}

}