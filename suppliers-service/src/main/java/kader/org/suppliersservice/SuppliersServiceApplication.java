package kader.org.suppliersservice;

import java.util.Random;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import kader.org.suppliersservice.entities.Suppliers;



@SpringBootApplication
public class SuppliersServiceApplication {
 

	public static void main(String[] args) {
		SpringApplication.run(SuppliersServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(SuppliersRepository suppliersRepository,RepositoryRestConfiguration repositoryRestConfiguration){
		return args->{
			Stream.of("LG","HP","Nokia","Sumsung").forEach(nameSuppliers->{
				repositoryRestConfiguration.exposeIdsFor(Suppliers.class);
				 Suppliers s=new Suppliers();
				 s.setNameSuppliers(nameSuppliers);
				 s.setEmail("kader@gmail.com");
				 suppliersRepository.save(s);
				System.out.println(s.toString());
			});
			
		};
	}

}
@RepositoryRestResource
 interface SuppliersRepository extends JpaRepository<Suppliers, Long>{}

