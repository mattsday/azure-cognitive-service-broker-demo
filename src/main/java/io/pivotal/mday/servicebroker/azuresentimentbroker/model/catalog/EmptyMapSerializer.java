package io.pivotal.mday.servicebroker.azuresentimentbroker.model.catalog;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class EmptyMapSerializer extends JsonSerializer<List<?>> {
	public EmptyMapSerializer() {
	}

	@Override
	public void serialize(List<?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
		jgen.writeStartObject();
		jgen.writeEndObject();
	}
}