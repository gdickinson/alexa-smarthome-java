package uk.co.gdickinson.smarthome.lambda.codec;

import com.google.gson.Gson;
import uk.co.gdickinson.smarthome.lambda.payload.Request;
import uk.co.gdickinson.smarthome.lambda.payload.Response;

public class PayloadDeserializer {
  private static Gson gson = new Gson();

  public static <T extends Request<R>, R extends Response> T deserializePayload(SmartHomeDirectiveRequest request) {
    return gson.fromJson(request.getPayload(), request.getHeader().getName().getDeserializationType());
  }
}
