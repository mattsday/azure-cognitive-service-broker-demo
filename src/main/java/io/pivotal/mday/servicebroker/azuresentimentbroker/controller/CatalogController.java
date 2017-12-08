package io.pivotal.mday.servicebroker.azuresentimentbroker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.mday.servicebroker.azuresentimentbroker.model.catalog.Catalog;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/v2/catalog")
@AllArgsConstructor
public class CatalogController {

	private Catalog catalog;

	@GetMapping
	public Catalog getCatalog() {
		return catalog;
	}

}
