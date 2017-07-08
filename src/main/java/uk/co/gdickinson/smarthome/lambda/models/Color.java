package uk.co.gdickinson.smarthome.lambda.models;

public class Color {
  private Double hue;
  private Double brightness;
  private Double saturation;

  public Double getHue() {
    return hue;
  }

  public void setHue(Double hue) {
    if (hue < 0 || hue > 360.0) {
      throw new IllegalArgumentException("Hue must be between 0 and 360, inclusive");
    }
    this.hue = hue;
  }

  public Double getBrightness() {
    return brightness;
  }

  public void setBrightness(Double brightness) {
    if (brightness < 0 || brightness > 1.0) {
      throw new IllegalArgumentException("Brightness must be between 0 and 1 inclusive");
    }
    this.brightness = brightness;
  }

  public Double getSaturation() {
    return saturation;
  }

  public void setSaturation(Double saturation) {
    if (saturation < 0 || saturation > 1.0) {
      throw new IllegalArgumentException("Saturation must be between 0 and 1, inclusive");
    }
    this.saturation = saturation;
  }
}
