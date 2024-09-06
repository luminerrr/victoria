package com.example.first_application.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter

public class PutUserRequest {
  @JsonProperty("name")
  private String name;
}
