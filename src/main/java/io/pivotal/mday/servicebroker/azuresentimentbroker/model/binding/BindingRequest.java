package io.pivotal.mday.servicebroker.azuresentimentbroker.model.binding;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "service_id", "plan_id", "bind_resource", "parameters" })
@Data
public class BindingRequest {

	@JsonProperty("service_id")
	private String serviceId;

	@JsonProperty("plan_id")
	private String planId;

	@JsonProperty("bind_resource")
	private BindResource bindResource;

	@JsonProperty("parameters")
	Map<String, Object> parameters;

}