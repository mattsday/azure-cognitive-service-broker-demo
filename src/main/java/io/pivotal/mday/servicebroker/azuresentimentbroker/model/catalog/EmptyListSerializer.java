package io.pivotal.mday.servicebroker.azuresentimentbroker.model.catalog;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * This {@link JsonSerializer} can be used to serialize an empty array (e.g.
 * <code>{}</code>) into a JSON string instead of a <code>null</code> value for
 * collection and map types.
 *
 * Example: <code>
 *     {@literal @JsonSerialize(nullsUsing = EmptyListSerializer.class)}
 *     public List&lt;String&gt; strings;
 * </code>
 */
public class EmptyListSerializer extends JsonSerializer<List<?>> {
	public EmptyListSerializer() {
	}

	@Override
	public void serialize(List<?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
		jgen.writeStartArray();
		jgen.writeEndArray();
	}
}