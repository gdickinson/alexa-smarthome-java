package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class IncrementColorTemperatureConfirmation implements Response {
  @Override
  public MessageName getMessageName() {
    return MessageName.INCREMENT_TARGET_TEMPERATURE_CONFIRMATION;
  }
}
