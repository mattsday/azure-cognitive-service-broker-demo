package io.pivotal.mday.servicebroker.azuresentimentbroker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.pivotal.mday.servicebroker.azuresentimentbroker.model.catalog.Catalog;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Configuration
public class CatalogConfig {

	private ServiceConfig serviceConfig;

	@Bean
	public Catalog catalog() {
		return new Catalog(serviceConfig.getServices());
	}

}
