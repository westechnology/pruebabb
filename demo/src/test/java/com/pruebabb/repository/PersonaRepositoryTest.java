package com.pruebabb.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pruebabb.model.Persona;

@RunWith(SpringRunner.class)
@DataJpaTest
class PersonaRepositoryTest {

	@Autowired
	private PersonaRepository personaRepository;
	
	@Test
	void findPersonaByIdTest() {
		String tipoIde = "CC";
		String numeroIde = "91500121";
		Persona p = personaRepository.findPersonaByTipoAndNumero(tipoIde, numeroIde);
		assertTrue(p != null);
	}

}
