package com.pruebabb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pruebabb.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, String>{

	@Query("Select p "+
			"FROM Persona p "+
			"WHERE p.tipoIde = :tipoIde "+
			"AND p.numeroIde = :numeroIde"
			)
	public Persona findPersonaByTipoAndNumero(
			@Param("tipoIde") String tipoIde,
			@Param("numeroIde") String numeroIde
			);
}
