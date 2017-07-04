package uk.co.gdickinson.smarthome.lambda.models;

import java.util.List;
import java.util.Map;

public class Appliance {
  private List<ApplianceType> applianceTypes;
  private String applianceId;
  private String manufacturerName;
  private String modelName;
  private String version;
  private String friendlyName;
  private String friendlyDescription;
  private boolean isReachable;
  private List<Action> actions;
  private Map<String, String> additionalApplianceDetails;

  public List<ApplianceType> getApplianceTypes() {
    return applianceTypes;
  }

  public void setApplianceTypes(List<ApplianceType> applianceTypes) {
    this.applianceTypes = applianceTypes;
  }

  public String getApplianceId() {
    return applianceId;
  }

  public void setApplianceId(String applianceId) {
    this.applianceId = applianceId;
  }

  public String getManufacturerName() {
    return manufacturerName;
  }

  public void setManufacturerName(String manufacturerName) {
    this.manufacturerName = manufacturerName;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public String getFriendlyDescription() {
    return friendlyDescription;
  }

  public void setFriendlyDescription(String friendlyDescription) {
    this.friendlyDescription = friendlyDescription;
  }

  public boolean isReachable() {
    return isReachable;
  }

  public void setReachable(boolean reachable) {
    isReachable = reachable;
  }

  public List<Action> getActions() {
    return actions;
  }

  public void setActions(List<Action> actions) {
    this.actions = actions;
  }

  public Map<String, String> getAdditionalApplianceDetails() {
    return additionalApplianceDetails;
  }

  public void setAdditionalApplianceDetails(Map<String, String> additionalApplianceDetails) {
    this.additionalApplianceDetails = additionalApplianceDetails;
  }
}
