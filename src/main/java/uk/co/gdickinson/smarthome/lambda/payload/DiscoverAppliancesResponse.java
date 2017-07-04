package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Appliance;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

import java.util.List;

public class DiscoverAppliancesResponse implements Response {
  private List<Appliance> discoveredAppliances;

  @Override
  public MessageName getMessageName() {
    return MessageName.DISCOVER_APPLIANCES_RESPONSE;
  }

  public List<Appliance> getDiscoveredAppliances() {
    return discoveredAppliances;
  }

  public void setDiscoveredAppliances(List<Appliance> discoveredAppliances) {
    this.discoveredAppliances = discoveredAppliances;
  }
}
