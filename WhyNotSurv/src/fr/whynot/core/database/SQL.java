package fr.whynot.core.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL {
	
	private static Connection conn;
	
	public void connect(String host, String database, int port, String user, String password) {
		if(!isConnected()) {
			try {
				conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+database, user,password);
				System.out.println("Connection Base de données réussi !");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Connection Base De données Echoué !");
			}
		}
	}
	public void disconnect() {
		if(isConnected()) {
			try {
				conn.close();
				System.out.println("Deconnection base de données effectuer !");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private boolean isConnected() {
		try {
			if((conn == null) || (conn.isClosed()) || (conn.isValid(5))) {
				return false;
			}
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static Connection getConnection() {
		return conn;
	}

}
