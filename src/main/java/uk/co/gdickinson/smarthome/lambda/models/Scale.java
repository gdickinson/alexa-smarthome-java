package uk.co.gdickinson.smarthome.lambda.models;

import com.google.gson.annotations.SerializedName;

public enum Scale {
  @SerializedName("CELSIUS")
  CELSIUS,

  @SerializedName("FAHRENHEIT")
  FAHRENHEIT
}
