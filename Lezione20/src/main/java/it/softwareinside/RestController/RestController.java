package it.softwareinside.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import it.softwareinside.Models.Fox;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/genera-fox")
	public ArrayList<Fox> generaFox(@RequestParam("n") int numeroFox) {

		ArrayList<Fox> arrayList = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();

		for (int i = 0; i < numeroFox; i++) {
			Fox risFox = restTemplate.getForObject("https://randomfox.ca/floof/", Fox.class);
			arrayList.add(risFox);
		}

		return arrayList;
	}
}
