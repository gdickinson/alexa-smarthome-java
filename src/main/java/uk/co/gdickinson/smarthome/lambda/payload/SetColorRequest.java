package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Appliance;
import uk.co.gdickinson.smarthome.lambda.models.Color;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetColorRequest extends Request<SetColorConfirmation> {
  private Color color;
  private Appliance appliance;

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Appliance getAppliance() {
    return appliance;
  }

  public void setAppliance(Appliance appliance) {
    this.appliance = appliance;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.SET_COLOR_REQUEST;
  }
}
