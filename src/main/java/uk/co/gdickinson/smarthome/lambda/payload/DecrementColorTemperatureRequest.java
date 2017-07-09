package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class DecrementColorTemperatureRequest extends DeltaColorTemperatureRequest<DecrementColorTemperatureConfirmation> {
  @Override
  public MessageName getMessageName() {
    return MessageName.DECREMENT_COLOR_TEMPERATURE_REQUEST;
  }
}
