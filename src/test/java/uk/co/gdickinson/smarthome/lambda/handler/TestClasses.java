package uk.co.gdickinson.smarthome.lambda.handler;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.payload.Request;
import uk.co.gdickinson.smarthome.lambda.payload.Response;

public class TestClasses {
  static class TestResponse implements Response {
    private MessageName messageName;

    public TestResponse(MessageName messageName) {
      this.messageName = messageName;
    }

    @Override
    public MessageName getMessageName() {
      return this.messageName;
    }
  }

  static class TestRequest extends Request<TestResponse> {
    private MessageName messageName;
    public TestRequest(MessageName messageName) {
      this.messageName = messageName;
    }
    @Override
    public MessageName getMessageName() {
      return this.messageName;
    }
  }
}
