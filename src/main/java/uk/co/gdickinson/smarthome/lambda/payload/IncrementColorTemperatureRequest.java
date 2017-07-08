package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class IncrementColorTemperatureRequest extends DeltaColorTemperatureRequest<IncrementTargetTemperatureConfirmation> {
  @Override
  public MessageName getMessageName() {
    return MessageName.INCREMENT_COLOR_TEMPERATURE_REQUEST;
  }
}
