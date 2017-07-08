package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Appliance;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class RetrieveCameraStreamUriRequest extends Request<RetrieveCameraStreamUriResponse> {
  private String directedId;
  private Appliance appliance;

  public String getDirectedId() {
    return directedId;
  }

  public void setDirectedId(String directedId) {
    this.directedId = directedId;
  }

  public Appliance getAppliance() {
    return appliance;
  }

  public void setAppliance(Appliance appliance) {
    this.appliance = appliance;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.RETRIEVE_CAMERA_STREAM_URI_REQUEST;
  }
}
