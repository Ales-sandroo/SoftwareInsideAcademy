package it.softwareinside.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import it.softwareinside.Models.Dog;

@org.springframework.stereotype.Controller
public class Controller {
	@GetMapping("/")
	public ModelAndView getHome() {
		ModelAndView modelAndView = new ModelAndView("index");
		RestTemplate restTemplate = new RestTemplate();
		Dog risDog = restTemplate.getForObject("https://random.dog/woof.json", Dog.class);
		System.out.println(risDog);
		System.out.println(risDog.getUrl());
		modelAndView.addObject("immagineDog", risDog.getUrl());
		return modelAndView;
	}
}
