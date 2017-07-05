package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetColorRequest implements Request<SetColorConfirmation> {
  @Override
  public MessageName getMessageName() {
    return MessageName.SET_COLOR_REQUEST;
  }
}
