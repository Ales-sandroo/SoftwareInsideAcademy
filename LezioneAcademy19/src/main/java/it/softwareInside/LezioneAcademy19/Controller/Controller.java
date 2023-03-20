package it.softwareInside.LezioneAcademy19.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
	
@RestController
public class Controller {

	@GetMapping("/")
	public ModelAndView getHome() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
	}

	@GetMapping("/contatti")
	public ModelAndView getContatti() {
		ModelAndView modelAndView = new ModelAndView("prova");

		return modelAndView;
	}

	@GetMapping("/hello")
	public ModelAndView getHello() {

		ModelAndView modelAndView = new ModelAndView("hello");

		String myNameString = "Welcome to rob Channel";

		modelAndView.addObject("channelIntro", myNameString);

		return modelAndView;
	}
}
