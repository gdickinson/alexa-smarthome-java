package uk.co.gdickinson.smarthome.lambda.models;

import com.google.gson.annotations.SerializedName;

public enum Action {
  @SerializedName("decrementColorTemperature")
  DECREMENT_COLOR_TEMPERATURE("decrementColorTemperature"),

  @SerializedName("decrementPercentage")
  DECREMENT_PERCENTAGE("decrementPercentage"),

  @SerializedName("decrementTargetTemperature")
  DECREMENT_TARGET_TEMPERATURE("decrementTargetTemperature"),

  @SerializedName("getLockState")
  GET_LOCK_STATE("getLockState"),

  @SerializedName("getTargetTemperature")
  GET_TARGET_TEMPERATURE("getTargetTemperature"),

  @SerializedName("getTemperatureReading")
  GET_TEMPERATURE_READING("getTemperatureReading"),

  @SerializedName("incrementColorTemperature")
  INCREMENT_COLOR_TEMPERATURE("incrementColorTemperature"),

  @SerializedName("incrementPercentage")
  INCREMENT_PERCENTAGE("incrementPercentage"),

  @SerializedName("incrementTargetTemperature")
  INCREMENT_TARGET_TEMPERATURE("incrementTargetTemperature"),

  @SerializedName("setTargetTemperature")
  SET_TARGET_TEMPERATURE("setTargetTemperature"),

  @SerializedName("setColor")
  SET_COLOR("setColor"),

  @SerializedName("setColorTemperature")
  SET_COLOR_TEMPERATURE("setColorTemperature"),

  @SerializedName("setLockState")
  SET_LOCK_STATE("setLockState"),

  @SerializedName("turnOff")
  TURN_OFF("turnOff"),

  @SerializedName("TurnOn")
  TURN_ON("turnOn");

  private final String stringValue;

  private Action(String stringValue) {
    this.stringValue = stringValue;
  }

  @Override
  public String toString() {
    return this.stringValue;
  }
}
