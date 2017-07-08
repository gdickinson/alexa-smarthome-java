package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetColorRequest extends Request<SetColorConfirmation> {
  @Override
  public MessageName getMessageName() {
    return MessageName.SET_COLOR_REQUEST;
  }
}
