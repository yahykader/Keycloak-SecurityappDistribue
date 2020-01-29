package kader.org.productsapp.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.keycloak.adapters.springsecurity.client.KeycloakClientRequestFactory;
import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
@Configuration
public class KeycloakConfig {
 
	
	@Bean
	public  KeycloakSpringBootConfigResolver configResolver() {
		return new  KeycloakSpringBootConfigResolver();
	}
	
	@Bean
	public  KeycloakRestTemplate KeycloakRestTemplate(KeycloakClientRequestFactory KeycloakClientRequestFactory) {
		return new KeycloakRestTemplate(KeycloakClientRequestFactory);
	}
}
