# spring-framework-tutorials
This repository included Spring exercises with Spring MVC, Spring Boot, Rest APIs, Maven, Apache Tomcat Server, JSP

## Spring Boot Applications

* [spring-boot-helloworld-exmaple](#spring-boot-helloworld-exmaple)

```
Contain about - 
  HelloWorld example with SpringBoot(Auto configuration)

Technology Used: - 
      1. Spring boot
      2. spring-boot-starter-parent - 2.0.3.RELEASE
      3. JDK 8
      4. maven compiler plugin
      5. Run through embedded Tomcat server
  ```
------------------------------------------------------------------
* [spring-boot-rest-curd-apis](#spring-boot-rest-curd-apis)

 Connet Spring with REST APIs for CRUD operations, use SpringBoot(Auto configuration).
 GET, POST with converting xml input to Json and vice versa.
```
Contain about - 
  1. beans
      1. country.java
  2. controller
      2. countryController.java
  3. helper

Technology Used: - 
      1. Spring boot
      2. spring-boot-starter-parent - 2.7.8
      3. Jackson-plugin - 2.8.1 (To XML/JSON conversion)
      4. REST APIs (GET/POST)
      5. JDK 8
      6. maven compiler plugin - 3.8.6
      7. Run through embedded Tomcat server
      8. Access post request through Postman, since all browser calles are work as GET request
  ```
  ------------------------------------------------------------------
* [spring-boot-with-mssql-server](#spring-boot-with-mssql-server)

Connect to Microsoft SQL Server from a Spring Boot application in the following two common scenarios:
  1. A Spring Boot - console application with Spring JDBC and JdbcTemplate.
                     Relational database in a Spring Boot application using JDBC instead of an ORM framework like Hibernate. 
                     For simple database operations, using JDBC is easier and more efficiently than using Hibernate.
  2. A Spring Boot - web application with Spring Data JPA and Hibernate framework(ORM).

```
Contain about - 
  1. apps/initial point
      1. SpringBootWithMssqlServerApplication2.java <- 1st method
      2. SpringBootWithMssqlServerApplication1.java < - 2nd method
  2. controller
      1. CustomerController.java
  3. model
      1. Customer.java <-Java class (entity) that maps to a table in the database (Entity mapping required for 2nd method, 
                        for first method even we can use normal java bean class)
  4. dao
      1. CustomerRepository.java <- required for 2nd method, no need for 1st
  5. apllications.properties <- data source properties for the database connection information

Technology Used: - 
      1. Spring boot
      2. spring-boot-starter-parent - 2.7.10-SNAPSHOT
      3. spring-boot-starter-web <- for 2nd method
      4. spring-boot-starter-jdbc
      5. mssql-jdbc_auth <- replace java bin/lib folder with this drivers
      6. spring-boot-starter-data-jpa <- for 2nd method (Spring-daa-JPA, Spring include by default hibernate with this)
      7. JDK 8
      8. Jackson-plugin - 2.8.1 (To XML/JSON conversion)
      9. maven compiler plugin - 3.8.6
      10. Run through embedded Tomcat server
      11. SQL Server JDBC driver <- This allows Java application to connect to Microsoft SQL Server
      12. Spring JDBC or Spring Data JPA 
            1. Spring JDBC -> work with JDBCTemplate
                              Can use this only with Model class and console applications
                              To use JDBC with Spring Boot, we need to specify the spring-boot-starter-jdbc dependency.
                              Spring framework provides the JdbcTemplate class that simplifies coding with JDBC.
                              
                              And the mysql-connector-java dependency is required to work with MySQL database. 
                              But we can use mssql-jdbc dependency also for this purpose.

            2. Spring Data JPA -> work with Hibernate (standard way to use)
                                  Use this with an entity classes and a repository interface
                                  by default, Spring Data JPA uses Hibernate as implementation of Java Persistence API (JPA)
      13. MSSQL Server
          1. Create Database
          2. Create Tables
          3. Insert Data
          4. Read Data & Display using JSON and Console output
  ```
  ------------------------------------------------------------------
  ## Spring Framework (MVC) Applications
  * [spring-mvc-start-app](#spring-mvc-start-app)

 Implement Spring MVC project, with DispactherServlet and Web.xml, with JSP views.
 
```
Contain about - 
  1. java
      1. controller <- contain controller classes with @Controller annotaion, ex:- UserController
      2. model <- contain model classes (User.java, Customer.java)
  2. webapp
      1. WEB-INF
          1. views <- contain JSP views
          2. spring-servlet.xml <- define DispactherServlet work process with Controller packages & Views
          3. web.xml <- define DispatcherServlet
      2. resources
          1. bootstrap.min.js
          2. bootstrap.min.css
      3. index.jsp

Technology Used: - 
      1. Spring framework
      2. spring-webmvc - 5.3.25
      3. spring-web - 5.3.25
      4. javax.servlet - 3.1.0
      5. JSP views - javax.servlet.jsp - 3.1.0
      6. Bootstrap5 -> Since Bootstrap4 require JQuery plugin to work
      6. Packaging -> War
      4. REST APIs (GET/POST)
      5. JDK 8
      6. maven compiler plugin - 3.8.6
      7. Run through external Tomcat server (local) and Intellij Idea Tomact server - Apache Tomcat server - 8.0.36
      8. Access post request through Postman, since all browser calles are work as GET request
  
  
