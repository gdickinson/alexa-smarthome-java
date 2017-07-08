package uk.co.gdickinson.smarthome.lambda.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import uk.co.gdickinson.smarthome.lambda.payload.Header;
import uk.co.gdickinson.smarthome.lambda.codec.PayloadDeserializer;
import uk.co.gdickinson.smarthome.lambda.codec.SmartHomeDirectiveRequest;
import uk.co.gdickinson.smarthome.lambda.codec.SmartHomeDirectiveResponse;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.payload.Request;
import uk.co.gdickinson.smarthome.lambda.payload.Response;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public abstract class SmartHomeDirectiveHandler implements RequestStreamHandler {
  private static Gson gson = new Gson();
  private static HandlerFactory factory = new HandlerFactory();

  protected <Req extends Request<Res>, Res extends Response> void registerHandler(
    MessageName name,
    RequestHandler<Req, Res> handler
  ) {
    factory.registerHandler(name, handler);
  }

  abstract protected void init();

  protected SmartHomeDirectiveHandler() {
    this.init();
  }

  public final void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
    JsonReader reader = new JsonReader(new InputStreamReader(inputStream));
    SmartHomeDirectiveRequest request = gson.fromJson(reader, SmartHomeDirectiveRequest.class);
    RequestHandler handler = factory.getHandler(request.getHeader().getName());
    Request req = PayloadDeserializer.deserializePayload(request);
    Response responsePayload;

    try {
      responsePayload = handler.handle(req);
    } catch (Exception e) {
      throw new IOException(e);
    }

    SmartHomeDirectiveResponse response = new SmartHomeDirectiveResponse();

    Header responseHeader = new Header();
    responseHeader.setName(responsePayload.getMessageName());

    response.setPayload(responsePayload);
  }
}
