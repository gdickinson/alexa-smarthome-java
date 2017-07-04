package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class TurnOnConfirmation implements Response {
  @Override
  public MessageName getMessageName() {
    return MessageName.TURN_ON_CONFIRMATION;
  }
}
