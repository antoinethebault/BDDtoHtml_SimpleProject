package come.test;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="db1")
public class Item {
	@Id
	private int id;
	private String name;
	private int value;
	public Item () {
		
	}
	public Item (int id2, String name2, int value2) {
		this.id = id2;
		this.name = name2;
		this.value = value2;
		System.out.println("item "+id2+" : "+name2);
	}
	public int getId () {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getValue() {
		return value;
	}
}
