# Spring-boot-journey

Little tips to get started with spring-boot

- pom.xml (Project Object Model): is a file that contain where spring-boot dependencies are initialized. it also
  contains information of project and configuration information for the maven to build the project such as dependencies,
  build directory, source directory, test source directory, plugin, goals etc. Just like package.json in Nodejs.
- JPA (Java Persistence API): it is a collection of classes and method to persistently store the vast amount of data
  into a database. It an ORM object relational mapping tool.
- Annotations that are used regularly in spring boot:
    - @Data - it helps with the creation of getters and setters but it requires a dependency called Lombok.
    - @Entity - it tell spring boot that this class is an entity that is mapped to a table in the database.
    - @Component - it is an annotation that allows Spring to automatically detect our custom beans. In other words,
      without having to write any explicit code, Spring will: Scan our application for classes annotated with
      @Component. Instantiate them and inject any specified dependencies into them
    - @Controller - it indicates that a particular class serves the role of a controller
    - @RestController
    - @Service


