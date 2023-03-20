package it.softwareinside.app.Controller;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	/*
	 * creare api che prende in i ngresso in input una stringa e ritorna il numero
	 * di caratteri di quella stringa
	 */
	@GetMapping("/sommatoria")
	public int getSomma() {
		int somma = 0;
		;
		for (int j = 3; j < 100; j += 3) {
			somma += j;
		}
		return somma;
	}

	@GetMapping("/length")
	public int numeroChar(@RequestParam(name = "parola") String myString) {

		return myString.length();

	}

	@GetMapping("/array")
	public ArrayList<Integer> getRandom(@RequestParam(name = "numero") int numero) {
		Random random = new Random();
		ArrayList<Integer> vett = new ArrayList<>();
		for (int i = 0; i < numero; i++) {
			vett.add(random.nextInt(1, 7));
		}
		return vett;
	}
}
