package test.aj.SBPractice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${project.author}")
    private String firstName;

    private SportsTip sportsTip;


    @Autowired
    public RestController(SportsTip sportsTip) {
        System.out.println("Loading class: " + getClass().getSimpleName());
        this.sportsTip = sportsTip;
    }

/*
    @Autowired
    public void setSportsTip(SportsTip sportsTip) {
        this.sportsTip = sportsTip;
    }
*/
    @GetMapping("/")
    public String sayHello() {
        return "App created by " + firstName;
    }

    @GetMapping("/dailytip")
    public String getDailyTip() {
        return sportsTip.getDailyTip();
    }
}
