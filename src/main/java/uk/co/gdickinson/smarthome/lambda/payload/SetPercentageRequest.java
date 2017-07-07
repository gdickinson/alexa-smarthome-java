package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetPercentageRequest implements Request<SetPercentageConfirmation> {
  @Override
  public MessageName getMessageName() {
    return MessageName.SET_PERCENTAGE_REQUEST;
  }
}
