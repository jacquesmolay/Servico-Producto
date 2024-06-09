package todocode.micro.venta.micro.ventamicro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todocode.micro.venta.micro.ventamicro.dto.DTOVentaCarritoproductos;
import todocode.micro.venta.micro.ventamicro.model.VentaMicroModel;
import todocode.micro.venta.micro.ventamicro.service.VentaMicroService;

@RestController
@RequestMapping("/venta_micro")
public class VentaMicroModelController {
	
	@Autowired
	private VentaMicroService vntCarroServ;
	
	@GetMapping("/lista_venta_micro")
	public List<VentaMicroModel> showVentaMicro(){
		
		return vntCarroServ.showVentasMicro();
	}
	
	@GetMapping("/listar_venta_micro/{id_venta_buscar}")
	public VentaMicroModel findVentaMicro(@PathVariable Long id_venta_buscar ) {
		
		return vntCarroServ.findVentasMicro(id_venta_buscar);
		
	}
	
	@PostMapping("/crear_venta_micro")
	public String saverVentaMicro(@RequestBody VentaMicroModel vntMicroSave) {
		
		vntCarroServ.saveVentasMicro(vntMicroSave);
		return "Venta Registrada Correctamente en el Microservicio";
	}
	
	@PutMapping("/update_venta_micro/{id_venta_buscar_editar}")
	public String updateVentaMicro(@PathVariable Long id_venta_buscar_editar,@RequestBody VentaMicroModel editVentaMicro) {
		
		vntCarroServ.editVentasMicro(id_venta_buscar_editar, editVentaMicro);
		
		return "Venta Editado Correctamente";
		
	}
	
	@DeleteMapping("/eliminar_venta_micro/{id_venta_buscar_eliminar}")
	public String deleteVentaCarrito(@PathVariable Long id_venta_buscar_eliminar) {
		
		vntCarroServ.deleteVentasMicro(id_venta_buscar_eliminar);
		
		return "Venta Eliminado Correctamente";
		
	}
	
	
	@GetMapping("/detalle_venta_micro/{id_venta_buscar}")
	public DTOVentaCarritoproductos getDetalleVenta(@PathVariable Long id_venta_buscar) {
		
		System.out.println("id venta buscar controller "+  id_venta_buscar);
		
		return vntCarroServ.getVentaCarritoProductos(id_venta_buscar);
	}

}
