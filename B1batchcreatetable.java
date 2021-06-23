import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
 
public class B1batchcreatetable {
	public static void main(String[] args) {
	    try{
	        Connection connection = null;
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","system");
	    	System.out.println("connection established");
	          
	        try{            
	        // Create statement object  
	          Statement stmt = connection.createStatement();            
	        // Set auto-commit to false
	        connection.setAutoCommit(false);
	        // create database query 
	        String createtablequery = "CREATE TABLE nani(eno number,ename varchar2(15),esal number(10,2),eaddr varchar2(20))";          
	        stmt.addBatch(createtablequery);              
	        stmt.executeBatch();
	        System.out.println("Database Table Creation Sucessfully.");
	         // connection committed
	            connection.commit(); 
	          }
	          catch (SQLException s){
	            System.out.println("SQL Exception " + s);
	          }
	        }
	        catch (Exception e){
	          e.printStackTrace();
	        }
	    }
	  }