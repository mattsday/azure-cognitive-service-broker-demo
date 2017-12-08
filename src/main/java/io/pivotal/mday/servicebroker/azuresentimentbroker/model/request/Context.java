package io.pivotal.mday.servicebroker.azuresentimentbroker.model.request;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "platform", "some_field" })
public class Context {
	@Getter
	@JsonProperty("platform")
	private String platform;

	private Map<String, Object> properties = new HashMap<>();

	public Context() {
	}

	public Context(String platform, Map<String, Object> properties) {
		this.platform = platform;
		if (properties != null) {
			this.properties.putAll(properties);
		}
	}

	@JsonAnySetter
	private void setProperty(String key, Object value) {
		properties.put(key, value);
	}

	/**
	 * Get the value of a field in the request with the given key.
	 *
	 * @param key
	 *            the key of the value to retrieve
	 * @return the value of the field, or {@literal null} if the key is not
	 *         present in the request
	 */
	public Object getProperty(String key) {
		return properties.get(key);
	}
}