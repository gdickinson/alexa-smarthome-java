package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetPercentageConfirmation implements Response {
  @Override
  public MessageName getMessageName() {
    return MessageName.SET_PERCENTAGE_CONFIRMATION;
  }
}
