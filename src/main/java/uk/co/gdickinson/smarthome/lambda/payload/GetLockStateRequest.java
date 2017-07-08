package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Appliance;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class GetLockStateRequest implements Request<GetLockStateResponse> {
  private Appliance appliance;

  public Appliance getAppliance() {
    return appliance;
  }

  public void setAppliance(Appliance appliance) {
    this.appliance = appliance;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.GET_LOCK_STATE_REQUEST;
  }
}
