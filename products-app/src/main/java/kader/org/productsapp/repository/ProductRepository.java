package kader.org.productsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kader.org.productsapp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
