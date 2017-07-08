package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Appliance;
import uk.co.gdickinson.smarthome.lambda.models.LockState;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetLockStateRequest implements Request<SetLockStateConfirmation> {
  private Appliance appliance;
  private LockState lockState;

  public Appliance getAppliance() {
    return appliance;
  }

  public void setAppliance(Appliance appliance) {
    this.appliance = appliance;
  }

  public LockState getLockState() {
    return lockState;
  }

  public void setLockState(LockState lockState) {
    this.lockState = lockState;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.SET_LOCK_STATE_REQUEST;
  }
}
