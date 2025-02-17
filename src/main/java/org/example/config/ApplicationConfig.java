package org.example.config;

import org.example.service.GreetingService;
import org.example.service.OutputService;
import org.example.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
    @Value("${app.greeting}")
    private String greeting;

    @Value("${app.name}")
    private String name;
    @Autowired
    private GreetingService greetingService;
    @Autowired
    private TimeService timeService;
@Bean
public GreetingService greetingService(){
    return new GreetingService(greeting);
}
@Bean
public TimeService timeService(){
    return new TimeService();
}
@Bean
public OutputService outputService(){
 return new OutputService(greetingService,timeService,name);
}

}
