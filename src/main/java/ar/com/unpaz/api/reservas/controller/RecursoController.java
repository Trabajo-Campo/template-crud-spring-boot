package ar.com.unpaz.api.reservas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import ar.com.unpaz.api.reservas.entities.Recurso;
import ar.com.unpaz.api.reservas.entities.ResponseEntityMessage;
import ar.com.unpaz.api.reservas.services.RecursoService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/recursos")
@Slf4j
public class RecursoController {
	
	@Autowired
	RecursoService recursoService;
	
	@GetMapping
	public List<Recurso> findAll() {
		return recursoService.findAll();
	}
	
	@GetMapping("/search")
	public Recurso findByName(@RequestParam Optional<String> nombre) {
		log.info("Realizando busqueda por el nombre {}", nombre);
		return recursoService.findByNombre(
				nombre.orElseThrow(
						() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "El parametro nombre es obligatorio"))
				) 
				.orElseThrow(
					() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontro el recurso con el nombre: " + nombre)
				);
	}
	
	@GetMapping("/{id}")
	public Recurso findById(@PathVariable("id") Long id) {
		log.info("Realizando busqueda por el id {}", id);
		return recursoService.findById(id)
			.orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontrol el id: " + id)
			);
	}
	@PostMapping()
	public ResponseEntity<Recurso> save(@RequestBody Recurso recurso) {
		return new ResponseEntity<Recurso>(recursoService.save(recurso), HttpStatus.CREATED);
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<ResponseEntityMessage> delete(@PathVariable("id") Long id){
		Recurso recurso = recursoService.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontrol el id: " + id)
				);
		recursoService.delete(recurso);
		return new ResponseEntity<ResponseEntityMessage>(new ResponseEntityMessage("Recurso Borrado", id,  "OK"), HttpStatus.OK);
	}
	
	@PutMapping()
	public Recurso update(@RequestBody Recurso recurso) {
		if ( ! recursoService.existsById(recurso.getId()) )	
			throw  new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontrol el id: " + recurso.getId());
		return  recursoService.update(recurso);
		
	}
	

}
