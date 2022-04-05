package ar.com.unpaz.api.reservas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.unpaz.api.reservas.entities.Solicitante;
import ar.com.unpaz.api.reservas.services.SolicitanteService;

@RestController
@RequestMapping("/api/solicitantes")
public class SolicitanteController {
	
	@Autowired
	SolicitanteService solicitanteService;
	

	@GetMapping
	List<Solicitante> findAll() {
		return solicitanteService.buscarTodos();
	}
	
}
