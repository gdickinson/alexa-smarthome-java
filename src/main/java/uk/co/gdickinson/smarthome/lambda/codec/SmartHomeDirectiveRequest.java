package uk.co.gdickinson.smarthome.lambda.codec;

import com.google.gson.JsonElement;
import uk.co.gdickinson.smarthome.lambda.payload.Header;

public class SmartHomeDirectiveRequest {
  private Header header;
  private JsonElement payload;

  public JsonElement getPayload() {
    return payload;
  }

  public void setPayload(JsonElement payload) {
    this.payload = payload;
  }

  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }
}
