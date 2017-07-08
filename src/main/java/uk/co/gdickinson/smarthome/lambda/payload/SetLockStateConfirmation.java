package uk.co.gdickinson.smarthome.lambda.payload;


import uk.co.gdickinson.smarthome.lambda.models.LockState;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetLockStateConfirmation implements Response {
  private LockState lockState;

  public LockState getLockState() {
    return lockState;
  }

  public void setLockState(LockState lockState) {
    this.lockState = lockState;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.SET_LOCK_STATE_CONFIRMATION;
  }
}
