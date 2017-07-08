package uk.co.gdickinson.smarthome.lambda.payload;


import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class RetrieveCameraStreamUriResponse implements Response {
  private String uri;
  private String imageUri;

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public String getImageUri() {
    return imageUri;
  }

  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.RETRIEVE_CAMERA_STREAM_URI_RESPONSE;
  }
}
