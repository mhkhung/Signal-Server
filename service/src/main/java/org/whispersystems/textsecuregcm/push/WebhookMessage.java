package org.whispersystems.textsecuregcm.push;


import java.util.Optional;

@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
public class WebhookMessage {

  public enum Type {
    RECEIPT, NOTIFICATION, CHALLENGE
  }

  private final String           uri;
  private final String           number;
  private final int              deviceId;
  private final Type             type;
  private final Optional<String> data;

  public WebhookMessage(String uri, String number, int deviceId, Type type, Optional<String> data) {
    this.uri      = uri;
    this.number   = number;
    this.deviceId = deviceId;
    this.type     = type;
    this.data     = data;
  }

  public String getUri() {
    return uri;
  }

  public String getNumber() {
    return number;
  }

  public Type getType() {
    return type;
  }

  public int getDeviceId() {
    return deviceId;
  }

  public Optional<String> getData() {
    return data;
  }

}
