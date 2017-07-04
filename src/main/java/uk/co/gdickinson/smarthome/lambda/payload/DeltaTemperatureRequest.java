package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Appliance;
import uk.co.gdickinson.smarthome.lambda.models.Temperature;

public abstract class DeltaTemperatureRequest<R extends Response> implements Request<R> {
  private String accessToken;
  private Appliance appliance;
  private Temperature deltaTemperature;

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

  public Temperature getDeltaTemperature() {
    return deltaTemperature;
  }

  public void setDeltaTemperature(Temperature deltaTemperature) {
    this.deltaTemperature = deltaTemperature;
  }
}
