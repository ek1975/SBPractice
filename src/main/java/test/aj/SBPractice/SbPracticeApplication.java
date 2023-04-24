package test.aj.SBPractice;

/*
Part A:
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
9) change health,info on the line above to * (management.endpoints.web.exposure.include=*)
and test out actuator/beans & actuator/mappings
10) Add spring-boot-starter-security and access /health with user and generated console password
11) Configure server in app.prop using the following, and test at http://localhost:8888/MyApp1/actuator/info
logging.level.com.aj=INFO
logging.file=aj1.log
server.port=8888
server.servlet.context-path=/MyApp1
server.servlet.session.timeout=1m
spring.security.user.name=andrew
spring.security.user.password=joseph
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
