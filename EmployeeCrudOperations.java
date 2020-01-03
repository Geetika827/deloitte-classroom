import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeCrudOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    try {
    	
    	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter Dept no: ");
    	int deptno=Integer.parseInt(in.readLine());
    	System.out.println("enter dept name: ");
    	String deptName=in.readLine();
    	System.out.println("enter dept location: ");
    	String deptLoc=in.readLine();
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
     PreparedStatement psmt=con.prepareStatement("insert into dept values(?,?,?)");
     psmt.setInt(1, deptno);
     psmt.setString(2, deptName);
     psmt.setString(3, deptLoc);
     
//     ResultSet rs=smt.executeQuery("select * from emp");
//     System.out.println("Emp IDs    Emp-Names");
//     while(rs.next())
//     {
//    	 System.out.println(rs.getInt(1)+"  "+rs.getString(2));
//     }
     int r=psmt.executeUpdate();
     if(r>0)
     {
    	 System.out.println("Data Inserted");
     }
     con.close();
     }
    catch(Exception ex)
    {
    	System.out.println(ex);
    }
	}

}
