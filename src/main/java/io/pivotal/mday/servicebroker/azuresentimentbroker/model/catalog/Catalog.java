package io.pivotal.mday.servicebroker.azuresentimentbroker.model.catalog;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

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
public class Catalog {
	@NotEmpty
	@JsonSerialize(nullsUsing = EmptyListSerializer.class)
	@JsonProperty("services")
	private final List<CatalogService> catalogServices;

	public Catalog() {
		this.catalogServices = new ArrayList<>();
	}

	public Catalog(List<CatalogService> catalogServices) {
		this.catalogServices = catalogServices;
	}
}
