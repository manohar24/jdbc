
import java.sql.*;

import java.util.*;
public class A6Retrieve
{
public static void main(String args[]) throws ClassNotFoundException,Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("driver loaded");

	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","system");
	System.out.println("connection established");
	Statement stmt=con.createStatement();
	System.out.println("statement object created");

ResultSet res = stmt.executeQuery("select * from emp");
while(res.next())
{
	System.out.println(res.getInt("eno")+"\t" + res.getString("ename") + "\t" + res.getInt("esal")+"\t"+res.getString("eaddr"));
}
res.close();
stmt.close();
con.close();
}
}
