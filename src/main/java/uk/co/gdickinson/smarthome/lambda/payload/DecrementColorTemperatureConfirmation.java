package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

// TODO
public class DecrementColorTemperatureConfirmation implements Response {
  @Override
  public MessageName getMessageName() {
    return MessageName.DECREMENT_COLOR_TEMPERATURE_CONFIRMATION;
  }
}
