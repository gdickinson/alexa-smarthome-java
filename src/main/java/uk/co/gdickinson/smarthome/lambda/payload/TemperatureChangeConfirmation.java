package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.PreviousState;
import uk.co.gdickinson.smarthome.lambda.models.Temperature;
import uk.co.gdickinson.smarthome.lambda.models.TemperatureMode;

public abstract class TemperatureChangeConfirmation implements Response {
  private Temperature targetTemperature;
  private TemperatureMode temperatureMode;
  private PreviousState previousState;

  public Temperature getTargetTemperature() {
    return targetTemperature;
  }

  public void setTargetTemperature(Temperature targetTemperature) {
    this.targetTemperature = targetTemperature;
  }

  public TemperatureMode getTemperatureMode() {
    return temperatureMode;
  }

  public void setTemperatureMode(TemperatureMode temperatureMode) {
    this.temperatureMode = temperatureMode;
  }

  public PreviousState getPreviousState() {
    return previousState;
  }

  public void setPreviousState(PreviousState previousState) {
    this.previousState = previousState;
  }
}
