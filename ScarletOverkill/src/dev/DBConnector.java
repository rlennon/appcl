package dev;

import java.sql.*;

public class DBConnector {

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_NAME = "appcldb";
	private static final String DB_ADDRESS = "";
	private static final String DB_ERROR = "?autoReconnect=true&useSSL=false";

	private static final String DB_URL = "jdbc:mysql://" + DB_ADDRESS + DB_NAME + DB_ERROR;
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	private static Statement stmt;
	private static Connection conn;
	
	private static void createConnection(String dbUrl, String user, String pass) {



		try {

			// Register MySQL JDBC driver
			Class.forName(JDBC_DRIVER);
			System.out.println("STEP 1 COMPLETE - Driver Registered...");

			// Get connection to DB using username and password 
			conn = DriverManager.getConnection(dbUrl, user, pass);
			System.out.println("STEP 2 COMPLETE - Connection obtained...");

			// Get statement object to execute queries
			stmt = conn.createStatement();

		}catch(SQLException e) {

			System.out.println("Problem with SQL.\n" + e.getMessage());

		}catch(Exception e) {

			System.out.println(e.getMessage());
		}

	}
	
	private static void closeConnection(){   

		try{
			//if connection exists, close
			if(conn != null){
				conn.close();
				System.out.println("COMPLETE - Connection closed.");				
			}
		}
		catch (SQLException e){
			System.out.println("Could not close connection.\n" + e.getMessage());
		}
	}

}
