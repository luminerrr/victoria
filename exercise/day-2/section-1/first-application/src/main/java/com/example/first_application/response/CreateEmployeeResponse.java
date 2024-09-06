package com.example.first_application.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class CreateEmployeeResponse {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("age")
  private Integer age;

  @JsonProperty("address")
  private String address;

  @JsonProperty("phone")
  private String phone;
}
