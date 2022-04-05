package ar.com.unpaz.api.reservas.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
public class ResponseEntityMessage {
	private String message;
	private Long id;
	private String status;
}
