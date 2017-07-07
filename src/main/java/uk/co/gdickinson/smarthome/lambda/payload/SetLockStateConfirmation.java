package uk.co.gdickinson.smarthome.lambda.payload;


import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetLockStateConfirmation implements Response {
  @Override
  public MessageName getMessageName() {
    return MessageName.SET_LOCK_STATE_CONFIRMATION;
  }
}
