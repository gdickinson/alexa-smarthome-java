package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class IncrementColorTemperatureConfirmation extends ColorTemperatureChangeConfirmation {
  @Override
  public MessageName getMessageName() {
    return MessageName.INCREMENT_TARGET_TEMPERATURE_CONFIRMATION;
  }
}
