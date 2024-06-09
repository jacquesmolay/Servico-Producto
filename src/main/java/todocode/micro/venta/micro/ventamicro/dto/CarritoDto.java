package todocode.micro.venta.micro.ventamicro.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarritoDto {
	
	private Long codigo_carrito;
	private List<String> nombre_prodructo;
	private Long precio_total;

}
