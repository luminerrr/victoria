1. B
2. A
3. A
4. A
5. D

True/False:
6. False
7. True
8. True
9. False
10. True

Short Answer:
11. The primary responsibility of the Controller layer is to handle Http requests and send Http responses to client.

12. The service layer interacts with repository layer by calling the repository methods to perform operations on db.

13. - Repository: Repository is responsible to handle database interactions that defined first in entity folder.
- Service: Service is responsible to perform business logic and interacts with repository
- Controller: Controller is responsible to handle Http request and response. Controller calls methods that already defined in service

14. Repository layer is responsible for interacting with the database, so the business logic in the service doesn't do database interactions directly to the db.

15. Implicit type casting is when Java automatically convert value's data type from one to another without explicitly typing it in the program. Explicit type casting occurs when we explicitly type in the program to convert value's data type.

16. First of all, you need to create jwt service in the service package to create methods for jwt. Spring Security are configured in `config` package, and then you need to use `@EnableWebSecurity` annotations in the configuration. After configuring it, the next step is to create a middleware to check jwt in the Authorization header on every request/response.

17. 
```
    String floatingNumber = "23.56";
    Double doubleNumber = Double.valueOf(floatingNumber);
```

18. `assertEquals` method is used to check if two objects are equal, and if it's not equal, it will fail the test.

19. Custom `UserDetailsService` can be achieved by implement `UserDetailsService` interface and return `UserDetails`

20. Service in Spring Boot is defined by using `@Service` annotations and placed in `service` package.

21. Service layer is used to perform business logic (e.g. calculating discount) and interacts to db through repository.

22. To do unit tests for Service in Spring Boot it could use JUnit and Mockito to mock dependencies.

23. `@RequestMapping` annotations used to map Http requests to specific method in the controller. Example: `@RequestMapping("/v1/employee")` will map all the request in /v1/employee

24. To do an integration test between service and repository, you need to have test database and use Mockito to mock repository layer in order to test Service behavior.

25. To handle exceptions in Controller layer, typically `@ExceptionHandler` annotation is used to catch and handle exceptions. 