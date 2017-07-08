package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Appliance;

abstract class DeltaColorTemperatureRequest<R extends Response> implements Request<R> {
  private Appliance appliance;
}
