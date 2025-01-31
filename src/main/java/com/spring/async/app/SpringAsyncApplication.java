package com.spring.async.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringAsyncApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringAsyncApplication.class, args);
  }

}
