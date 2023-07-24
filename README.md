# spring-boot
Example of Spring Boot features and why to use Spring Boot.

* Why to use Spring Boot?

Previously setting up Spring projects was not easy, we needed to do:
1. Handle the Dependency management (pom.xml)
2. Define Web App Configuration (web.xml)
3. Manage Spring Beans (context.xml)
4. Implement Non Functional Requirements

This has to be done foe every new project and also has to be maintained in the time. A lot of effort.<br />
**Spring Boot simplifies this.**

* What is the goal of Spring Boot?

Help you to build production-ready Apps quickly. It provides a set of tools like:
1. Spring Initializr
2. Spring Boot Starter Projects
3. Spring Boot Auto Configuration
4. Spring Boot DevTools
5. Logging
6. Different Configuration for Different Environments (Profiles, Configuration Properties)
7. Monitoring (Spring Boot Actuator)

* What is Auto Configuration?

It's a way to simplify the configuration needed to build a Spring App. It's based on:
1. Which Frameworks are in the Class Path.
2. What is the existing configuration (Annotations, etc...).

* What is Spring Boot Actuator?

It's a tool for monitor and manage your application. Provides a number of endpoints like:
1. beans: Complete list of Spring Beans in your App.
2. health: App health information.
3. metrics: Application metrics.
4. mappings: Details about Request Mappings.
