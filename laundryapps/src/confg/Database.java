package confg;

import java.sql.*;
import javax.swing.JOptionPane;

public class Database {
	Connection conn;
	public static Connection koneksi() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/laudry_apps","root","");
			return conn;
		}catch(Exception e) {
			 e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
