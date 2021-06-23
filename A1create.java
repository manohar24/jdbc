import java.sql.*;
import java.sql.SQLRecoverableException;
public class A1create {
public static void main(String args[]) {
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("driver loaded");

	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");
	System.out.println("connection established");
	Statement stmt=con.createStatement();
	System.out.println("statement object created");

	stmt.executeUpdate("create table emp(eno int,ename varchar2(15),esal number(10,2),eaddr varchar2(20))");
	System.out.println("table created");
	stmt.close();
	con.close();
}
catch(SQLException se){
	System.out.println("database problems"+se);
}
catch(ClassNotFoundException cnf){
System.out.println(cnf);	
}
catch(Exception e) {
	System.out.println(e);
}
}
}
