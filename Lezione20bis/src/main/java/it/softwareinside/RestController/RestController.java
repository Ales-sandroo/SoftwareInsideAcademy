package it.softwareinside.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import it.softwareinside.Models.Dog;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/randomCane")
	public Dog getCane() {
		ModelAndView modelAndView = new ModelAndView("index");
		RestTemplate restTemplate = new RestTemplate();
		Dog risDog = restTemplate.getForObject("https://random.dog/woof.json", Dog.class);
		modelAndView.addObject("immagineDog", risDog.getUrl());
		System.out.println(risDog);
		return risDog;
	}
}
