package ar.com.unpaz.api.reservas.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Recursos")
@Data 
@NoArgsConstructor
@AllArgsConstructor
public class Recurso {
	@Id
	private Long id;
	private String nombre;
	private Boolean disponible; 
}
