package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class DiscoverAppliancesRequest implements Request<DiscoverAppliancesResponse> {
  private String accessToken;

  @Override
  public MessageName getMessageName() {
    return MessageName.DISCOVER_APPLIANCES_REQUEST;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }
}
