package bmed.borso.springwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "bmed.borso.springwebflux" })
public class SpringwebfluxWeblogicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebfluxWeblogicApplication.class, args);
	}

}
