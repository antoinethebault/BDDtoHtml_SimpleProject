package come.test;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import come.test.Service;

@RestController
@RequestMapping("api/items")
@CrossOrigin(origins="localhost")
public class Controller {
	private final Service service;
	public Controller(Service service){
		this.service = service;
	}
	@GetMapping
	public List<Item> getAll(){
		return service.findAll();
	}
}
