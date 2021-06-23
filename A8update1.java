import java.sql.*;
public class A8update1 {
	public static void main(String[] args)throws Exception
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");
	Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs = st.executeQuery("select * from employee");
	rs.absolute(1);// move to first record
	String esal = rs.getString(3);
	System.out.println(esal);
	esal = esal +500;
	rs.updateString(3,esal);
	rs.updateRow();
	System.out.println(rs.getDouble(3));
	}
	}

