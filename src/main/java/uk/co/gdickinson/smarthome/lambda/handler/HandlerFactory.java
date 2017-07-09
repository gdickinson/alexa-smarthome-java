package uk.co.gdickinson.smarthome.lambda.handler;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.payload.Request;
import uk.co.gdickinson.smarthome.lambda.payload.Response;

import java.util.HashMap;
import java.util.Map;

public class HandlerFactory {
  private Map<MessageName, RequestHandler> handlerMap;

  public HandlerFactory() {
    this.handlerMap = new HashMap<>();
  }

  public <Req extends Request<Res>, Res extends Response> void registerHandler(
    MessageName name, RequestHandler<Req, Res> handler) {
    handlerMap.put(name, handler);
  }

  public <Req extends Request<Res>, Res extends Response> RequestHandler<Req, Res> getHandler(MessageName name) {
    RequestHandler<Req, Res> handler = handlerMap.get(name);
    if (handler != null) {
      return handler;
    } else {
      throw new UnsupportedOperationException(String.format("No handler registered for %s", name));
    }
  }
}
