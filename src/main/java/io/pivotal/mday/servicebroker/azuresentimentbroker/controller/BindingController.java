package io.pivotal.mday.servicebroker.azuresentimentbroker.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.mday.servicebroker.azuresentimentbroker.config.BindingConfig;
import io.pivotal.mday.servicebroker.azuresentimentbroker.model.binding.BindingRequest;
import io.pivotal.mday.servicebroker.azuresentimentbroker.model.binding.BindingResponse;
import io.pivotal.mday.servicebroker.azuresentimentbroker.model.binding.Credentials;

@RequestMapping("/v2/service_instances/")
@RestController
public class BindingController {

	private BindingConfig config;

	public BindingController(BindingConfig config) {
		this.config = config;
	}

	// Send the credentials their way
	@PutMapping("{instance_id}/service_bindings/{binding_id}")
	public ResponseEntity<?> bind(@PathVariable Map<String, String> pathVariables,
			@PathVariable("instance_id") String instanceId, @PathVariable("binding_id") String bindingId,
			@Valid @RequestBody BindingRequest request) {

		Credentials c = new Credentials(config.getSecret(), config.getUri());
		BindingResponse response = new BindingResponse(c);

		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	// No cleanup needed
	@DeleteMapping("{instance_id}/service_bindings/{binding_id}")
	public ResponseEntity<?> unbind(@PathVariable Map<String, String> pathVariables,
			@PathVariable("instance_id") String instanceId, @PathVariable("binding_id") String bindingId) {
		return new ResponseEntity<>("{}", HttpStatus.OK);
	}
}
