package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Appliance;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetPercentageRequest implements Request<SetPercentageConfirmation> {
  private Appliance appliance;
  private Float percentageState;

  public Appliance getAppliance() {
    return appliance;
  }

  public void setAppliance(Appliance appliance) {
    this.appliance = appliance;
  }

  public Float getPercentageState() {
    return percentageState;
  }

  public void setPercentageState(Float percentageState) {
    this.percentageState = percentageState;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.SET_PERCENTAGE_REQUEST;
  }
}
