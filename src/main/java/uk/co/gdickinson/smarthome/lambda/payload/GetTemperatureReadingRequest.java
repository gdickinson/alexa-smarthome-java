package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Appliance;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class GetTemperatureReadingRequest extends Request<GetTemperatureReadingResponse> {
  private Appliance appliance;

  @Override
  public MessageName getMessageName() {
    return MessageName.GET_TEMPERATURE_READING_REQUEST;
  }

  public Appliance getAppliance() {
    return appliance;
  }

  public void setAppliance(Appliance appliance) {
    this.appliance = appliance;
  }
}
