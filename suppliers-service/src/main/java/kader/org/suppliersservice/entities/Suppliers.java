package kader.org.suppliersservice.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import lombok.*;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Suppliers implements Serializable{
	@Id @GeneratedValue (strategy =  GenerationType.IDENTITY)
	private Long id;
	private String nameSuppliers;
	private String email;
}




