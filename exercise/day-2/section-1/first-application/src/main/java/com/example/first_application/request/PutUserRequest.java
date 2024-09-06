package com.example.first_application.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor

public class PutUserRequest {
  @JsonProperty("name")
  private String name;
}
