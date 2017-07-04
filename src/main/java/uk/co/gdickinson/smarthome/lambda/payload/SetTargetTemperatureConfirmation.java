package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetTargetTemperatureConfirmation extends TemperatureChangeConfirmation {
  @Override
  public MessageName getMessageName() {
    return MessageName.SET_TARGET_TEMPERATURE_CONFIRMATION;
  }
}
