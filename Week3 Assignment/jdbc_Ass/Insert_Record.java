package jdbc_Ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert_Record {

	   private static final String url = "jdbc:mysql:///Books";
	   private static final String user = "root";
	   private static final String password = "sanga";
	   
	   private static final String INSERT_Books_QUERY =
	                "INSERT INTO bookDetails VALUES (?,?,?,?,?)";
  
		 public static void main(String[] args ) {

		     Scanner scan = null;
		     int n = 0;

		     int Book_Id = 0;
		     String Book_Name = null;
		     String Author_Name = null;
		     String Edition = null;
		     Connection con = null;
		     PreparedStatement ps = null;
		     int result = 0;

		     try {
		        // create Scanner class object
		        scan = new Scanner(System.in);
		        
		        // take number of students
		        if(scan != null) {
		            System.out.print("Enter Number of Books: ");
		            n = scan.nextInt();
		        }

		        // establish the connection
		        con = DriverManager.getConnection(url, user, password);
			      // create JDBC statement object
			    

		        // compile SQL query and store it in
		        // PreparedStatement object
		        if(con != null) {
		           ps = con.prepareStatement(INSERT_Books_QUERY);
		        }
		        
		        if(scan != null && ps != null) {
		           for(int i=0; i<n; i++) {

		              // read input values
		              System.out.println("\nEnter your choice "+(i+1));
//		              System.out.print("Number: ");
//		              SNo = scan.nextInt();
		              System.out.print("Book Id: ");
		              Book_Id = scan.nextInt();
		              System.out.print("Book Name: ");
		              Book_Name = scan.nextLine();
		              Book_Name+=scan.nextLine();
		              System.out.print("Author Name: ");
		              Author_Name = scan.nextLine();
		              Author_Name+=scan.nextLine();
		              System.out.print("Edition: ");
		              Edition = scan.nextLine();
		              Edition+=scan.nextLine();

		              // set parameters values
//		              ps.setInt(1, SNo);
		              ps.setInt(1, Book_Id);
		              ps.setString(2, Book_Name);
		              ps.setString(3, Author_Name);
		              ps.setString(4, Edition);
		              

		              // execute the query
		              result = ps.executeUpdate();
		           }
		        }
		        
		        // process the result
		        if(result == 0) {
		           System.out.println("\nRecords insertion failed");
		        } else {
		           System.out.println("\nRecords inserted successfully");
		        }

		     } catch(SQLException se) {
		        se.printStackTrace();
		     } catch(Exception e) {
		        e.printStackTrace();
		     } // try-catch block 

		     finally {
		        // close JDBC objects
		        try {
		           if(ps != null) ps.close();
		        } catch(SQLException se) {
		           se.printStackTrace();
		        }
		        try {
		           if(con != null) con.close();
		        } catch(SQLException se) {
		           se.printStackTrace();
		        }
		        try {
		           if(scan != null) scan.close();
		        } catch(Exception e) {
		           e.printStackTrace();
		        }
		     } // finally
		   } // main()
	}