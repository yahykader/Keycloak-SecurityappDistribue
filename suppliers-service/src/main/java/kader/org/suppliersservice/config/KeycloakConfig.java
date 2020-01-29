package kader.org.suppliersservice.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakConfig {
	@Bean
	public  KeycloakSpringBootConfigResolver configResolver() {
		return new  KeycloakSpringBootConfigResolver();
	}
}

