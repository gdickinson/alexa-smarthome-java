package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.LockState;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

import java.util.Date;

public class GetLockStateResponse implements Response {
  private LockState lockState;
  private Date applianceResponseTimestamp;

  public LockState getLockState() {
    return lockState;
  }

  public void setLockState(LockState lockState) {
    this.lockState = lockState;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.GET_LOCK_STATE_RESPONSE;
  }
}
