package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class GetLockStateResponse implements Response {
  @Override
  public MessageName getMessageName() {
    return MessageName.GET_LOCK_STATE_RESPONSE;
  }
}
