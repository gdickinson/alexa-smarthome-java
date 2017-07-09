package uk.co.gdickinson.smarthome.lambda.handler;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.payload.Request;
import uk.co.gdickinson.smarthome.lambda.payload.Response;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class DispatchingHandlerTest {
  private static HandlerFactory factory = new HandlerFactory();
  private static MessageName SUPPORTED_MESSAGE_NAME = MessageName.GET_LOCK_STATE_REQUEST;
  private static MessageName UNSUPPORTED_MESSAGE_NAME = MessageName.DECREMENT_COLOR_TEMPERATURE_REQUEST;

  private static class TestResponse implements Response {
    @Override
    public MessageName getMessageName() {
      return SUPPORTED_MESSAGE_NAME;
    }
  }

  private static class TestRequest extends Request<TestResponse> {
    private MessageName messageName;
    public TestRequest(MessageName messageName) {
      this.messageName = messageName;
    }
    @Override
    public MessageName getMessageName() {
      return this.messageName;
    }
  }

  private static TestRequest SUPPORTED_TEST_REQUEST = new TestRequest(SUPPORTED_MESSAGE_NAME);
  private static TestResponse TEST_RESPONSE = new TestResponse();
  private static TestRequest UNSUPPORTED_TEST_REQUEST = new TestRequest(UNSUPPORTED_MESSAGE_NAME);

  @Mock
  private RequestHandler<TestRequest, TestResponse> testRequestHandler;
  private DispatchingHandler dispatchingHandler;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    factory.registerHandler(SUPPORTED_MESSAGE_NAME, testRequestHandler);
    dispatchingHandler = new DispatchingHandler(factory);
  }

  @Test
  public void testSuccessfulGetHandler() throws Exception {
    assertSame(testRequestHandler, factory.getHandler(SUPPORTED_MESSAGE_NAME));
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testUnsuccessfulGetHandler() throws Exception {
    factory.getHandler(MessageName.TURN_ON_REQUEST);
  }

  @Test
  public void testSuccessfulDispatch() throws Exception {
    when(testRequestHandler.handle(SUPPORTED_TEST_REQUEST)).thenReturn(TEST_RESPONSE);
    Response r = dispatchingHandler.handle(SUPPORTED_TEST_REQUEST);
    assertSame(TEST_RESPONSE, r);
    verify(testRequestHandler).handle(SUPPORTED_TEST_REQUEST);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testUnregisteredDispatch() throws Exception {
    dispatchingHandler.handle(UNSUPPORTED_TEST_REQUEST);
  }
}