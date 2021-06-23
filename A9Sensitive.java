import java.sql.*;
public class A9Sensitive
{
public static void main(String[] args)throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");
Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
ResultSet rs = st.executeQuery("select * from employee");
rs.next();
System.out.println("old salary o f the employee"+rs.getFloat(3));
System.in.read();
//application is in pause, perform database updations
rs.refreshRow();
System.out.println("new salary of the employee"+rs.getFloat(3));
}
}