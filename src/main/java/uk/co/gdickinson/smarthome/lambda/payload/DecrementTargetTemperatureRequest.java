package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class DecrementTargetTemperatureRequest extends DeltaTemperatureRequest<DecrementTargetTemperatureConfirmation> {
  @Override
  public MessageName getMessageName() {
    return MessageName.DECREMENT_TARGET_TEMPERATURE_REQUEST;
  }
}
