package todocode.micro.venta.micro.ventamicro.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todocode.micro.venta.micro.ventamicro.model.VentaMicroModel;

@Repository
public interface IVentaMicroRepository extends JpaRepository<VentaMicroModel,Long>{

}
