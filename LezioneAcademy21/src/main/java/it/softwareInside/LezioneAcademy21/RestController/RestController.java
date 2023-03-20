package it.softwareInside.LezioneAcademy21.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import it.softwareInside.LezioneAcademy21.Models.Persona;
import it.softwareInside.LezioneAcademy21.Service.PersonaService;


@org.springframework.web.bind.annotation.RestController
public class RestController {

	//CON SERVICE
	@Autowired
	PersonaService personaService;
	
	
	
	@PostMapping("/crea")
	public boolean creaPersona(@RequestBody Persona persona) {
		
		
		System.out.println("#################à");
		System.out.println(persona);
		
		
		
		return personaService.addToDatase(persona);
	}
	
	
	
	
	
	
	//SOLO CON RESTCONTROLLER
	
	/*@Autowired
	PersonaRepository personaRepository;

	@GetMapping("/delete-all")
	public boolean deleteAllData(@RequestParam("pass") String pass) {
		String myPassString = "123456";
		if (!pass.equals(myPassString))
			return false;
		try {
			personaRepository.deleteAll();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@GetMapping("/delete")
	public Persona deletePersona(@RequestParam("id") int id) {
		Persona persona = personaRepository.findById(id).get();
		personaRepository.deleteById(id);
		return persona;
	}

	@GetMapping("/crea-persona")
	public boolean creaPersona(@RequestParam("nome") String nome, @RequestParam("telefono") String telefono) {
		if (nome == null || nome.isEmpty() || telefono == null || telefono.isEmpty())
			return false;
		try {
			personaRepository.save(new Persona(nome, telefono));
			return true;
		} catch (Exception e) {
			System.out.println("ERRORE " + e);
			return false;
		}
	}

	@GetMapping("/save-test")
	public boolean saveTest() {
		try {
			Persona p1 = new Persona();
			p1.setNome("mario");
			p1.setTelefono("12345678910");
			personaRepository.save(p1);

			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}

	}
	*/
}
