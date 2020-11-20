package com.pruebabb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebabb.model.Persona;
import com.pruebabb.repository.PersonaRepository;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	public Persona save(Persona p) {
		return personaRepository.save(p);
	}
	
	public List<Persona> findAllPeronas(){
		return personaRepository.findAll();
	}
	
	public Persona findPersonaById(String tipoIde, String numeroIde){
		return personaRepository.findPersonaByTipoAndNumero(tipoIde,numeroIde);
	}
	
	public void deletePersona(Persona p) {
		personaRepository.delete(p);
	}
}
