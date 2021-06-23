import java.util.*;
import java.sql.*;
import java.io.*;
public class A7Updatabledemo
{
public static void main(String[] args)throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");
Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs = st.executeQuery("select * from employee");
Scanner sn= new Scanner(System.in);
//rs.moveToInsertRow();
while(true)
{
System.out.println("enter employee number");
int eno = sn.nextInt();
System.out.println("enter employee name");
sn.nextLine();
String ename = sn.nextLine();
System.out.println("enter employee salary");
float esal = sn.nextFloat();
System.out.println("enter employee address");
sn.nextLine();
String eaddr = sn.nextLine();
rs.updateInt(1,eno);
rs.updateString(2,ename);
rs.updateFloat(3,esal);
rs.updateString(4,eaddr);
rs.insertRow();
System.out.println("record successfully inserted");
System.out.println("one more record[y/n]");
String option = sn.next();
if(option.equals("n"))
break;
}}}