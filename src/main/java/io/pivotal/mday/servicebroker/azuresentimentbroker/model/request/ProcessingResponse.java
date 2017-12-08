package io.pivotal.mday.servicebroker.azuresentimentbroker.model.request;

import lombok.Data;

@Data
public class ProcessingResponse {
	private String state;
	private String description;

	public ProcessingResponse(String state) {
		this.state = state;
	}
}
