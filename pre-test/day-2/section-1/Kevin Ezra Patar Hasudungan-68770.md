1. B
2. B
3. A
4. B
5. C
6. B
7. B
8. B
9. A
10. D

True/False questions
1. False
2. False
3. True
4. False *
5. False

Essay

1. 6 RESTful architecture principles: Separation client and server, statelessness, uniformity, caching, layered architecture, and code on demand. 
Here are several benefit of using RESTful architecture;
  - Simplicity: Follows standard HTTP methods (GET, PUT, POST, DELETE), making it easy to understand
  - Platform Independence: RESTful architecture could be used in various platforms such as web, mobile, etc.
  - Scalability: RESTful architecture designed to be stateless, so it will enable horizontal scaling
RESTful architecture influence API design by standardrizing API, such as API Methods, URL naming, etc.

2. GET, POST, PUT, and DELETE explanation:
  - GET: GET is used to gather data from resource (e.g. Database).
  - POST: POST is used to create/add new entry to the resource.
  - PUT: PUT is used to edit existing entry in the resource.
  - DELETE: DELETE is used to delete entry in the resource.

3. Spring Boot simplify the creation of RESTful web services is by auto-configuring all the configuration in the Spring framework. Spring Boot made it easier to implement by having simpler and more concise annotation, such as @Controller. Spring Boot is also widely adopted, so there's many resources that covers Spring Boot.

4. @RequestMapping annotation in spring boot is used to handle request and map it to spring controllers method. @RequestMapping could handle all HTTP method by defining it in the annotation or by using difference HTTP method annotation, like @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, and @PatchMapping. All of it are based on @RequestMapping

5. HTTP status code are a standardization of codes that indicates how the server responded to the request. Example; if a request is success, it will return a 200 code, meaning request is successful. Also a common example is 404 Not Found code, it means that based on the client request, it doesn't find the desired request.

6. Validation in Spring Boot are handled by validation annotations, such as @NotNull, @NotBlank, @Min, @Max, @Size, etc. Spring Boot even handles complex validations such as @CreditCardNumber, @Email, and @Pattern.

7. 

8. @RequestBody are used to map HTTPRequest Body to Java object. @ResponseBody are used to serialize returned object to a JSON and passed to HTTPResponse object.

9. 

10. Importance of exception handling in RESTful APIs are critical, because of RESTful accepts request from client and sometimes the clients doesn't give the desired request and could interrupt with Java run time, so it need to be handled. By default, Spring Boot handles exception handling by returning the default fallback error page, but we could configure it by using @ExceptionHandlers annotation.