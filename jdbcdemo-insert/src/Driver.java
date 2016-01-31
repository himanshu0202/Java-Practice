import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// 1.Create a connection to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
		
		//2. Create statement object
		Statement myStmt = conn.createStatement();
		
		//3. Execute SQL query
		String sql ="insert into employees"
					+ "(last_name,first_name,email)"
					+ "values ('Brown','David','david.brown@gmail.com')";
		myStmt.executeUpdate(sql);
		System.out.println("Insert Complete");
		}
		catch(Exception exp){
			exp.printStackTrace();
		}
	}

}
