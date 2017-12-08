package io.pivotal.mday.servicebroker.azuresentimentbroker.model.catalog;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "secret", "redirect_uri" })
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DashboardClient {

	@JsonProperty("id")
	private String id;
	@JsonProperty("secret")
	private String secret;
	@JsonProperty("redirect_uri")
	private String redirectUri;
}