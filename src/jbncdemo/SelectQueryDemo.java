package jbncdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
		// We Should connect to the DB
		// load the DB driver
		// first line in process of connecting to the DB
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// connect to the DB -> use class DriverManager and method get connection
		
		String dburl ="jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
	
	 Connection con = DriverManager.getConnection(dburl, username, password);
	System.out.println("Successfully connected to Database");
	
	// run a query on the DB
	
	String query = "select * from movies";
	
	// send query to the DB
	
	Statement stmt = con.createStatement();
	// execute the query and fetch the output and store it is in object 
	
	ResultSet rs = stmt.executeQuery(query);
	
	// print all the rows on the console
	
	while(rs.next())
	{
		System.out.print("Title: " +rs.getString("title") + "\t");
		System.out.print("genre: " +rs.getString("genre") + "\t");
		System.out.print("director: " +rs.getString("director") + "\t");
		System.out.println("release_year: " +rs.getString("release_year") + "\t");
	}
	
	// close the connection
	con.close();
	}
	

}
