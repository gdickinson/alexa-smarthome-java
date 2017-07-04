package uk.co.gdickinson.smarthome.lambda.codec;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Serializes a {@link java.util.Date} into an ISO8601 formatted string (in UTC, per the standard), wrapped in a
 * {@link JsonPrimitive}.
 */
public class DateSerializer implements JsonSerializer<Date> {

  @Override
  public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'", Locale.ENGLISH);
    format.setTimeZone(TimeZone.getTimeZone("UTC"));
    return new JsonPrimitive(format.format(src));
  }
}
