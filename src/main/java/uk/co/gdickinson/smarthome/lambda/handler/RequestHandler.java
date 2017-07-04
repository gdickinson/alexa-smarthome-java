package uk.co.gdickinson.smarthome.lambda.handler;

import uk.co.gdickinson.smarthome.lambda.payload.Request;
import uk.co.gdickinson.smarthome.lambda.payload.Response;

public interface RequestHandler<Req extends Request<Res>, Res extends Response> {
  public Res handle(Req request) throws Exception;
}
