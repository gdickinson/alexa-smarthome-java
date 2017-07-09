package uk.co.gdickinson.smarthome.lambda.handler;

import com.google.gson.Gson;
import org.junit.Test;
import uk.co.gdickinson.smarthome.lambda.codec.SmartHomeDirectiveRequest;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.models.Namespace;
import uk.co.gdickinson.smarthome.lambda.payload.GetTemperatureReadingRequest;
import uk.co.gdickinson.smarthome.lambda.payload.GetTemperatureReadingResponse;
import uk.co.gdickinson.smarthome.lambda.payload.Header;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Date;

public class SmartHomeDirectiveHandlerTest {
  private static Gson gson = new Gson();
  private static GetTemperatureReadingRequest TEST_REQUEST = new GetTemperatureReadingRequest();
  private static GetTemperatureReadingResponse TEST_RESPONSE = new GetTemperatureReadingResponse();

  private static RequestHandler<GetTemperatureReadingRequest, GetTemperatureReadingResponse> REQUEST_HANDLER = new RequestHandler<GetTemperatureReadingRequest, GetTemperatureReadingResponse>() {
    @Override
    public GetTemperatureReadingResponse handle(GetTemperatureReadingRequest request) throws Exception {
      TEST_RESPONSE.setTimestamp(new Date());
      return TEST_RESPONSE;
    }
  };

  private static SmartHomeDirectiveHandler smartHomeDirectiveHandler = new SmartHomeDirectiveHandler() {
    @Override
    protected void init() {
      this.registerHandler(MessageName.GET_TEMPERATURE_READING_REQUEST, REQUEST_HANDLER);
    }
  };

  @Test
  public void handleRequestSuccessfully() throws Exception {

    SmartHomeDirectiveRequest req = new SmartHomeDirectiveRequest();
    Header header = new Header();
    header.setName(MessageName.GET_TEMPERATURE_READING_REQUEST);
    header.setNamespace(Namespace.CONTROL);
    header.setPayloadVersion("version");
    header.setMessageId("messageId");
    req.setHeader(header);
    req.setPayload(gson.toJsonTree(TEST_REQUEST, GetTemperatureReadingRequest.class));
    byte[] requestBytes = gson.toJson(req).getBytes();

    InputStream in = new ByteArrayInputStream(requestBytes);
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    smartHomeDirectiveHandler.handleRequest(in, out, null);
    // For now, let's just check this doesn't throw.
  }
}