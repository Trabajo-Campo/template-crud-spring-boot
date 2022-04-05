package ar.com.unpaz.api.reservas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.unpaz.api.reservas.entities.Solicitante;

@Repository
public interface SolicitanteRepository extends JpaRepository<Solicitante, Long>{

}
