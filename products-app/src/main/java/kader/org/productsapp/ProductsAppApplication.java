package kader.org.productsapp;

import java.util.Random;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import kader.org.productsapp.entities.Product;
import kader.org.productsapp.repository.ProductRepository;

@SpringBootApplication
public class ProductsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsAppApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(ProductRepository productRepository){
		return args->{
			Stream.of("Electroménager","Informatique-Tablette","Smartphone","Tv-Imagerie").forEach(nameProduct->{
				 Product p=new Product();
				 p.setNameProduct(nameProduct);
				 p.setPrice(new Random().nextDouble()+100);
				 productRepository.save(p);
				System.out.println(p.toString());
			});
			
		};
	}

}
