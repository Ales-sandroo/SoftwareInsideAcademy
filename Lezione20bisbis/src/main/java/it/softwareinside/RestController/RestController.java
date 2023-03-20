package it.softwareinside.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import it.softwareinside.Cat.Cat;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/meow")
	public ArrayList<Cat> getCat(@RequestParam("n") int numero , @RequestParam("lang") String lingua) {
		RestTemplate restTemplate = new RestTemplate();
		ArrayList<Cat> data = new ArrayList<>();
		for (int i = 0; i < numero; i++) {
			Cat risCat = restTemplate.getForObject("https://meowfacts.herokuapp.com/", Cat.class);
			data.add(risCat);
			
		}
		return data;
	}
	
}
