import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerConnector {

	public static Connection getConnection() {
		// TODO Auto-generated method stub
	    String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
	   
		String dbURL = "jdbc:sqlserver://61.150.109.162:53433;DatabaseName=accumulate_points_DB";  
	    String userName = "sa";
	    String userPwd = "akjr3838968";
	 
	    Connection dbConn = null;  
	    try {  
	        Class.forName(driverName);  
	        dbConn = DriverManager.getConnection(dbURL, userName, userPwd);  
	        System.out.println("Connection Successful!");
	    } catch (Exception e) {  
	        e.printStackTrace();  
	    }  
	    return dbConn;
	}

}
