package uk.co.gdickinson.smarthome.lambda.handler;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import uk.co.gdickinson.smarthome.lambda.codec.Header;
import uk.co.gdickinson.smarthome.lambda.codec.SmartHomeDirectiveRequest;
import uk.co.gdickinson.smarthome.lambda.codec.SmartHomeDirectiveResponse;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.payload.*;

public class DeserializeAndHandlePayload {
  private static Gson gson = new Gson();

  public void setDecrementTargetTemperatureRequestHandler(RequestHandler<DecrementTargetTemperatureRequest, DecrementTargetTemperatureConfirmation> decrementTargetTemperatureRequestHandler) {
    this.decrementTargetTemperatureRequestHandler = decrementTargetTemperatureRequestHandler;
  }

  public void setDiscoverAppliancesHandler(RequestHandler<DiscoverAppliancesRequest, DiscoverAppliancesResponse> discoverAppliancesHandler) {
    this.discoverAppliancesHandler = discoverAppliancesHandler;
  }

  public void setGetTargetTemperatureHandler(RequestHandler<GetTargetTemperatureRequest, GetTargetTemperatureResponse> getTargetTemperatureHandler) {
    this.getTargetTemperatureHandler = getTargetTemperatureHandler;
  }

  public void setGetTemperatureReadingHandler(RequestHandler<GetTemperatureReadingRequest, GetTemperatureReadingResponse> getTemperatureReadingHandler) {
    this.getTemperatureReadingHandler = getTemperatureReadingHandler;
  }

  public void setIncrementTargetTemperatureHandler(RequestHandler<IncrementTargetTemperatureRequest, IncrementTargetTemperatureConfirmation> incrementTargetTemperatureHandler) {
    this.incrementTargetTemperatureHandler = incrementTargetTemperatureHandler;
  }

  public void setSetTargetTemperatureHandler(RequestHandler<SetTargetTemperatureRequest, SetTargetTemperatureConfirmation> setTargetTemperatureHandler) {
    this.setTargetTemperatureHandler = setTargetTemperatureHandler;
  }

  public void setTurnOffHandler(RequestHandler<TurnOffRequest, TurnOffConfirmation> turnOffHandler) {
    this.turnOffHandler = turnOffHandler;
  }

  public void setTurnOnHandler(RequestHandler<TurnOnRequest, TurnOnConfirmation> turnOnHandler) {
    this.turnOnHandler = turnOnHandler;
  }

  private RequestHandler<DecrementTargetTemperatureRequest, DecrementTargetTemperatureConfirmation>
    decrementTargetTemperatureRequestHandler;

  private RequestHandler<DiscoverAppliancesRequest, DiscoverAppliancesResponse>
    discoverAppliancesHandler;

  private RequestHandler<GetTargetTemperatureRequest, GetTargetTemperatureResponse>
    getTargetTemperatureHandler;

  private RequestHandler<GetTemperatureReadingRequest, GetTemperatureReadingResponse>
    getTemperatureReadingHandler;

  private RequestHandler<IncrementTargetTemperatureRequest, IncrementTargetTemperatureConfirmation>
    incrementTargetTemperatureHandler;

  private RequestHandler<SetTargetTemperatureRequest, SetTargetTemperatureConfirmation>
    setTargetTemperatureHandler;

  private RequestHandler<TurnOffRequest, TurnOffConfirmation>
    turnOffHandler;

  private RequestHandler<TurnOnRequest, TurnOnConfirmation>
    turnOnHandler;


  public SmartHomeDirectiveResponse handle(SmartHomeDirectiveRequest directive) throws Exception {
    SmartHomeDirectiveResponse response = new SmartHomeDirectiveResponse();
    Header directiveHeader = directive.getHeader();
    Header responseHeader = new Header();
    responseHeader.setMessageId(directiveHeader.getMessageId());
    responseHeader.setNamespace(directiveHeader.getNamespace());
    responseHeader.setPayloadVersion(directiveHeader.getPayloadVersion());
    JsonElement payloadElement = directive.getPayload();

    switch (directive.getHeader().getName()) {
      case DECREMENT_TARGET_TEMPERATURE_REQUEST: {
        DecrementTargetTemperatureRequest req =
          gson.fromJson(directive.getPayload(), DecrementTargetTemperatureRequest.class);
        DecrementTargetTemperatureConfirmation res = decrementTargetTemperatureRequestHandler.handle(req);
        responseHeader.setName(res.getMessageName());
        response.setPayload(res);
      }
      break;

      case DISCOVER_APPLIANCES_REQUEST: {
        DiscoverAppliancesRequest req = gson.fromJson(payloadElement, DiscoverAppliancesRequest.class);
        DiscoverAppliancesResponse res = discoverAppliancesHandler.handle(req);
        responseHeader.setName(res.getMessageName());
        response.setPayload(res);
      }
      break;

      case GET_TARGET_TEMPERATURE_REQUEST: {
        GetTargetTemperatureRequest req = gson.fromJson(payloadElement, GetTargetTemperatureRequest.class);
        GetTargetTemperatureResponse res = getTargetTemperatureHandler.handle(req);
        responseHeader.setName(res.getMessageName());
        response.setPayload(res);
      }
      break;

      case INCREMENT_TARGET_TEMPERATURE_REQUEST: {
        IncrementTargetTemperatureRequest req = gson.fromJson(payloadElement, IncrementTargetTemperatureRequest.class);
        IncrementTargetTemperatureConfirmation res = incrementTargetTemperatureHandler.handle(req);
        responseHeader.setName(res.getMessageName());
        response.setPayload(res);
      }
      break;

      case SET_TARGET_TEMPERATURE_REQUEST: {
        SetTargetTemperatureRequest req = gson.fromJson(payloadElement, SetTargetTemperatureRequest.class);
        SetTargetTemperatureConfirmation res = setTargetTemperatureHandler.handle(req);
        responseHeader.setName(res.getMessageName());
        response.setPayload(res);
      }
      break;

      case TURN_OFF_REQUEST: {
        TurnOffRequest req = gson.fromJson(payloadElement, TurnOffRequest.class);
        TurnOffConfirmation res = turnOffHandler.handle(req);
        responseHeader.setName(res.getMessageName());
        response.setPayload(res);
      }
      break;

      case TURN_ON_REQUEST: {
        TurnOnRequest req = gson.fromJson(payloadElement, TurnOnRequest.class);
        TurnOnConfirmation res = turnOnHandler.handle(req);
        responseHeader.setName(res.getMessageName());
        response.setPayload(res);
      }
      break;

      case GET_TEMPERATURE_READING_REQUEST: {
        GetTemperatureReadingRequest req = gson.fromJson(payloadElement, GetTemperatureReadingRequest.class);
        GetTemperatureReadingResponse res = getTemperatureReadingHandler.handle(req);
        responseHeader.setName(res.getMessageName());
        response.setPayload(res);
      }
      break;

      default:
        throw new UnsupportedOperationException("Unsupported message type: " + directive.getHeader().getName());
    }
    response.setHeader(responseHeader);
    return response;
  }
}
