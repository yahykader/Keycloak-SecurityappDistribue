package kader.org.productsapp.controller;

import java.io.Serializable;

import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Data;

@Controller
public class SuppliersController {
		
   @Autowired
   private   KeycloakRestTemplate KeycloakRestTemplate;
   
	@GetMapping("/suppliers")
	public String  index(Model model) {
		ResponseEntity <PagedModel<Suppliers>> response=
				KeycloakRestTemplate.exchange("http://localhost:8083/suppliers",HttpMethod.GET,null,
						new ParameterizedTypeReference<PagedModel<Suppliers>>() {});
		model.addAttribute("suppliers",response.getBody().getContent());
		return "suppliers";
	}
	@ExceptionHandler(Exception.class)
	public String exceptionHandler() {
		return "errors";
	}

}
@Data 
class Suppliers implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nameSuppliers;
	private String email;
}
