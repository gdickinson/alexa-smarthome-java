package uk.co.gdickinson.smarthome.lambda.example;

import uk.co.gdickinson.smarthome.lambda.handler.RequestHandler;
import uk.co.gdickinson.smarthome.lambda.handler.SmartHomeDirectiveHandler;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.payload.DiscoverAppliancesRequest;
import uk.co.gdickinson.smarthome.lambda.payload.DiscoverAppliancesResponse;

public final class ExampleSmartHomeHandler extends SmartHomeDirectiveHandler {

  private class DiscoveryHandler implements RequestHandler<DiscoverAppliancesRequest, DiscoverAppliancesResponse> {
    @Override
    public DiscoverAppliancesResponse handle(DiscoverAppliancesRequest request) throws Exception {
      DiscoverAppliancesResponse response = new DiscoverAppliancesResponse();
      return response;
    }
  }

  @Override
  protected void init() {
    this.registerHandler(MessageName.DISCOVER_APPLIANCES_REQUEST, new DiscoveryHandler());
  }