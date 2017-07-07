package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class GetLockStateRequest implements Request<GetLockStateResponse> {
  @Override
  public MessageName getMessageName() {
    return MessageName.GET_LOCK_STATE_REQUEST;
  }
}
