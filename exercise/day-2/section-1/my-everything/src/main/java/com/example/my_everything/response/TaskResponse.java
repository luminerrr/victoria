package com.example.my_everything.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter

public class TaskResponse {
  @JsonProperty("id")
   private Long id;

   @JsonProperty("name")
   private String name;

   @JsonProperty("status")
   private String status;

   @JsonProperty("description")
   private String description;
}
