package uk.co.gdickinson.smarthome.lambda.payload;


import uk.co.gdickinson.smarthome.lambda.models.Appliance;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class GetTargetTemperatureRequest implements Request<GetTargetTemperatureResponse> {
  private String accessToken;
  private Appliance appliance;

  @Override
  public MessageName getMessageName() {
    return MessageName.GET_TARGET_TEMPERATURE_REQUEST;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public Appliance getAppliance() {
    return appliance;
  }

  public void setAppliance(Appliance appliance) {
    this.appliance = appliance;
  }
}
