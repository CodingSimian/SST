package Ostrand.SSTserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class SsTserviceregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsTserviceregistryApplication.class, args);
	}

}
