// Steps
// 1 Import SQL package 	
// 2 Load driver
// 3 Create connection
// 4 Create statement
// 5 Retrieve results	
// 6 Process results	
// 7 Close connection	
package projectname;
import java.sql.*; //1
public class jdbcconnection {

	public static void main(String[] args) {
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 2
		// Check properties of your connection on SQL Dev to get the port XXXX, SID xx User yyyy and your password zzzzzz
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:XXXX:xx","yyyy","zzzzzz");// 3
		Statement st=con.createStatement(); // 4
		// Add your SQL stmt in the string
		String sql = "Select * from TableName"; // 4
		ResultSet rs=st.executeQuery(sql); // 5
		// This will print out all the data in the table in the eclipse console
		while(rs.next()) // 6
			System.out.println(rs.getString(1)+"  "+rs.getString(2));
			con.close(); // 7 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
