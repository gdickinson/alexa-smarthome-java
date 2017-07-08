package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Appliance;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class IncrementPercentageRequest implements Request<IncrementPercentageConfirmation> {
  private Appliance appliance;
  private Float deltaPercentage;

  public Appliance getAppliance() {
    return appliance;
  }

  public void setAppliance(Appliance appliance) {
    this.appliance = appliance;
  }

  public Float getDeltaPercentage() {
    return deltaPercentage;
  }

  public void setDeltaPercentage(Float deltaPercentage) {
    this.deltaPercentage = deltaPercentage;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.INCREMENT_PERCENTAGE_REQUEST;
  }
}
