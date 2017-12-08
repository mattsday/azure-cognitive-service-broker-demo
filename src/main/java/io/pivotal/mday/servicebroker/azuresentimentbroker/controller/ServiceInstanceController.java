package io.pivotal.mday.servicebroker.azuresentimentbroker.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.mday.servicebroker.azuresentimentbroker.model.request.ProcessingResponse;
import io.pivotal.mday.servicebroker.azuresentimentbroker.model.request.ServiceRequest;
import io.pivotal.mday.servicebroker.azuresentimentbroker.model.request.ServiceResponse;

@RequestMapping("/v2/service_instances")
@RestController
public class ServiceInstanceController {

	// Nothing is created for this service broker, so just return success
	@PutMapping("{instance_id}")
	public ResponseEntity<?> createService(@PathVariable("instance_id") String id,
			@Valid @RequestBody ServiceRequest request) {
		return new ResponseEntity<>(new ServiceResponse(), HttpStatus.CREATED);
	}

	// We don't actually create anything for this service broker, so we don't
	// delete anything either, just return success
	@DeleteMapping("{instance_id}")
	public ResponseEntity<?> deleteService(@PathVariable("instance_id") String id) {
		return new ResponseEntity<>(new ProcessingResponse("succeeded"), HttpStatus.GONE);
	}
}