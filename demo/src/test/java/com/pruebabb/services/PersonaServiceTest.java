package com.pruebabb.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pruebabb.model.Persona;


@RunWith(SpringRunner.class)
@DataJpaTest
class PersonaServiceTest {

	@Autowired
	private PersonaService personaService;
	
	@Test
	void testSave() {
		Persona p = personaService.save(getPersona());
		assertTrue(p != null);
	}

	@Test
	void testFindAllPeronas() {
		fail("Not yet implemented");
	}

	@Test
	void testFindPersonaById() {
		fail("Not yet implemented");
	}

	@Test
	void testDeletePersona() {
		fail("Not yet implemented");
	}
	
	private Persona getPersona() {
		Persona p = new Persona();
		p.setTipoIde("CC");
		p.setNumeroIde("91500122");
		p.setPrimerNombre("JUAN");
		p.setSegundoNombre("");
		p.setPrimerApellido("SANTAMARIA");
		p.setSegundoApellido("BORJA");
		p.setRol("P");
		return p;
		
	}

}
