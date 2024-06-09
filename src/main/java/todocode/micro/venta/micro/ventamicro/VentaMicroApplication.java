package todocode.micro.venta.micro.ventamicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VentaMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(VentaMicroApplication.class, args);
	}

}
