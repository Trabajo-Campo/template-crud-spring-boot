package ar.com.unpaz.api.reservas.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ar.com.unpaz.api.reservas.entities.Recurso;

@Repository
public interface RecursoRepository extends JpaRepository<Recurso, Long>{
	Optional<Recurso> findByNombre(String nombre);	
	
	
	@Query(value = "SELECT coalesce(max(id), 0) + 1 FROM Recurso") 
    public Long getMaxId();
}
