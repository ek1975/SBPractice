package test.aj.SBPractice.rest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisTip implements SportsTip{

    @PostConstruct
    public void initMethod() {
        System.out.println("in Init Method for: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("in Destroy Method for: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyTip() {
        return "For kick serves, swing up and parallel to the baseline!";
    }
}
