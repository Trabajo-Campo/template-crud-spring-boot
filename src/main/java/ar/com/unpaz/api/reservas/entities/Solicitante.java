package ar.com.unpaz.api.reservas.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Solicitante {
	@Id
	private Long id;
	private String nombre;
	private String cargo;
}
