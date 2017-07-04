package uk.co.gdickinson.smarthome.lambda.codec;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class SmartHomeDirectiveDeserializer implements JsonDeserializer<SmartHomeDirectiveRequest> {

  public SmartHomeDirectiveRequest deserialize(
    JsonElement jsonElement,
    Type type,
    JsonDeserializationContext jsonDeserializationContext
  ) throws JsonParseException {

    Header header = jsonDeserializationContext
      .deserialize(jsonElement.getAsJsonObject().get("header"), Header.class);

    SmartHomeDirectiveRequest directive = new SmartHomeDirectiveRequest();
    directive.setHeader(header);

    directive.setPayload(jsonElement.getAsJsonObject().get("payload"));
    return directive;
  }
}
