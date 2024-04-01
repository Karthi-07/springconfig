package org.example.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Component
public class TimeService {
 public TimeService() {
 }
 private static final DateTimeFormatter time12 = DateTimeFormatter.ofPattern("hh:mm:ss");
 public String getCurrenttime(){
  LocalDateTime time = LocalDateTime.now();
    return time12.format(time);
 }
}
