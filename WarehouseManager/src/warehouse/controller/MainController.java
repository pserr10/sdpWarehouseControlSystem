package warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import warehouse.dao.ItemDao;

import org.springframework.beans.factory.annotation.Autowired;;


@Controller
public class MainController {

	
	@RequestMapping("/")
	public String home( ) {
		return "index";
	}
	
	
	
}
