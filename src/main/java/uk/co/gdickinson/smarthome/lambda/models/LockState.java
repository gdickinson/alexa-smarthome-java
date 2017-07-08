package uk.co.gdickinson.smarthome.lambda.models;

import com.google.gson.annotations.SerializedName;

public enum LockState {
  @SerializedName("LOCKED")
  LOCKED,

  @SerializedName("UNLOCKED")
  UNLOCKED;
}
