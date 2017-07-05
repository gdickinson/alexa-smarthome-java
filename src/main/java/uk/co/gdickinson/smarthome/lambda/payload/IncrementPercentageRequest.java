package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class IncrementPercentageRequest implements Request<IncrementPercentageConfirmation> {
  @Override
  public MessageName getMessageName() {
    return MessageName.INCREMENT_PERCENTAGE_REQUEST;
  }
}
