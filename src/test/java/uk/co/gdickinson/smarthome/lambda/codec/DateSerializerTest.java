package uk.co.gdickinson.smarthome.lambda.codec;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class DateSerializerTest {
  @Test
  public void testSerialize() throws Exception {
    Date date = new Date(1234567890000L);
    DateSerializer serializer = new DateSerializer();
    JsonElement element = serializer.serialize(date, Date.class, null);
    String expectedString = "2009-02-13T23:31Z";
    JsonPrimitive expectedPrimitive = new JsonPrimitive(expectedString);
    assertEquals(expectedPrimitive, element);
  }
}