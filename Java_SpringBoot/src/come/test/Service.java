package come.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(readOnly=true)
public class Service {

	/*String url = "jdbc:mysql://localhost:8889/database-1?useSSL=false&serverTimezone=UTC";
	String user = "root";
	String pass = "rootToor2002";
	String sql = "SELECT * FROM db1";*/
	private final ItemRepository repo;
	
	public Service(ItemRepository repo) {
		this.repo = repo;
	}
	
	public List<Item> findAll(){
		return repo.findAll();
	}
	
	/*public List<Item> findAll() {
		List<Item> list = new LinkedList<Item>();
		try (Connection conn = DriverManager.getConnection(url, user, pass);
				PreparedStatement pst = conn.prepareStatement(sql)){
			System.out.println("ID : NAME    : VALUE");
			try(ResultSet rs = pst.executeQuery()){
				while (rs.next()) {
					String chaine = (rs.getInt(1)+"  : "+to7(rs.getString(2))+" : "+rs.getInt(3));
					Item item = new Item(rs.getInt(1), rs.getString(2), rs.getInt(3));
					list.add(item);
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}*/
	
	/*static String to7(String value) {
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
