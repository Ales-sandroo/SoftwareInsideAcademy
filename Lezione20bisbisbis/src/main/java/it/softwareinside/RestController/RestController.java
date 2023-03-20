package it.softwareinside.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import it.softwareinside.Service.Service;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	Service service;
	
	@GetMapping("/duck")
	public String showDuck() {
		
		return service.getDuck();
	}
	
}
