package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Appliance;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.models.Temperature;

public class SetTargetTemperatureRequest extends Request<SetTargetTemperatureConfirmation> {
  private Appliance appliance;
  private Temperature targetTemperature;

  @Override
  public MessageName getMessageName() {
    return MessageName.SET_TARGET_TEMPERATURE_REQUEST;
  }

  public Appliance getAppliance() {
    return appliance;
  }

  public void setAppliance(Appliance appliance) {
    this.appliance = appliance;
  }

  public Temperature getTargetTemperature() {
    return targetTemperature;
  }

  public void setTargetTemperature(Temperature targetTemperature) {
    this.targetTemperature = targetTemperature;
  }
}
