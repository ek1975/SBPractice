package test.aj.SBPractice.rest;

import org.springframework.stereotype.Component;

@Component
public class PingPongTip implements SportsTip{
    @Override
    public String getDailyTip() {
        return "Try a better quality paddle";
    }
}
