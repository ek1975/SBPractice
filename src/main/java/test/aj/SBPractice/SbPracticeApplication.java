package test.aj.SBPractice;

/*
1) Create a SB project from start.spring.io, add hello world and run it in IntelliJ
2) Add an GetMapping for / endpoint in a new Rest controller class and access the app via localhost:8080
3) Add project.author to app.prop and use @Value("${project.author}") to display it
4) Check File > Settings > BED > Compiler: Build project automatically
5) Check File > Settings > Advanced Settings: Allow auto-make...
6) Add spring-boot-devtools to pom.xml, make changes to ensure hot reload is working.
7) Add spring-boot-starter-actuator and test /actuator/health
8) Add the following to app.prop and test out /actuator/info and ensure /actuator/health is still up
management.endpoints.web.exposure.include=health,info
management.info.env.enabled=true
info.app.name=SB Practice
info.app.description=Test Spring Boot features
9) change health,info on the line above to * and test out actuator/beans & actuator/mappings
management.endpoints.web.exposure.include=*
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbPracticeApplication.class, args);
		System.out.println("Hello Andrew!!!");
	}

}
