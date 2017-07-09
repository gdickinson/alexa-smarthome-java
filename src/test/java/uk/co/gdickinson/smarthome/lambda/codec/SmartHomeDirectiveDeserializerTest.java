package uk.co.gdickinson.smarthome.lambda.codec;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.junit.Test;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.models.Namespace;
import uk.co.gdickinson.smarthome.lambda.payload.Header;

import static org.junit.Assert.*;

public class SmartHomeDirectiveDeserializerTest {
  private static String TEST_DIRECTIVE_JSON = "{\n"+
    "    \"header\": {\n"+
    "        \"messageId\": \"6d6d6e14-8aee-473e-8c24-0d31ff9c17a2\",\n"+
    "        \"name\": \"DiscoverAppliancesRequest\",\n"+
    "        \"namespace\": \"Alexa.ConnectedHome.Discovery\",\n"+
    "        \"payloadVersion\": \"2\"\n"+
    "    },\n"+
    "    \"payload\": {\n"+
    "        \"accessToken\": \"TOKEN\"\n"+
    "    }\n"+
    "}";

  @Test
  public void testDeserialize() throws Exception {
    SmartHomeDirectiveDeserializer deserializer = new SmartHomeDirectiveDeserializer();
    GsonBuilder builder = new GsonBuilder();
    builder.registerTypeAdapter(SmartHomeDirectiveRequest.class, deserializer);
    Gson gson = builder.create();
    SmartHomeDirectiveRequest req = gson.fromJson(TEST_DIRECTIVE_JSON, SmartHomeDirectiveRequest.class);
    Header requestHeader = req.getHeader();
    assertEquals("6d6d6e14-8aee-473e-8c24-0d31ff9c17a2", requestHeader.getMessageId());
    assertEquals(MessageName.DISCOVER_APPLIANCES_REQUEST, requestHeader.getName());
    assertEquals(Namespace.DISCOVERY, requestHeader.getNamespace());
    assertEquals("2", requestHeader.getPayloadVersion());
    assertNotNull(req.getPayload());
  }
}