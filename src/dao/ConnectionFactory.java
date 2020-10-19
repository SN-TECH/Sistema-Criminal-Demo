package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private Connection conn;
	
	public Connection OpenConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			this.conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/web_camadas_2020",//URL BD -> Schema
					"root",//User
					"root"//Password
					);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return this.conn;
	}
	
	public void CloseConnection(Connection conn) throws SQLException {
		this.conn.close();
	}
}
