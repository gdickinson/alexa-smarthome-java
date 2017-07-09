package uk.co.gdickinson.smarthome.lambda.handler;

import uk.co.gdickinson.smarthome.lambda.payload.Request;
import uk.co.gdickinson.smarthome.lambda.payload.Response;

class DispatchingHandler {
  private HandlerFactory factory;

  public DispatchingHandler(HandlerFactory factory) {
    this.factory = factory;
  }

  public <Req extends Request<Res>, Res extends Response> Res handle(Req request) throws Exception {
    RequestHandler<Req, Res> handler = factory.getHandler(request.getMessageName());
    return handler.handle(request);
  }
