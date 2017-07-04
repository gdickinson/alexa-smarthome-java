package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class IncrementTargetTemperatureRequest extends DeltaTemperatureRequest<IncrementTargetTemperatureConfirmation> {
  @Override
  public MessageName getMessageName() {
    return MessageName.INCREMENT_TARGET_TEMPERATURE_REQUEST;
  }
}
