package com.example.first_application;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_application.response.GetAssetResponse;

@RestController
@SpringBootApplication

public class FirstApplication {

  public static void main(String[] args) {
    SpringApplication.run(FirstApplication.class, args);
  }

  @GetMapping
  public String sayHello() {
    return "Hello, World!";
  }

  @GetMapping("/users")
  public List<String> getUser() {
    return List.of("John", "Jane", "Bob");
  }

  @GetMapping("/asset")
  public GetAssetResponse getAsset() {
    GetAssetResponse response = GetAssetResponse.builder()
    .id("1")
    .name("John")
    .description("This description")
    .type("tipe A")
    .isAvailable(false)
    .build();

    response.getDescription();

    return response;
  }

  @GetMapping("/assets")
  public List<GetAssetResponse> getAssets() {
    GetAssetResponse asset1 = GetAssetResponse.builder()
      .id("1")
      .name("John")
      .description("This description")
      .type("tipe A")
      .isAvailable(false)
      .build();
    GetAssetResponse asset2 = GetAssetResponse.builder()
      .id("1")
      .name("John")
      .description("This description")
      .type("tipe A")
      .isAvailable(false)
      .build();

    return Arrays.asList(asset1, asset2);
  }
}
