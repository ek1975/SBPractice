package test.aj.SBPractice.rest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisTip implements SportsTip{
    @Override
    public String getDailyTip() {
        return "For kick serves, swing up and parallel to the baseline!";
    }
}
