package ar.com.unpaz.api.reservas.services;

import java.util.List;
import java.util.Optional;

import ar.com.unpaz.api.reservas.entities.Recurso;

public interface RecursoService {

	List<Recurso> findAll();
	Optional<Recurso> findById(Long id);
	Optional<Recurso> findByNombre(String nombre);
	Recurso save(Recurso recurso);
	Long getMaxId();
	void delete(Recurso recuros);
	Recurso update(Recurso recurso);
	boolean existsById(Long id);
}
