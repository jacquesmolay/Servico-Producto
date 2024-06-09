package todocode.micro.venta.micro.ventamicro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todocode.micro.venta.micro.ventamicro.dto.CarritoDto;
import todocode.micro.venta.micro.ventamicro.dto.DTOVentaCarritoproductos;
import todocode.micro.venta.micro.ventamicro.model.VentaMicroModel;
import todocode.micro.venta.micro.ventamicro.repository.ApiConsultaCarrito;
import todocode.micro.venta.micro.ventamicro.repository.IVentaMicroRepository;

@Service
public class VentaMicroService implements IVentaMicroService{
	
	@Autowired
	private IVentaMicroRepository ventaMicroRepo;
	
	@Autowired
	private ApiConsultaCarrito ApiVentaConsultaCarrito;

	@Override
	public List<VentaMicroModel> showVentasMicro() {
		// TODO Auto-generated method stub
		return ventaMicroRepo.findAll();
	}

	@Override
	public VentaMicroModel findVentasMicro(Long id_venta_buscar_micro) {
		// TODO Auto-generated method stub
		return ventaMicroRepo.findById(id_venta_buscar_micro).orElse(null);
	}

	@Override
	public void saveVentasMicro(VentaMicroModel ventaGrabar) {
		// TODO Auto-generated method stub
		ventaMicroRepo.save(ventaGrabar);
	}

	@Override
	public void editVentasMicro(Long id_venta_buscar_micro, VentaMicroModel ventaGrabar) {
		// TODO Auto-generated method stub
		VentaMicroModel ventaEditar=this.findVentasMicro(id_venta_buscar_micro);
		
		ventaEditar.setFecha_venta_micro(ventaGrabar.getFecha_venta_micro());
		ventaEditar.setId_carrito_micro_venta(ventaGrabar.getId_carrito_micro_venta());
		
		this.saveVentasMicro(ventaEditar);
		
	}

	@Override
	public void deleteVentasMicro(Long id_venta_buscar_micro) {
		// TODO Auto-generated method stub
		
		ventaMicroRepo.deleteById(id_venta_buscar_micro);
		
	}

	
	@Override
	public DTOVentaCarritoproductos getVentaCarritoProductos(Long id_venta) {
		// TODO Auto-generated method stub
		
		System.out.println("id venta buscar service "+  id_venta);
	
		//objeto a mostrar, con id ventas, id carrito, nombre productos y total
		DTOVentaCarritoproductos ventaCarroProductos=new DTOVentaCarritoproductos();
		
		//llamo a la api para que devuelva los products del carrito
		VentaMicroModel ventaBuscar=this.findVentasMicro(id_venta);
		
		System.out.println("id carritos buscar service "+  ventaBuscar.getId_carrito_micro_venta());
		
		CarritoDto ventaAndNombre= ApiVentaConsultaCarrito.carritoAndNombre(ventaBuscar.getId_carrito_micro_venta());
		
		//lleno y devuelvo el objeto
		ventaCarroProductos.setId_venta(id_venta);
		ventaCarroProductos.setId_carrito(ventaBuscar.getId_carrito_micro_venta());
		ventaCarroProductos.setNombre_productos(ventaAndNombre.getNombre_prodructo());		
		ventaCarroProductos.setValor_carrito(ventaAndNombre.getPrecio_total());		
		
		return ventaCarroProductos;
	
		
	}

}
