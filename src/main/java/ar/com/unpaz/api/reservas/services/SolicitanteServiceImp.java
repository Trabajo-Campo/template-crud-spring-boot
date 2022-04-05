package ar.com.unpaz.api.reservas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.unpaz.api.reservas.entities.Solicitante;
import ar.com.unpaz.api.reservas.repositories.SolicitanteRepository;

@Service
public class SolicitanteServiceImp implements SolicitanteService {

	@Autowired
	SolicitanteRepository solicitanteRepository; 
	@Override
	public List<Solicitante> buscarTodos() {
		
		return solicitanteRepository.findAll();
	}

}
