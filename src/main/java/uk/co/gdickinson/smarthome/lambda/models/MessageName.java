package uk.co.gdickinson.smarthome.lambda.models;

import com.google.gson.annotations.SerializedName;

public enum MessageName {
  @SerializedName("DecrementTargetTemperatureRequest")
  DECREMENT_TARGET_TEMPERATURE_REQUEST("DecrementTargetTemperatureRequest"),

  @SerializedName("DecrementTargetTemperatureResponse")
  DECREMENT_TARGET_TEMPERATURE_RESPONSE("DecrementTargetTemperatureRequest"),

  @SerializedName("DiscoverAppliancesRequest")
  DISCOVER_APPLIANCES_REQUEST("DiscoverAppliancesRequest"),

  @SerializedName("DiscoverAppliancesResponse")
  DISCOVER_APPLIANCES_RESPONSE("DiscoverAppliancesResponse"),

  @SerializedName("DecrementColorTemperatureRequest")
  DECREMENT_COLOR_TEMPERATURE_REQUEST("DecrementColorTemperatureRequest"),

  @SerializedName("DecrementColorTemperatureConfirmation")
  DECREMENT_COLOR_TEMPERATURE_CONFIRMATION("DecrementColorTemperatureConfirmation"),

  @SerializedName("DecrementPercentageRequest")
  DECREMENT_PERCENTAGE_REQUEST("DecrementPercentageRequest"),

  @SerializedName("DecrementPercentageConfirmation")
  DECREMENT_PERCENTAGE_CONFIRMATION("DecrementPercentageConfirmation"),

  @SerializedName("IncrementColorTemperatureRequest")
  INCREMENT_COLOR_TEMPERATURE_REQUEST("IncrementColorTemperatureRequest"),

  @SerializedName("IncrementColorTemperatureConfirmation")
  INCREMENT_COLOR_TEMPERATURE_CONFIRMATION("IncrementColorTemperatureConfirmation"),

  @SerializedName("IncrementPercentageRequest")
  INCREMENT_PERCENTAGE_REQUEST("IncrementPercentageRequest"),

  @SerializedName("IncrementPercentageConfirmation")
  INCREMENT_PERCENTAGE_CONFIRMATION("IncrementPercentageConfirmation"),

  @SerializedName("IncrementTargetTemperatureRequest")
  INCREMENT_TARGET_TEMPERATURE_REQUEST("IncrementTargetTemperatureRequest"),

  @SerializedName("IncrementTargetTemperatureConfirmation")
  INCREMENT_TARGET_TEMPERATURE_CONFIRMATION("IncrementTargetTemperatureConfirmation"),

  @SerializedName("SetColorRequest")
  SET_COLOR_REQUEST("SetColorRequest"),

  @SerializedName("SetColorConfirmation")
  SET_COLOR_CONFIRMATION("SetColorConfirmation"),

  @SerializedName("SetColorTemperatureRequest")
  SET_COLOR_TEMPERATURE_REQUEST("SetColorTemperatureRequest"),

  @SerializedName("SetColorTemperatureConfirmation")
  SET_COLOR_TEMPERATURE_CONFIRMATION("SetColorTemperatureConfirmation"),

  @SerializedName("SetLockStateRequest")
  SET_LOCK_STATE_REQUEST("SetLockStateRequest"),

  @SerializedName("SetLockStateConfirmation")
  SET_LOCK_STATE_CONFIRMATION("SetLockStateConfirmation"),

  @SerializedName("SetPercentageRequest")
  SET_PERCENTAGE_REQUEST("SetPercentageRequest"),

  @SerializedName("SetPercentageConfirmation")
  SET_PERCENTAGE_CONFIRMATION("SetPercentageConfirmation"),

  @SerializedName("SetTargetTemperatureRequest")
  SET_TARGET_TEMPERATURE_REQUEST("SetTargetTemperatureRequest"),

  @SerializedName("SetTargetTemperatureConfirmation")
  SET_TARGET_TEMPERATURE_CONFIRMATION("SetTargetTemperatureConfirmation"),

  @SerializedName("TurnOnRequest")
  TURN_ON_REQUEST("TurnOnRequest"),

  @SerializedName("TurnOnConfirmation")
  TURN_ON_CONFIRMATION("TurnOnConfirmation"),

  @SerializedName("TurnOffRequest")
  TURN_OFF_REQUEST("TurnOffRequest"),

  @SerializedName("TurnOffConfirmation")
  TURN_OFF_CONFIRMATION("TurnOffConfirmation"),

  @SerializedName("GetLockStateRequest")
  GET_LOCK_STATE_REQUEST("GetLockStateRequest"),

  @SerializedName("GetLockStateResponse")
  GET_LOCK_STATE_RESPONSE("GetLockStateResponse"),

  @SerializedName("GetTargetTemperatureRequest")
  GET_TARGET_TEMPERATURE_REQUEST("GetTargetTemperatureRequest"),

  @SerializedName("GetTargetTemperatureResponse")
  GET_TARGET_TEMPERATURE_RESPONSE("GetTargetTemperatureResponse"),

  @SerializedName("GetTemperatureReadingRequest")
  GET_TEMPERATURE_READING_REQUEST("GetTemperatureReadingRequest"),

  @SerializedName("GetTemperatureReadingResponse")
  GET_TEMPERATURE_READING_RESPONSE("GetTemperatureReadingResponse"),

  @SerializedName("RetrieveCameraStreamUriRequest")
  RETRIEVE_CAMERA_STREAM_URI_REQUEST("RetrieveCameraStreamUriRequest"),

  @SerializedName("RetrieveCameraStreamUriResponse")
  RETRIEVE_CAMERA_STREAM_URI_RESPONSE("RetrieveCameraStreamUriResponse");

  private final String stringValue;

  private MessageName(String stringValue) {
    this.stringValue = stringValue;
  }

  @Override
  public String toString() {
    return this.stringValue;
  }
}
