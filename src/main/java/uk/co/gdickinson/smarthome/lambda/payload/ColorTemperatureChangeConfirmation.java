package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.AchievedState;
import uk.co.gdickinson.smarthome.lambda.models.Appliance;

abstract class ColorTemperatureChangeConfirmation implements Response {
  private AchievedState achievedState;
  private Appliance appliance;

  public AchievedState getAchievedState() {
    return achievedState;
  }

  public void setAchievedState(AchievedState achievedState) {
    this.achievedState = achievedState;
  }

  public Appliance getAppliance() {
    return appliance;
  }

  public void setAppliance(Appliance appliance) {
    this.appliance = appliance;
  }
}
