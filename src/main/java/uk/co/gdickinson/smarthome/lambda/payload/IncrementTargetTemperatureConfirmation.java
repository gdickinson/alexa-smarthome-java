package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class IncrementTargetTemperatureConfirmation extends TemperatureChangeConfirmation {
  @Override
  public MessageName getMessageName() {
    return MessageName.INCREMENT_TARGET_TEMPERATURE_CONFIRMATION;
  }
}
