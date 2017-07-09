package uk.co.gdickinson.smarthome.lambda.payload;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Header header = (Header) o;

    if (!getMessageId().equals(header.getMessageId())) return false;
    if (getName() != header.getName()) return false;
    if (getNamespace() != header.getNamespace()) return false;
    return getPayloadVersion().equals(header.getPayloadVersion());
  }

  @Override
  public int hashCode() {
    int result = getMessageId().hashCode();
    result = 31 * result + getName().hashCode();
    result = 31 * result + getNamespace().hashCode();
    result = 31 * result + getPayloadVersion().hashCode();
    return result;
  }
}
