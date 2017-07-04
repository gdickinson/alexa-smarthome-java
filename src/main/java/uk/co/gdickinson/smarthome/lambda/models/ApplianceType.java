package uk.co.gdickinson.smarthome.lambda.models;

import com.google.gson.annotations.SerializedName;

public enum ApplianceType {
  @SerializedName("CAMERA")
  CAMERA,

  @SerializedName("LIGHT")
  LIGHT,

  @SerializedName("SMARTLOCK")
  SMARTLOCK,

  @SerializedName("SMARTPLUG")
  SMARTPLUG,

  @SerializedName("SWITCH")
  SWITCH,

  @SerializedName("THERMOSTAT")
  THERMOSTAT,

  @SerializedName("ACTIVITY_TRIGGER")
  ACTIVITY_TRIGGER,

  @SerializedName("SCENE_TRIGGER")
  SCENE_TRIGGER
}
