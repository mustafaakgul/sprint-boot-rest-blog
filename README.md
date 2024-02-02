## The Spring Boot blog is a dynamic and scalable web application that leverages the power of Spring Boot

### Best Practices
* Rest Principles -> Client-Server, Stateless, Cacheable, Layered System, Uniform Interface, Code on Demand
* Do not use wildcard imports
    * In the Settings/Preferences, Editor | Code Style | Java | Imports.
    * Make sure that the Use single class import option is enabled.
    * In the Class count to use import with '' and Names count to use static import with '' fields, specify values that definitely exceed the number of classes in a package and the number of names in a class (for example, 999 ).
* "Optional" can be used as a return type for repository methods to indicate that a null value will be returned in the case of a non-existent entity.
* Folder name in strıcture should be singular -> "entity" not "entities"

* https://www.linkedin.com/pulse/20-spring-boot-developer-best-practices-abid-anjum/
* https://medium.com/@raviyasas/spring-boot-best-practices-for-developers-3f3bdffa0090
* https://studygyaan.com/spring-boot/spring-boot-best-practices-build-efficient-applications
* https://malshani-wijekoon.medium.com/spring-boot-folder-structure-best-practices-18ef78a81819
* https://medium.com/thefreshwrites/best-practices-in-spring-boot-project-structure-2986adb290
* https://studygyaan.com/spring-boot/spring-boot-project-folder-structure-and-best-practices
* https://www.linkedin.com/pulse/restful-apis-spring-boot-best-practices-nidhal-naffati/
* https://medium.com/@AlexanderObregon/best-practices-for-developing-restful-web-services-in-spring-boot-24ca20ee9715
* https://medium.com/@KkambizZ/best-practices-to-follow-when-developing-rest-apis-in-a-microservice-application-using-spring-boot-9f2d1a2a49fb
* 

### How to run
* Run the main method in the com.example.demo.DemoApplication class from your IDE.
* Alternatively you can use the Spring Boot Maven plugin like so:
    * mvn spring-boot:run

### CURL Commands
* Create -> curl -X POST -H "Content-Type: application/json" -d '{"username":"John Doe", "firstName":"john", "lastName":"doe", "age":21}' http://localhost:8080/api/v1/users
* Get All -> curl http://localhost:8080/api/v1/users
* Delete By Id -> curl -X DELETE http://localhost:8080/api/v1/users/delete/5

### Annotations
* @SpringBootApplication -> @SpringBootApplication is a convenience annotation that adds all of the following:
* @Configuration: Tags the class as a source of bean definitions for the application context.
* @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
* @EnableWebMvc: Flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.
* @ComponentScan: Tells Spring to look for other components, configurations, and services in the hello package, allowing it to find the controllers.
* @RestController -> @RestController is a convenience annotation that is itself annotated with @Controller and @ResponseBody.
* @RequestMapping -> @RequestMapping maps / to the index() method. When invoked from a browser or using curl on the command line, the method returns pure text. That’s because @RestController combines @Controller and @ResponseBody, two annotations that results in web requests returning data rather than a view.
* @AutoWired -> @Autowired marks a constructor, field, or setter method to be autowired by Spring dependency injection.
* @PathVariable -> @PathVariable indicates that a method parameter should be bound to a URI template variable.
* @RequestParam -> @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method. This query string parameter is explicitly marked as optional (required=true by default): if it is absent in the request, the defaultValue of World is used.
* @RequestBody -> @RequestBody binds the HTTP request body to the parameter.
* @Component -> @Component is a generic stereotype for any Spring-managed component.
* @PostMapping -> @PostMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.POST).