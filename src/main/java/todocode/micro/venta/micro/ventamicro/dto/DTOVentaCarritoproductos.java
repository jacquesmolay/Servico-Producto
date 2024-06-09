package todocode.micro.venta.micro.ventamicro.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class DTOVentaCarritoproductos {
	
	private Long id_venta;
	private Long id_carrito;
	private List<String> nombre_productos;
	private Long valor_carrito;

}
