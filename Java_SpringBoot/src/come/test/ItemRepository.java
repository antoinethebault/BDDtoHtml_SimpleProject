package come.test;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemRepository extends JpaRepository<Item,Integer> {
	@Query(value = "SELECT ID, NAME, VALUE FROM db1", nativeQuery = true)
	List<Item> findAll();
}
