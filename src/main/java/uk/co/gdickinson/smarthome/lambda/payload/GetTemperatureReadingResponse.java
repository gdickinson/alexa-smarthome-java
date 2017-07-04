package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.models.Temperature;

import java.util.Date;

public class GetTemperatureReadingResponse implements Response {
  private Temperature temperatureReading;
  private Date timestamp;

  @Override
  public MessageName getMessageName() {
    return MessageName.GET_TEMPERATURE_READING_RESPONSE;
  }

  public Temperature getTemperatureReading() {
    return temperatureReading;
  }

  public void setTemperatureReading(Temperature temperatureReading) {
    this.temperatureReading = temperatureReading;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }
}
