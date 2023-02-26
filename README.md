# spring-framework-tutorials
This repository included Spring exercises with Spring MVC, Spring Boot, Rest APIs, Maven, Apache Tomcat Server, JSP

## Table of contents

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
  
  
