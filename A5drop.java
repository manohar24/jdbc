
import java.sql.*;
import java.util.*;
import java.sql.SQLSyntaxErrorException;
public class A5drop {
public static void main(String args[]) {
	Connection con = null;
	   Statement st = null;
	try{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");
		 st=con.createStatement();
		System.out.println("Connected database successfully...");
	      System.out.println("Deleting table in given database...");
	      st = con.createStatement();
	      String sql = "DROP TABLE emp";
	      st.executeUpdate(sql);
	      System.out.println("Table  deleted in given database...");
	   }catch(SQLException se){
	      se.printStackTrace();
	   }catch(Exception e){
	      e.printStackTrace();
	   }finally{
	     
	      try{
	         if(st!=null)
	            con.close();
	      }catch(SQLException se){
	      }
	      try{
	         if(con!=null)
	            con.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }
	   }
	   System.out.println("Goodbye!");
	}

}
