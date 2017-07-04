package uk.co.gdickinson.smarthome.lambda.codec;

import uk.co.gdickinson.smarthome.lambda.payload.Payload;


public class SmartHomeDirectiveResponse {
  private Header header;
  private Payload payload;

  public Payload getPayload() {
    return payload;
  }

  public void setPayload(Payload payload) {
    this.payload = payload;
  }

  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }
}
