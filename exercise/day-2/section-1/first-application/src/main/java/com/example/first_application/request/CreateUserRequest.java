package com.example.first_application.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class CreateUserRequest {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("type")
  private String type;

  @JsonProperty("is_available")
  private boolean isAvailable;
}
