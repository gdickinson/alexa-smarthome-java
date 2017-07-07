package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class RetrieveCameraStreamUriRequest implements Request<RetrieveCameraStreamUriResponse> {
  @Override
  public MessageName getMessageName() {
    return MessageName.RETRIEVE_CAMERA_STREAM_URI_REQUEST;
  }
}
