package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

// TODO
public class DecrementColorTemperatureRequest implements Request<DecrementColorTemperatureConfirmation> {
  @Override
  public MessageName getMessageName() {
    return MessageName.DECREMENT_COLOR_TEMPERATURE_REQUEST;
  }
}
