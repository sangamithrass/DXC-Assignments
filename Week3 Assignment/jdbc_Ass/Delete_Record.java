package jdbc_Ass;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_Record {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

	      final String url = "jdbc:mysql:///Books";
	      final String user = "root";
	      final String password = "sanga";

	      Connection con = DriverManager.getConnection(url, user, password);

	      Statement st = con.createStatement();
	      Scanner sc = new Scanner(System.in);
	      int n=0;
	      try {
		        if(sc != null) {
		            System.out.print("Enter Number of Books you want to delete: ");
		             n = sc.nextInt();
		        }
		        if(sc != null) {
		           for(int i=0; i<n; i++) {
		        	  System.out.println("Enter Book Id or Book Name");
		              System.out.print("BookId: ");
				      int id = sc.nextInt();
		              System.out.print("BookName: ");
				      String name = sc.nextLine();
			          name+=sc.nextLine();

		      String query = "Delete from bookDetails where bookId = " + id +" OR bookName = " + name + "" ;
		      int d = st.executeUpdate(query);
	
		      if (d > 0)           
	              System.out.println("\nRecords deleted and displayed");           
	          else
	              System.out.println("Record not found"); 
		           }
		        }
		      st.close();
		      con.close();
		     }catch(SQLException se) {
			        se.printStackTrace();
			     } catch(Exception e) {
			        e.printStackTrace();
			     }

			     finally {
			        try {
			           if(con != null) con.close();
			        } catch(SQLException se) {
			           se.printStackTrace();
			        }
			        try {
			           if(sc != null) sc.close();
			        } catch(Exception e) {
			           e.printStackTrace();
			        }
			     } 
	}

}
