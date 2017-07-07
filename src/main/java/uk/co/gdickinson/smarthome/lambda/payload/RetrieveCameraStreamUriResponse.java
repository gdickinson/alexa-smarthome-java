package uk.co.gdickinson.smarthome.lambda.payload;


import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class RetrieveCameraStreamUriResponse implements Response {
  @Override
  public MessageName getMessageName() {
    return MessageName.RETRIEVE_CAMERA_STREAM_URI_RESPONSE;
  }
}
