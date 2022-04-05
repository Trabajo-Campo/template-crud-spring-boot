package ar.com.unpaz.api.reservas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.unpaz.api.reservas.entities.Recurso;
import ar.com.unpaz.api.reservas.repositories.RecursoRepository;

@Service
public class RecursoServiceImp implements RecursoService {
	
	@Autowired
	RecursoRepository recursorepository;

	@Override
	public List<Recurso> findAll() {
		return recursorepository.findAll();
	}

	@Override
	public Optional<Recurso> findById(Long id) {
		return recursorepository.findById(id);
	}

	@Override
	public Optional<Recurso> findByNombre(String nombre) {
		return recursorepository.findByNombre(nombre);
	}

	@Override
	public Recurso save(Recurso recurso) {
		recurso.setId(getMaxId());
		return recursorepository.save(recurso);
	}

	@Override
	public Long getMaxId() {
		return recursorepository.getMaxId();
	}

	@Override
	public void delete(Recurso recurso) {
		recursorepository.delete(recurso);
		
	}

	@Override
	public Recurso update(Recurso recurso) {
		return recursorepository.save(recurso);
	}
	
	@Override
	public boolean existsById(Long id) {
		return recursorepository.existsById(id);
	}
	

}
