package uk.co.gdickinson.smarthome.lambda.models;

public class PreviousState {
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

  private Temperature targetTemperature;
  private TemperatureMode temperatureMode;
}
