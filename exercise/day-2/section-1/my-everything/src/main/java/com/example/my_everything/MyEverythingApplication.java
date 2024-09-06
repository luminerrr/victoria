package com.example.my_everything;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.my_everything.request.CreateTaskRequest;
import com.example.my_everything.request.PatchTaskRequest;
import com.example.my_everything.response.TaskResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@SpringBootApplication
public class MyEverythingApplication {

  private List<TaskResponse> tasks = new ArrayList<>();
  @GetMapping()
  public String helloWorld() {
    return "Hello, World!";
  }

  @GetMapping("/tasks")
  public ResponseEntity<List<TaskResponse>> getAllTask(
    @RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
    @RequestParam(name = "size", required = false, defaultValue = "1") Integer size
  ) {
    List<TaskResponse> emptyResponse = new ArrayList<>();
    Integer startsFrom = ((page) * size) - size;
    Integer endsTo = startsFrom + size;

    // Base case if size 0
    if(tasks.size() == 0) {
      return new ResponseEntity<>(emptyResponse, HttpStatus.OK);
    }

    if (startsFrom > tasks.size()) {
      return new ResponseEntity<>(emptyResponse, HttpStatus.OK);
    }
    endsTo = endsTo > tasks.size() ? tasks.size() : endsTo;

    return new ResponseEntity<>(tasks.subList(startsFrom, endsTo), HttpStatus.OK);
  }

  @GetMapping("/task/{id}")
  public ResponseEntity<TaskResponse> getTaskById(@PathVariable Long id) {
    for (TaskResponse task : tasks) {
      if(task.getId() == id) {
        return new ResponseEntity<>(task, HttpStatus.OK);
      }
    }

    return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
  }
  
  @PostMapping("/task")
  public ResponseEntity<List<TaskResponse>> createTask(@RequestBody CreateTaskRequest request) {
      System.out.println(tasks.size());
      Long taskId = tasks.size() == 0 ? 1: tasks.get(tasks.size() - 1).getId() + 1 ;
      tasks.add(TaskResponse.builder()
      .id(taskId)
      .name(request.getName())
      .status(request.getStatus())
      .description(request.getStatus())
      .build()
      );

      return new ResponseEntity<>(tasks, HttpStatus.OK);
  }
  
  @PatchMapping("/task/{id}")
  public ResponseEntity<List<TaskResponse>> patchById(
    @PathVariable(name = "id") Long id,
    @RequestBody PatchTaskRequest request
  ) {
    for (TaskResponse task : tasks) {
      if (task.getId() == id) {
        task.setName(request.getName());
        task.setStatus(request.getStatus());
        task.setDescription(request.getDescription());
      }
    }

    return new ResponseEntity<>(tasks, HttpStatus.OK);
  }


  @DeleteMapping("/task/{id}")
  public ResponseEntity<List<TaskResponse>> deleteById(
    @PathVariable(name = "id") Long id
  ) {
    if(!tasks.removeIf(task -> task.getId().equals(id))) {
      return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    return new ResponseEntity<>(tasks, HttpStatus.OK);
  }

	public static void main(String[] args) {
		SpringApplication.run(MyEverythingApplication.class, args);
	}

}
