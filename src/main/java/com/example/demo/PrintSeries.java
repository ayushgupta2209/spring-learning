package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * @author Ayush Gupta
 */

@Component
public class PrintSeries {
  public void printNumSeries(int x) {
    for(int i=0;i<x;i++) {
      System.out.println(i);
    }
  }
}
