package io.pivotal.mday.servicebroker.azuresentimentbroker.model.catalog;

import java.util.List;
import java.util.Map;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogService {
	@NotEmpty
	@JsonSerialize
	@JsonProperty("name")
	private String name;

	@NotEmpty
	@JsonSerialize
	@JsonProperty("id")
	private String id;

	@NotEmpty
	@JsonSerialize
	@JsonProperty("description")
	private String description;

	@JsonSerialize
	@JsonProperty("bindable")
	private Boolean bindable;

	@JsonSerialize(nullsUsing = EmptyMapSerializer.class)
	@JsonProperty("metadata")
	private Map<String, Object> metadata;

	@JsonSerialize
	@JsonProperty("plan_updateable")
	private Boolean planUpdateable;

	@NotEmpty
	@JsonSerialize(nullsUsing = EmptyListSerializer.class)
	@JsonProperty("plans")
	private List<Plan> plans;

	public CatalogService() {
	}

	public CatalogService(String id, String name, String description, boolean bindable, List<Plan> plans) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.bindable = bindable;
		this.plans = plans;
	}

	public CatalogService(String id, String name, String description, boolean bindable, boolean planUpdateable,
			List<Plan> plans, List<String> tags, Map<String, Object> metadata, List<String> requires,
			DashboardClient dashboardClient) {
		this(id, name, description, bindable, plans);
		this.metadata = metadata;
		this.planUpdateable = planUpdateable;
	}
}
