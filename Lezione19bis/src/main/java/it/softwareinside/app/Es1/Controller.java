package it.softwareinside.app.Es1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestController
public class Controller {
	@GetMapping("/media")
	public int getMedia(@RequestParam(name = "n1") int numero1, @RequestParam(name = "n2") int numero2,
			@RequestParam(name = "n3") int numero3) {
		int somma = 0;
		try {
			somma = numero1 + numero2 + numero3;

		} catch (MethodArgumentTypeMismatchException e) {

		}
		return somma / 3;

		
	}

}
