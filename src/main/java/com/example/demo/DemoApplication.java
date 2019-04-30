package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
    //TODO: Print All beans


    PrintSeries printSeries = context.getBean(PrintSeries.class);
    printSeries.printNumSeries(10);

    //TODO: get another bean and call its method


  }

}
