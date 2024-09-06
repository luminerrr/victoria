package com.example.first_application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
    @RequestParam(name = "size", required = false, defaultValue = "1") Integer size
  ) {
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
    if(startsFrom > assets.size()) {
      return emptyRes;
    }
    endsTo = endsTo > assets.size() ? assets.size() : endsTo;

    return assets.subList(startsFrom, endsTo);
  }
}
