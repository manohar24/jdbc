
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class A4delete {
public static void main(String args[])throws Exception {
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");
Statement st=con.createStatement();
int updateCount=st.executeUpdate("delete from employee where esal<=5000");
System.out.println("records deleted--"+updateCount);
st.close();
con.close();
}
}
