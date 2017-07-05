package uk.co.gdickinson.smarthome.lambda.models;

import com.google.gson.annotations.SerializedName;
import uk.co.gdickinson.smarthome.lambda.payload.*;

import java.lang.reflect.Type;

public enum MessageName {

  @SerializedName("DecrementTargetTemperatureRequest")
  DECREMENT_TARGET_TEMPERATURE_REQUEST(DecrementTargetTemperatureRequest.class),

  @SerializedName("DecrementTargetTemperatureConfirmation")
  DECREMENT_TARGET_TEMPERATURE_CONFIRMATION(DecrementTargetTemperatureConfirmation.class),

  @SerializedName("DiscoverAppliancesRequest")
  DISCOVER_APPLIANCES_REQUEST(DiscoverAppliancesRequest.class),

  @SerializedName("DiscoverAppliancesResponse")
  DISCOVER_APPLIANCES_RESPONSE(DiscoverAppliancesResponse.class),

  @SerializedName("DecrementColorTemperatureRequest")
  DECREMENT_COLOR_TEMPERATURE_REQUEST(DecrementColorTemperatureRequest.class),

  @SerializedName("DecrementColorTemperatureConfirmation")
  DECREMENT_COLOR_TEMPERATURE_CONFIRMATION(DecrementColorTemperatureConfirmation.class),

  @SerializedName("DecrementPercentageRequest")
  DECREMENT_PERCENTAGE_REQUEST(DecrementPercentageRequest.class),

  @SerializedName("DecrementPercentageConfirmation")
  DECREMENT_PERCENTAGE_CONFIRMATION(DecrementPercentageConfirmation.class),

  @SerializedName("IncrementColorTemperatureRequest")
  INCREMENT_COLOR_TEMPERATURE_REQUEST(IncrementColorTemperatureRequest.class),

  @SerializedName("IncrementColorTemperatureConfirmation")
  INCREMENT_COLOR_TEMPERATURE_CONFIRMATION(IncrementColorTemperatureConfirmation.class),

  @SerializedName("IncrementPercentageRequest")
  INCREMENT_PERCENTAGE_REQUEST(IncrementPercentageRequest.class),

  @SerializedName("IncrementPercentageConfirmation")
  INCREMENT_PERCENTAGE_CONFIRMATION(IncrementPercentageConfirmation.class),

  @SerializedName("IncrementTargetTemperatureRequest")
  INCREMENT_TARGET_TEMPERATURE_REQUEST(IncrementTargetTemperatureRequest.class),

  @SerializedName("IncrementTargetTemperatureConfirmation")
  INCREMENT_TARGET_TEMPERATURE_CONFIRMATION(IncrementTargetTemperatureConfirmation.class),

  @SerializedName("SetColorRequest")
  SET_COLOR_REQUEST(SetColorRequest.class),

  @SerializedName("SetColorConfirmation")
  SET_COLOR_CONFIRMATION(SetColorConfirmation.class),

  @SerializedName("SetColorTemperatureRequest")
  SET_COLOR_TEMPERATURE_REQUEST(SetColorTemperatureRequest.class),

  @SerializedName("SetColorTemperatureConfirmation")
  SET_COLOR_TEMPERATURE_CONFIRMATION(SetColorTemperatureConfirmation.class),

  @SerializedName("SetLockStateRequest")
  SET_LOCK_STATE_REQUEST(SetLockStateRequest.class),

  @SerializedName("SetLockStateConfirmation")
  SET_LOCK_STATE_CONFIRMATION(SetLockStateConfirmation.class),

  @SerializedName("SetPercentageRequest")
  SET_PERCENTAGE_REQUEST(SetPercentageRequest.class),

  @SerializedName("SetPercentageConfirmation")
  SET_PERCENTAGE_CONFIRMATION(SetPercentageConfirmation.class),

  @SerializedName("SetTargetTemperatureRequest")
  SET_TARGET_TEMPERATURE_REQUEST(SetTargetTemperatureRequest.class),

  @SerializedName("SetTargetTemperatureConfirmation")
  SET_TARGET_TEMPERATURE_CONFIRMATION(SetTargetTemperatureConfirmation.class),

  @SerializedName("TurnOnRequest")
  TURN_ON_REQUEST(TurnOnRequest.class),

  @SerializedName("TurnOnConfirmation")
  TURN_ON_CONFIRMATION(TurnOnConfirmation.class),

  @SerializedName("TurnOffRequest")
  TURN_OFF_REQUEST(TurnOffRequest.class),

  @SerializedName("TurnOffConfirmation")
  TURN_OFF_CONFIRMATION(TurnOffConfirmation.class),

  @SerializedName("GetLockStateRequest")
  GET_LOCK_STATE_REQUEST(GetLockStateRequest.class),

  @SerializedName("GetLockStateResponse")
  GET_LOCK_STATE_RESPONSE(GetLockStateResponse.class),

  @SerializedName("GetTargetTemperatureRequest")
  GET_TARGET_TEMPERATURE_REQUEST(GetTargetTemperatureRequest.class),

  @SerializedName("GetTargetTemperatureResponse")
  GET_TARGET_TEMPERATURE_RESPONSE(GetTargetTemperatureResponse.class),

  @SerializedName("GetTemperatureReadingRequest")
  GET_TEMPERATURE_READING_REQUEST(GetTemperatureReadingRequest.class),

  @SerializedName("GetTemperatureReadingResponse")
  GET_TEMPERATURE_READING_RESPONSE(GetTemperatureReadingResponse.class),

  @SerializedName("RetrieveCameraStreamUriRequest")
  RETRIEVE_CAMERA_STREAM_URI_REQUEST(RetrieveCameraStreamUriRequest.class),

  @SerializedName("RetrieveCameraStreamUriResponse")
  RETRIEVE_CAMERA_STREAM_URI_RESPONSE(RetrieveCameraStreamUriResponse.class);

  public Type getDeserializationType() {
    return deserializationType;
  }

  private final Type deserializationType;

  MessageName(Type deserializationType) {
    this.deserializationType = deserializationType;
  }
}
