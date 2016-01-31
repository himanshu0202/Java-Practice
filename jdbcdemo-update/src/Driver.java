import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// 1.Create a connection to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
		
		//2. Create statement object
		Statement myStmt = conn.createStatement();
		
		//3. Execute SQL query
		String sql ="delete from employees"
					+ " where last_name='Brown'";
		
		int rowsAffected =myStmt.executeUpdate(sql);
		System.out.println("Rows Affected:" + rowsAffected);
		System.out.println("Delete Complete");
		}
		catch(Exception exp){
			exp.printStackTrace();
		}
	}

}
