package com.pruebabb.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebabb.model.Persona;
import com.pruebabb.services.PersonaService;

@RestController
@RequestMapping("/api")
public class PersonaRestController {

	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/test")
	private String test() {
		return "Ok si funciona";
	}
	
	@PostMapping("/addPersona")
	private Persona addPersona(@RequestBody Persona p) {
		try {
			return personaService.save(p);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	
	@GetMapping("/listPersona")
	private List<Persona> findAllPersonas(){
		return personaService.findAllPeronas();
	}
	
	@GetMapping("/getPersona/{tipoIde}/{numeroIde}")
	private Persona findPersonabyId(@PathVariable("tipoIde") String tipoIde, @PathVariable("numeroIde") String numeroIde){
		return personaService.findPersonaById(tipoIde,numeroIde);
	}
	
	@DeleteMapping("/deletePersona")
	private void deletePersona(@RequestBody Persona p) {
		personaService.deletePersona(p);
	}
	
	
}
