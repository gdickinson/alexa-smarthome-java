package uk.co.gdickinson.smarthome.lambda.models;

public class TemperatureMode {
  public enum Mode {
    AUTO, COOL, HEAT, ECO, OFF, CUSTOM
  }

  public Mode getValue() {
    return value;
  }

  public void setValue(Mode value) {
    this.value = value;
  }

  private Mode value;
}
