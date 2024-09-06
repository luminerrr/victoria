package com.example.first_application.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter

public class CreateUserResponse {
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
