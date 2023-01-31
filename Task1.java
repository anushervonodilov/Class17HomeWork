package com.class17HomeWork;

public class Task1 {

//    Write a java class that will have a constructor: one with parameters and second without any parameters.
//    Create a separate Test class where you will execute both of the constructors 1 by 1.

    String name;

    Task1() {
        System.out.println("This constructor doesn't have a parameter");
    }

    Task1(String isName) {
        System.out.println("The name is " + isName);
    }

}
