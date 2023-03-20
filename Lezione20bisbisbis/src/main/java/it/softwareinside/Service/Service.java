package it.softwareinside.Service;

import org.springframework.web.client.RestTemplate;

import it.softwareinside.Models.Duck;

@org.springframework.stereotype.Service
public class Service {
	
	public String getDuck() {

		RestTemplate restTemplate = new RestTemplate();

		Duck ris = restTemplate.getForObject("https://random-d.uk/api/v2/random", Duck.class);

		return ris.getUrl();
	}
}
