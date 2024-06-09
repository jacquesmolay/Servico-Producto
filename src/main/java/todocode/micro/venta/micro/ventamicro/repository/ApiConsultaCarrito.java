package todocode.micro.venta.micro.ventamicro.repository;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import todocode.micro.venta.micro.ventamicro.dto.CarritoDto;

//datos del servicios al que me conectare en este caso carrito
@FeignClient(name="apicarrito"  ,url="http://localhost:9006/carrito_micro")
public interface ApiConsultaCarrito {
	
	//busco carro de la venta, en el servicio carrito
	@GetMapping("/el_carrito_con_el_nombre_productos/{id_carrito_buscar}")	
	public CarritoDto carritoAndNombre(@PathVariable("id_carrito_buscar") Long id_carrito_buscar );
	

}
