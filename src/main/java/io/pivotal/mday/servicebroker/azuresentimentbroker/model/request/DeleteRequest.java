package io.pivotal.mday.servicebroker.azuresentimentbroker.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DeleteRequest {
	@JsonProperty("service_id")
	private String serviceId;
	@JsonProperty("plan_id")
	private String planId;
	@JsonProperty("operation")
	private String operation;
}
