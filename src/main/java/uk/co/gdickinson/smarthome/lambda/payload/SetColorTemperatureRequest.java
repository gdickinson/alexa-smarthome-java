package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Appliance;
import uk.co.gdickinson.smarthome.lambda.models.ColorTemperature;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

/**
 * Request to change the color temperature of the specified device change to a specified setting.
 * The following table lists some possible color temperature requests and related values that the Smart Home Skill API
 * would send. If your lighting device does not support the requested value, its recommended that you set your device
 * to the nearest possible value.
 *
 * Shades of White           colorTemperature value (in degrees Kelvin)
 *
 * warm, warm white          2200
 * incandescent, soft white  2700
 * white	                   4000
 * daylight, daylight white  5500
 * cool, cool white          7000
 *
 * Expect only Appliance.applianceId and Appliance.additionalApplianceDetails to be set.
 */
public class SetColorTemperatureRequest implements Request<SetColorTemperatureConfirmation> {
  private Appliance appliance;
  private ColorTemperature colorTemperature;

  public Appliance getAppliance() {
    return appliance;
  }

  public void setAppliance(Appliance appliance) {
    this.appliance = appliance;
  }

  public ColorTemperature getColorTemperature() {
    return colorTemperature;
  }

  public void setColorTemperature(ColorTemperature colorTemperature) {
    this.colorTemperature = colorTemperature;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.SET_COLOR_TEMPERATURE_REQUEST;
  }
}
