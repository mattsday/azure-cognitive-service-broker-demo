package io.pivotal.mday.servicebroker.azuresentimentbroker.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import io.pivotal.mday.servicebroker.azuresentimentbroker.model.catalog.CatalogService;
import lombok.Data;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "azure-services")
@Data
public class ServiceConfig {
	private List<CatalogService> services;
}
