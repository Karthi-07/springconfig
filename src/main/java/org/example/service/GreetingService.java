package org.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GreetingService {
    @Value("${app.greeting}")
    private String greeting;
    public GreetingService(){
        super();
    }

    public String getGreeting() {
        return greeting;
    }
}
