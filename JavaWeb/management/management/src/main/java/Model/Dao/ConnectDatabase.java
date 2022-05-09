package Model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
	private static final String url = "jdbc:mysql://103.75.187.208:3306/quanlychothuesanpham";
	private static final String username = "ttrinh";
	private static final String password = "P@ssw0rd"; // password login mysql

	public Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, username, password);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
