package org.example;

import org.example.config.ApplicationConfig;
import org.example.service.OutputService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        GreetingService greetingService = new GreetingService("Hello");
//        TimeService timeService = new TimeService();
//        OutputService outputService = new OutputService(greetingService,timeService);
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);
        for(int i=0;i<5;i++){
            outputService.generateOutput("Karthi");
        }
    }
}