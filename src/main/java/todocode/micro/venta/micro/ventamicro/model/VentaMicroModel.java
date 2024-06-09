package todocode.micro.venta.micro.ventamicro.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class VentaMicroModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_venta_micro;
	
	@Temporal(TemporalType.DATE)
	private LocalDate fecha_venta_micro;
	
	private Long id_carrito_micro_venta;

}
