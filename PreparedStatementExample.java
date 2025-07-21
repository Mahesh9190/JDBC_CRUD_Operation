import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {
	public static void main(String[] args) throws SQLException {
		int sid = 102;
		String sname = "john";
		int marks = 58;

		String url = "jdbc:postgresql://localhost:5432/demo";
		String uname = "postgres";
		String pass = "root";
		String sql = "insert into student values(?,?,?)"; // here instead of values we have put question marks..

		Connection con = DriverManager.getConnection(url, uname, pass);

		PreparedStatement st = con.prepareStatement(sql); // here instead of statement we have to use PreparedStatement
															// PreparedStetement and prepareStatement

		st.setInt(1, sid); // setInt(int parameterindex, int x)throws SQLException
		st.setString(2, sname); // setString(int parameterindex,Stirng x)throws SQLException
		st.setInt(3, marks);

		st.execute();

		con.close();

	}

}