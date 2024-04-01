package org.example.service;

public class OutputService {
    private String name;
    private GreetingService greetingService;
    private TimeService timeService;
    public OutputService(GreetingService greetingService,TimeService timeService,String name){
        this.greetingService=greetingService;
        this.timeService=timeService;
        this.name=name;
    }
    public void generateOutput(String name){
        System.out.println(name);
    }

}
