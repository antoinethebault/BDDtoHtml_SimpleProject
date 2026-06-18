package come.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class main {
	
	public static void main(String[] args) {
		SpringApplication.run(main.class, args);
	}

	/*public static void main2(String[] args) {
		String url = "jdbc:mysql://localhost:8889/database-1?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String pass = "rootToor2002";
		String sql = "SELECT * FROM db1";
		try (Connection conn = DriverManager.getConnection(url, user, pass);
				PreparedStatement pst = conn.prepareStatement(sql)){
			System.out.println("ID : NAME    : VALUE");
			try(ResultSet rs = pst.executeQuery()){
				while (rs.next()) {
					System.out.println(rs.getInt(1)+"  : "+to7(rs.getString(2))+" : "+rs.getInt(3));
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}
	static String to7(String value) {
		String out = "";
		out = value;
		if (value.length() < 7) {
			for (int i = 0; i < 7 - value.length(); i++) {
				out += " ";
			}
		}
		return out;
	}*/

}
