package test.aj.SBPractice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${project.author}")
    private String firstName;

    @GetMapping("/")
    public String sayHello() {
        return "App created by " + firstName;
    }

}
