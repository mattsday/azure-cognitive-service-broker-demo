package io.pivotal.mday.servicebroker.azuresentimentbroker.model.request;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "context", "service_id", "plan_id", "organization_guid", "space_guid", "parameters" })
@Data
public class ServiceRequest {
	@JsonProperty("context")
	public Context context;

	@JsonProperty("service_id")
	public String serviceId;

	@JsonProperty("plan_id")
	public String planId;

	@JsonProperty("organization_guid")
	public String organizationGuid;

	@JsonProperty("space_guid")
	public String spaceGuid;

	@JsonProperty("parameters")
	Map<String, Object> parameters;

}