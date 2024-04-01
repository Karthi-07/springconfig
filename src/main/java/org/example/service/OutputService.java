package org.example.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class OutputService {
    private GreetingService greetingService;
    private TimeService timeService;
    public OutputService(GreetingService greetingService,TimeService timeService){
        this.greetingService=greetingService;
        this.timeService=timeService;
    }
    public void generateOutput(String name){
        String time = timeService.getCurrenttime();
        String greeting = greetingService.getGreeting();
        System.out.println(time+" "+greeting);
    }

}
