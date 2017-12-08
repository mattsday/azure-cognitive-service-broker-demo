package io.pivotal.mday.servicebroker.azuresentimentbroker.model.binding;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Credentials {
	private String secret;
	private String uri;
}
