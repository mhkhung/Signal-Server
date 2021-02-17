package org.whispersystems.textsecuregcm.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class WebhookUri {

  @JsonProperty
  @NotEmpty
  private String webhookUri; 

  public WebhookUri(String uri) {
    this.webhookUri = uri;
  }

  public WebhookUri() {}

  public String getLocation() {
    return this.webhookUri;
  }
}
