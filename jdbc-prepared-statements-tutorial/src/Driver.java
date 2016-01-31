import java.sql.*;


public class Driver{
	static Connection conn = null;
	static java.sql.PreparedStatement myStmt = null;
	static ResultSet myRs = null;
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try{
			// 1.Create a connection to database
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
		
		//2. Prepare a statement
		myStmt = conn.prepareStatement("select * from employees where salary > ? and department = ?");
		
		
		//3. Set the parameters
		myStmt.setDouble(1, 80000);
		myStmt.setString(2, "Legal");
		
		//4. Execute the SQL query
		ResultSet myRs = myStmt.executeQuery();
		
		//5. Display the result set
		display(myRs);
		}
		catch(Exception exp){
			exp.printStackTrace();
		}
	
	
	finally {
		if (myRs != null) {
			myRs.close();
		}
		
		if (myStmt != null) {
			myStmt.close();
		}
		
		if (conn != null) {
			conn.close();
		}
	}
}

	private static void display(ResultSet myRs) throws SQLException {
		while (myRs.next()) {
			String lastName = myRs.getString("last_name");
			String firstName = myRs.getString("first_name");
			double salary = myRs.getDouble("salary");
			String department = myRs.getString("department");
			
			System.out.printf("%s, %s, %.2f, %s\n", lastName, firstName, salary, department);
		}
	}

}
