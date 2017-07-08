package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class DiscoverAppliancesRequest extends Request<DiscoverAppliancesResponse> {
  @Override
  public MessageName getMessageName() {
    return MessageName.DISCOVER_APPLIANCES_REQUEST;
  }
}
