package com.example.first_application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_application.request.CreateEmployeeRequest;
import com.example.first_application.request.CreateUserRequest;
import com.example.first_application.response.CreateEmployeeResponse;
import com.example.first_application.response.CreateUserResponse;
import com.example.first_application.response.GetAssetResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

  @GetMapping("/asset/{id}")
  public List<GetAssetResponse> getAssetById(@PathVariable String id) {
    List<GetAssetResponse> assets = new ArrayList<GetAssetResponse>();
    assets.add(GetAssetResponse.builder()
        .id("1")
        .name("Jon")
        .description("this is desc")
        .type("jonjon")
        .isAvailable(true)
        .build());
    assets.add(GetAssetResponse.builder()
        .id("2")
        .name("Jon22")
        .description("this is desc22")
        .type("jonjon jinjin")
        .isAvailable(false)
        .build());
    assets.add(GetAssetResponse.builder()
        .id("3")
        .name("Jon33")
        .description("this is desc for jon3")
        .type("jonjon jenjen")
        .isAvailable(true)
        .build());
    assets.add(GetAssetResponse.builder()
        .id("4")
        .name("Jon4s")
        .description("this is desc4")
        .type("jonjon2244")
        .isAvailable(true)
        .build());

    for (int i = 0; i < assets.size(); i++) {
      if (assets.get(i).getId().equals(id)) {
        return assets.subList(i, assets.size());
      }
    }
    return null;

    // for (GetAssetResponse asset : assets) {
    // if(asset.getId().equals(id)) {
    // return assets;
    // } else {
    // assets.removeFirst();
    // }
    // }

    // return null;

    // return GetAssetResponse.builder()
    // .id(id)
    // .name("Johny" + id)
    // .description("Desc for johny")
    // .type("johny type")
    // .isAvailable(false)
    // .build();
  }

  @GetMapping("/calculator/add")
  public String getAdd(
      @RequestParam(name = "panjang") Integer panjang,
      @RequestParam(name = "lebar", required = false, defaultValue = "20") Integer lebar) {
    Integer response = panjang + lebar;

    return response.toString();
  }

  @GetMapping("/assets-page")
  public List<GetAssetResponse> getAssetPagination(
      @RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
      @RequestParam(name = "size", required = false, defaultValue = "1") Integer size) {
    List<GetAssetResponse> assets = new ArrayList<GetAssetResponse>();
    assets.add(GetAssetResponse.builder()
        .id("1")
        .name("Jon")
        .description("this is desc")
        .type("jonjon")
        .isAvailable(true)
        .build());
    assets.add(GetAssetResponse.builder()
        .id("2")
        .name("Jon22")
        .description("this is desc22")
        .type("jonjon jinjin")
        .isAvailable(false)
        .build());
    assets.add(GetAssetResponse.builder()
        .id("3")
        .name("Jon33")
        .description("this is desc for jon3")
        .type("jonjon jenjen")
        .isAvailable(true)
        .build());
    assets.add(GetAssetResponse.builder()
        .id("4")
        .name("Jon4s")
        .description("this is desc4")
        .type("jonjon2244")
        .isAvailable(true)
        .build());

    List<GetAssetResponse> emptyRes = new ArrayList<GetAssetResponse>();
    Integer startsFrom = ((page) * size) - size;
    Integer endsTo = startsFrom + size;
    if (startsFrom > assets.size()) {
      return emptyRes;
    }
    endsTo = endsTo > assets.size() ? assets.size() : endsTo;

    return assets.subList(startsFrom, endsTo);
  }

  @PostMapping("/users")
  public ResponseEntity<List<CreateUserResponse>> createUser(@RequestBody CreateUserRequest request) {
    // TODO: process POST request
    List<CreateUserResponse> createUserResponses = new ArrayList<>();

    createUserResponses.add(CreateUserResponse.builder()
        .id("1")
        .name("markus")
        .description("deskripsi")
        .type("tipe")
        .isAvailable(false)
        .build());
    createUserResponses.add(CreateUserResponse.builder()
        .id("2")
        .name("markus 2")
        .description("deskripsi 2")
        .type("tipe 2")
        .isAvailable(true)
        .build());
    createUserResponses.add(CreateUserResponse.builder()
        .id(request.getId())
        .name(request.getName())
        .description(request.getDescription())
        .type(request.getType())
        .isAvailable(request.isAvailable())
        .build());

    return new ResponseEntity<>(createUserResponses, HttpStatus.OK);
  }

  @PostMapping("/employee")
  public ResponseEntity<List<CreateEmployeeResponse>> createEmployee(@RequestBody CreateEmployeeRequest request) {
    List<CreateEmployeeResponse> responses = new ArrayList<>();

    responses.add(CreateEmployeeResponse.builder()
        .id(1L)
        .name("Nama saya")
        .age(23)
        .address("Jalan gak jadian")
        .phone("0888008800")
        .build());
    responses.add(CreateEmployeeResponse.builder()
        .id(2L)
        .name("Nama Kita 2")
        .age(25)
        .address("Jalan jadian")
        .phone("990099000")
        .build());

    // Validation
    try {
      if (request.getName().isEmpty() ||
          request.getAge().toString().isEmpty() ||
          request.getPhone().isEmpty()) {
        return new ResponseEntity<>(responses, HttpStatus.OK);
      }
      Long newEmployeeId = Long.valueOf(responses.get(responses.size() - 1).getId() + 1);
      responses.add(CreateEmployeeResponse.builder()
          .id(newEmployeeId)
          .name(request.getName())
          .age(request.getAge())
          .address(request.getAddress())
          .phone(request.getPhone())
          .build());
      return new ResponseEntity<>(responses, HttpStatus.OK);
    } catch (Exception e) {
      // TODO: handle exception
      return new ResponseEntity<>(responses, HttpStatus.OK);
    }
  }

}
