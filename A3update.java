
import java.sql.*;
import java.util.Scanner;
public class A3update {
	public static void main(String[] args)throws Exception
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");
	Statement st = con.createStatement();
	Scanner s= new Scanner(System.in);
	System.out.println("enter employee number");
	int empno=s.nextInt();
	int updateCount = st.executeUpdate("update employee set esal =esal+5000 where eno="+empno);
	System.out.println("records updated"+updateCount);
	st.close();
	con.close();
	}
	}

