package uk.co.gdickinson.smarthome.lambda.models;

public class Temperature {
  private Scale scale;
  private float value;

  public float getValue() {
    return value;
  }

  public void setValue(float value) {
    this.value = value;
  }

  public Scale getScale() {
    return scale;
  }

  public void setScale(Scale scale) {
    this.scale = scale;
  }
}
