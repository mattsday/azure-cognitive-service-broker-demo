package io.pivotal.mday.servicebroker.azuresentimentbroker.model.catalog;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "id", "description", "max_storage_tb", "metadata" })
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Plan {

	@JsonProperty("name")
	private String name;
	@JsonProperty("id")
	private String id;
	@JsonProperty("description")
	private String description;
	@JsonProperty("free")
	private boolean free;

	@JsonSerialize(nullsUsing = EmptyMapSerializer.class)
	@JsonProperty("metadata")
	private Map<String, Object> metadata;

	public Plan() {
	}

	public Plan(String id, String name, String description, boolean free) {
		this.name = name;
		this.id = id;
		this.description = description;
		this.free = free;
	}

	public Plan(String id, String name, String description, boolean free, Map<String, Object> metadata) {
		this.name = name;
		this.id = id;
		this.description = description;
		this.free = free;
		this.metadata = metadata;
	}

}
