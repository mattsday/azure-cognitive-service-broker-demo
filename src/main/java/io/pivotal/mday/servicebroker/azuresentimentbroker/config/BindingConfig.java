package io.pivotal.mday.servicebroker.azuresentimentbroker.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
public class BindingConfig {
	@Value("${azure-services.secret}")
	private String secret;
	@Value("${azure-services.uri}")
	private String uri;
}
