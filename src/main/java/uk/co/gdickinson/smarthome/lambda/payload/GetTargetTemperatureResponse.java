package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.models.Temperature;
import uk.co.gdickinson.smarthome.lambda.models.TemperatureMode;

import java.util.Date;

public class GetTargetTemperatureResponse implements Response {
  private Temperature targetTemperature;
  private Temperature heatingTargetTemperature;
  private Temperature coolingTargetTemperature;
  private TemperatureMode temperatureMode;
  private String friendlyName;
  private Date applianceResponseTimestamp;

  @Override
  public MessageName getMessageName() {
    return MessageName.GET_TARGET_TEMPERATURE_RESPONSE;
  }

  public Temperature getTargetTemperature() {
    return targetTemperature;
  }

  public void setTargetTemperature(Temperature targetTemperature) {
    this.targetTemperature = targetTemperature;
  }

  public Temperature getHeatingTargetTemperature() {
    return heatingTargetTemperature;
  }

  public void setHeatingTargetTemperature(Temperature heatingTargetTemperature) {
    this.heatingTargetTemperature = heatingTargetTemperature;
  }

  public Temperature getCoolingTargetTemperature() {
    return coolingTargetTemperature;
  }

  public void setCoolingTargetTemperature(Temperature coolingTargetTemperature) {
    this.coolingTargetTemperature = coolingTargetTemperature;
  }

  public TemperatureMode getTemperatureMode() {
    return temperatureMode;
  }

  public void setTemperatureMode(TemperatureMode temperatureMode) {
    this.temperatureMode = temperatureMode;
  }

  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public Date getApplianceResponseTimestamp() {
    return applianceResponseTimestamp;
  }

  public void setApplianceResponseTimestamp(Date applianceResponseTimestamp) {
    this.applianceResponseTimestamp = applianceResponseTimestamp;
  }
}

