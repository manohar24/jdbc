import java.sql.*;
import java.io.*;
import java.util.*;
public class B2PSDemo
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:orcl","system","system");
PreparedStatement pst=con.prepareStatement("insert into Employee(eno,ename,esal,eaddr)values(?,?,?,?)");
Scanner sn= new Scanner(System.in);
System.out.print("Employee ID No:");
int no = sn.nextInt();
System.out.print("Employee name:");
sn.nextLine();
String name = sn.nextLine();
System.out.print("Employee Salary:");
double sal = sn.nextDouble();
System.out.print("Employee addr:");
sn.nextLine();
String address =sn.nextLine();
pst.setInt(1,no);
pst.setString(2,name);
pst.setDouble(3,sal) ;
pst.setString(4,address) ;
pst.executeUpdate();
pst.close();
con.close();
}
catch(ClassNotFoundException e)
{
System.out.println(e);
}
catch(SQLException e)
{
System.out.println(e);
}
catch(Exception e)
{
System.out.println(e);
}
}}