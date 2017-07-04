package uk.co.gdickinson.smarthome.lambda.payload;


import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class DecrementTargetTemperatureConfirmation extends TemperatureChangeConfirmation {
  @Override
  public MessageName getMessageName() {
    return MessageName.DECREMENT_COLOR_TEMPERATURE_CONFIRMATION;
  }
}
