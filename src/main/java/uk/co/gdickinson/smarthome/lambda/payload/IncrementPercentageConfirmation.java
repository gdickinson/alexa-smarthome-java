package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class IncrementPercentageConfirmation implements Response {
  @Override
  public MessageName getMessageName() {
    return MessageName.INCREMENT_PERCENTAGE_CONFIRMATION;
  }
}
