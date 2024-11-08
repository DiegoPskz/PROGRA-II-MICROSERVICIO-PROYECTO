package com.dp.gestiondeventas;

package com.dp.gestiondeventas.factura;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@EnableFeignClients
@SpringBootApplication
public class GestiondeventasAplication {
	public static void main(String[] args) {
		SpringApplication.run(FacturaApplication.class, args);

	}
	
}
