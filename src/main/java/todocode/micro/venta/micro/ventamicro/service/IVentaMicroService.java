package todocode.micro.venta.micro.ventamicro.service;

import java.util.List;

import todocode.micro.venta.micro.ventamicro.dto.DTOVentaCarritoproductos;
import todocode.micro.venta.micro.ventamicro.model.VentaMicroModel;

public interface IVentaMicroService {
	
	public List<VentaMicroModel>showVentasMicro();
	
	public VentaMicroModel findVentasMicro(Long id_venta_buscar_micro);
	
	public void saveVentasMicro(VentaMicroModel ventaGrabar);
	
	public void editVentasMicro(Long id_venta_buscar_micro,VentaMicroModel ventaGrabar);
	
	public void deleteVentasMicro(Long id_venta_buscar_micro);
	
	public DTOVentaCarritoproductos getVentaCarritoProductos(Long id_carrito);

}
