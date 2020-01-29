package kader.org.productsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kader.org.productsapp.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/")
	public String  index() {
		return "index";
	}
	
	@GetMapping("/products")
	public String  index(Model model) {
		model.addAttribute("listProducts",productRepository.findAll());
		return "products";
	}
	

}
