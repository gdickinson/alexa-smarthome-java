package uk.co.gdickinson.smarthome.lambda.models;

public class ColorTemperature {
  /**
   * An integer that indicates the color temperature setting after the decrease, in Kelvin degrees.
   * Valid range is 1000 to 10000, inclusive.
   */
  private Integer value;

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }
}
