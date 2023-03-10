package com.oleve2;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    MyService myService = new MyService();
    System.out.println(myService.getMyEntity());
    System.out.println(myService.setMyEntity(new MyEntity("second")));
    System.out.println(myService.getMyEntity());
  }
}