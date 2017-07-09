package uk.co.gdickinson.smarthome.lambda.payload;

public abstract class Request<R extends Response> implements Payload {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }
}
