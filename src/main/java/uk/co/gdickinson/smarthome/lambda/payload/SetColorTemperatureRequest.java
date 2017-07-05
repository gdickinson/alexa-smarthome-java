package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetColorTemperatureRequest implements Request<SetColorTemperatureConfirmation> {
  @Override
  public MessageName getMessageName() {
    return MessageName.SET_COLOR_TEMPERATURE_REQUEST;
  }
}
