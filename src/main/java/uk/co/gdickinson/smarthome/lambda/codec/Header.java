package uk.co.gdickinson.smarthome.lambda.codec;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.models.Namespace;

public class Header {
  private String messageId;
  private MessageName name;
  private Namespace namespace;
  private String payloadVersion;

  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public MessageName getName() {
    return name;
  }

  public void setName(MessageName name) {
    this.name = name;
  }

  public Namespace getNamespace() {
    return namespace;
  }

  public void setNamespace(Namespace namespace) {
    this.namespace = namespace;
  }

  public String getPayloadVersion() {
    return payloadVersion;
  }

  public void setPayloadVersion(String payloadVersion) {
    this.payloadVersion = payloadVersion;
  }
}
