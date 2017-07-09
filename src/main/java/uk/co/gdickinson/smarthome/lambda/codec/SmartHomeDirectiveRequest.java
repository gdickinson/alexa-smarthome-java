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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    SmartHomeDirectiveRequest that = (SmartHomeDirectiveRequest) o;

    if (!getHeader().equals(that.getHeader())) return false;
    return getPayload().equals(that.getPayload());
  }

  @Override
  public int hashCode() {
    int result = getHeader().hashCode();
    result = 31 * result + getPayload().hashCode();
    return result;
  }
}
