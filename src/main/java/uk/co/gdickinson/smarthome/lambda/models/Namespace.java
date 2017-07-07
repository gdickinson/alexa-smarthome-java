package uk.co.gdickinson.smarthome.lambda.models;

import com.google.gson.annotations.SerializedName;

public enum Namespace {
  @SerializedName("Alexa.ConnectedHome.Discovery")
  DISCOVERY("Alexa.ConnectedHome.Discovery"),

  @SerializedName("Alexa.ConnectedHome.Control")
  CONTROL("Alexa.ConnectedHome.Control"),

  @SerializedName("Alexa.ConnectedHome.Query")
  QUERY("Alexa.ConnectedHome.Query");

  private String stringValue;

  Namespace(String stringValue) {
    this.stringValue = stringValue;
  }

  @Override
  public String toString() {
    return this.stringValue;
  }
}
