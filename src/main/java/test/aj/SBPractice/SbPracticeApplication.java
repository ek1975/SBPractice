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
management.endpoints.web.exposure.include=health,info //can specify exclude as well.
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

Part B:
1) Constructor injection: Create a SportsTip interface with 'String getDailyTip()' method
2) Implement the above interface for TennisTip class and annotate it with @Component
3) Create 'private SportsTip sportsTip' in RestController
4) Create a constructor in RestController u/ the above sportsTip variable & annotate it with @Autowired
5) Create '@GetMapping("/dailytip") public String getDailyTip()' method to 'return sportsTip.getDailyTip()'
6) Setter injection: Comment out the constructor and create a setter method to use sportsTip.  Annotate it
with @Autowired and test it out.

7) @Qualifier: Copy & paste TennisTip class to PingPongTip class.  Change the message.
8) Add (@Qualifier("pingPongTip") Sportstip sportsTip) to the RestController constructor, in camelCase.  Test
the app to make sure the PingPongTip message comes through at /dailytip.

9) @Primary: Remove @Qualifier from the RestController constructor, and add @Primary below @Component in the
TennisTip class.  Run the app, and see @Primary come through in spite of multiple DailyTip implementations.
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
