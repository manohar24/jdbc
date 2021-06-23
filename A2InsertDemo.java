import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class A2InsertDemo {
	public static void main(String args[]) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");

			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");
			System.out.println("connection established");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into emp values(101,'ram',9899.56,'koti')");
			stmt.executeUpdate("insert into emp values(102,'nikhil',9999.99,'hyderabad')");
			stmt.executeUpdate("insert into emp values(103,'venkat',7777.77,'uppal')");
			stmt.executeUpdate("insert into emp values(104,'nani',10000.77,'lbnagar')");
			stmt.executeUpdate("insert into emp values(105,'manohar',23066.90,'karmanghat')");
			System.out.println("Records inserted");
			stmt.close();
			con.close();
	        }
		catch(SQLException se) {
			System.out.println(se);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
