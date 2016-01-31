package jdbcdemo;
import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// 1.Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "");
			// 2.Create a statement
			Statement myStmt = myConn.createStatement();
			// 3.Execute a SQL query
			ResultSet myRs = myStmt.executeQuery("Select * from employees");
			// 4.Process the result set
			while(myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}

}
